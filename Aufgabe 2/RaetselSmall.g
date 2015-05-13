grammar RaetselSmall;

options{
	ASTLabelType=CommonTree;
	output=AST;}
tokens{
	SYMBOLPUZZLE;
	WORT;}

start : all;
old: zeile operatorline! zeile equalline! zeile;
zeile  : BUCHSTABEN MATHEOPERATOR BUCHSTABEN GLEICH BUCHSTABEN -> GLEICH MATHEOPERATOR ;
operatorline : MATHEOPERATOR MATHEOPERATOR MATHEOPERATOR;

equalline : GLEICH GLEICH GLEICH;

wort: BUCHSTABEN+ -> ^(WORT BUCHSTABEN+);

all: 	wort1=wort zeichen1=MATHEOPERATOR wort2=wort GLEICH wort3=wort
		zeichen4=MATHEOPERATOR zeichen5=MATHEOPERATOR zeichen6=MATHEOPERATOR 
		wort4=wort zeichen2=MATHEOPERATOR wort5=wort GLEICH wort6=wort
		GLEICH GLEICH GLEICH
		wort7=wort zeichen3=MATHEOPERATOR wort8=wort GLEICH wort9=wort
		->
		^(SYMBOLPUZZLE 	^(GLEICH ^($zeichen1 $wort1 $wort2) $wort3) 
						^(GLEICH ^($zeichen5 $wort4 $wort5) $wort6) 
						^(GLEICH ^($zeichen6 $wort7 $wort8) $wort9)
						^(GLEICH ^($zeichen2 $wort1 $wort4) $wort7) 
						^(GLEICH ^($zeichen3 $wort2 $wort5) $wort8) 
						^(GLEICH ^($zeichen4 $wort3 $wort6) $wort9));
		
BUCHSTABEN : ('A'..'Z');
MATHEOPERATOR :	'+' | '-';
GLEICH 	: '=';
