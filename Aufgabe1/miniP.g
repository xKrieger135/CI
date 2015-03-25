grammar miniP;

start:

	PROGRAMTOKEN
		initialisierung
	BEGINTOKEN
		programm
	ENDTOKEN;

initialisierung: ;

programm: (anweisung | zuweisung | verzweigung | schleife)*;

zuweisung: IDENTTOKEN ZUWEISUNGSTOKEN;



// TOKEN


PROGRAMTOKEN : 'program';
BEGINTOKEN   : 'begin';
ENDTOKEN     : 'end';


// Symbole

ID           : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;	
KONSTANTEN   : INTEGER | REAL | STRING | BOOLEAN;
INTEGER      : '+' | '-' ('0'..'9')+;		
STRING 	     : ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;		
BOOLEAN      : 'true' | 'false';	

// Noch richtig machen die REAL Zahl
REAL         : ;

OPERATOREN   :  ',' | ';' | ':=';
RECHNUGSOPERATOREN  :	'+' | '-' | '*' | '/';

VERGLEICHSOPERATOREN
	:	'=' | '<>' | '<' | '>' | '<=' | '>=';
KLAMMERAUF 
	:	'(';
KLAMMERZU 
	:	')';		

// Deklarationen 

// Schlüsselworte

WHILE 	:	'while';
DO 	:	'do';
OD 	:	'od';
IF 	:	'if';
THEN 	:	'then';
ELSE 	:	'else';
READ 	:	'read';
PRINT 	:	'println';


		


 
	