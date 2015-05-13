grammar miniP;


options {  
  output=AST; 
  ASTLabelType=CommonTree;
}
tokens {DECLARATIONS;DECLARATION;THEN;ELSE;}

start:

	PROGRAMTOKEN!
		initialisierung
	BEGINTOKEN!
		programm
 	ENDTOKEN!;
 	

initialisierung: typinit -> ^(DECLARATION typinit);

typinit	:	typinitialisierung*;
typinitialisierung
	:	d=datentyp c+=IDENTTOKEN(KOMMATOKEN c+=IDENTTOKEN)* ENDLINETOKEN -> ^($d ^($c))*;
	

programm: (zuweisung | verzweigung | schleife | anweisung)*;

zuweisung: IDENTTOKEN ZUWEISUNGSTOKEN zuweisungswert ENDLINETOKEN -> ^(ZUWEISUNGSTOKEN IDENTTOKEN zuweisungswert);
zuweisungswert: (zahl | STRINGTOKEN | BOOLEANTOKEN | ergebnis);

ergebnis: KLAMMERAUFTOKEN rechnung KLAMMERZUTOKEN -> rechnung; //ToDo Rechenoperationen richtig?
rechnung:   punktRechnung (klammerrechnung|(PLUSMINUS^ punktRechnung))*; 

klammerrechnung:	(PLUSMINUS^ KLAMMERAUFTOKEN rechnung KLAMMERZUTOKEN);

punktRechnung:   (IDENTTOKEN | zahl) (MALGETEILT^ (zahl | IDENTTOKEN))*;
zahl: INTTOKEN | real | UINTTOKEN;

verzweigung: IFTOKEN vergleich THENTOKEN programm (ELSETOKEN programm)? FITOKEN -> ^(IFTOKEN vergleich ^(THEN programm)  ^(ELSE programm)?);

vergleich: (wert | IDENTTOKEN) OPERATORENTOKEN^ (wert | IDENTTOKEN);
wert: (STRINGTOKEN | zahl);

schleife:	WHILETOKEN vergleich DOTOKEN programm ODTOKEN -> ^(WHILETOKEN vergleich programm);

real	:	/*(INTTOKEN | UINTTOKEN) REALSEPERATOR UINTTOKEN? */ REALTOKEN;


anweisung:	readanweisung | printanweisung;

readanweisung:	READTOKEN KLAMMERAUFTOKEN (IDENTTOKEN -> ^(READTOKEN IDENTTOKEN)) KLAMMERZUTOKEN ENDLINETOKEN;	

printanweisung:	PRINTLNTOKEN KLAMMERAUFTOKEN (
		IDENTTOKEN  ->  ^(PRINTLNTOKEN IDENTTOKEN) | 
		STRINGTOKEN ->  ^(PRINTLNTOKEN STRINGTOKEN)) KLAMMERZUTOKEN ENDLINETOKEN;

datentyp:	(STRING|BOOLEAN|REAL|INTEGER);

// TOKEN


PROGRAMTOKEN: 	'program';
BEGINTOKEN: 	'begin';
ENDTOKEN: 		'end';
IFTOKEN:		'if';
ELSETOKEN:		'else';
THENTOKEN:		'then';
FITOKEN:		'fi';
WHILETOKEN:		'while';
DOTOKEN	:		'do';
ODTOKEN	:		'od';	
ZUWEISUNGSTOKEN:	':=';
ENDLINETOKEN:		';';
INTTOKEN:		 PLUSMINUS UINTTOKEN;
UINTTOKEN:		 ('0'..'9')+;
REALTOKEN:		PLUSMINUS? UINTTOKEN REALSEPERATOR UINTTOKEN;
REALSEPERATOR:		'.';
BOOLEANTOKEN: 		('true'|'false');
STRINGTOKEN:		'(\'' (options {greedy=false;} : .)* '\')';
PLUSMINUS:		('+'|'-');
MALGETEILT:		('*'|'/');
OPERATORENTOKEN:	('<'|'>'|'='|'!='|'<='|'>=');
KLAMMERAUFTOKEN:	'(';
KLAMMERZUTOKEN:		')';
KOMMATOKEN:		',';	
READTOKEN:		'read';
PRINTLNTOKEN:		'println';

STRING	:	'string';
BOOLEAN	:	'boolean';
INTEGER :	'integer';
REAL 	:	'real';

IDENTTOKEN: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|('0'..'9')|'_')*; //Buchstaben vorne danach Buchstaben und Zahlen