grammar miniP;

start:

	PROGRAMTOKEN
		initialisierung*
	BEGINTOKEN
		programm
 	ENDTOKEN;

initialisierung: (STRING|BOOLEAN|REAL|INTEGER) IDENTTOKEN(KOMMATOKEN IDENTTOKEN)* ENDLINETOKEN;

programm: (zuweisung | verzweigung | schleife)*;

zuweisung: IDENTTOKEN ZUWEISUNGSTOKEN zuweisungswert ENDLINETOKEN;
zuweisungswert: (INTTOKEN | real | STRINGTOKEN | BOOLEANTOKEN | ergebnis);

ergebnis: KLAMMERAUFTOKEN rechnung KLAMMERZUTOKEN; //ToDo Rechenoperationen richtig?
rechnung:   punktRechnung (PLUSMINUS punktRechnung)*; 

punktRechnung:   zahl (MALGETEILT zahl)*;
zahl: INTTOKEN | real;

verzweigung: IFTOKEN vergleich THENTOKEN programm (ELSETOKEN programm)? FITOKEN;

vergleich: (wert | IDENTTOKEN) OPERATORENTOKEN (wert | IDENTTOKEN);
wert: (STRINGTOKEN | zahl);

schleife:	WHILETOKEN vergleich DOTOKEN programm ODTOKEN;

real	:	INTTOKEN REALSEPERATOR UINTTOKEN;


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
INTTOKEN:		 PLUSMINUS? UINTTOKEN;
UINTTOKEN:		 ('0'..'9')+;
//REALTOKEN:		INTTOKEN REALSEPERATOR INTTOKEN;
REALSEPERATOR:		'.';
BOOLEANTOKEN: 		('true'|'false');
STRINGTOKEN:		'(\'' (options {greedy=false;} : .)* '\')';
PLUSMINUS:		('+'|'-');
MALGETEILT:		('*'|'/');
OPERATORENTOKEN:	('<'|'>'|'='|'!='|'<='|'>=');
KLAMMERAUFTOKEN:	'(';
KLAMMERZUTOKEN:		')';
KOMMATOKEN:		',';	

STRING	:	'string';
BOOLEAN	:	'boolean';
INTEGER :	'integer';
REAL 	:	'real';

IDENTTOKEN: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|('0'..'9')|'_')*; //Buchstaben vorne danach Buchstaben und Zahlen