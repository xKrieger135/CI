grammar buchstabenRaetselGrammatik;

start : zeile1 zeile2 zeile3 zeile4 zeile5;
zeile1 : BUCHSTABEN MATHEOPERATOR BUCHSTABEN GLEICH BUCHSTABEN;
zeile2 : MATHEOPERATOR MATHEOPERATOR MATHEOPERATOR;
zeile3 : BUCHSTABEN MATHEOPERATOR BUCHSTABEN GLEICH BUCHSTABEN;
zeile4 : GLEICH GLEICH GLEICH;
zeile5 : BUCHSTABEN MATHEOPERATOR BUCHSTABEN GLEICH BUCHSTABEN;

BUCHSTABEN : ('A'..'Z')+;
MATHEOPERATOR :	'+' | '-';
GLEICH 	: '=';
