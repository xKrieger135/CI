grammar miniP;

start:

	PROGRAMTOKEN
		initialisierung
	BEGINTOKEN
		programm
	ENDTOKEN;

initialisierung: ;

programm: (anweisung | zuweisung | verzweigung | schleife)*;

zuweisung: IDENTTOKEN ZUWEISUNGSTOKEN



// TOKEN


PROGRAMTOKEN
	: 'program'
	;
	