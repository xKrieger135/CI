grammar raetselSmall;

start : zeile operatorline zeile equalline zeile;
zeile  : BUCHSTABEN MATHEOPERATOR BUCHSTABEN GLEICH BUCHSTABEN;
operatorline : MATHEOPERATOR MATHEOPERATOR MATHEOPERATOR;

equalline : GLEICH GLEICH GLEICH;


BUCHSTABEN : ('A'..'Z')+;
MATHEOPERATOR :	'+' | '-';
GLEICH 	: '=';
