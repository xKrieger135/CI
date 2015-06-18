grammar RaetselSmall;

options{
	ASTLabelType=CommonTree;
	output=AST;}
tokens{
	SYMBOLPUZZLE;
	WORT;}

start :	all;
old: zeile operatorline! zeile equalline! zeile;
zeile  :	BUCHSTABEN matheoperator BUCHSTABEN GLEICH BUCHSTABEN -> GLEICH matheoperator ;
operatorline :	matheoperator matheoperator matheoperator;

equalline :	GLEICH GLEICH GLEICH;

wort: BUCHSTABEN+ -> ^(WORT BUCHSTABEN+);

all:		wort1=wort zeichen1=matheoperator wort2=wort GLEICH wort3=wort NEWLINE
		zeichen4=matheoperator zeichen5=matheoperator zeichen6=matheoperator NEWLINE
		wort4=wort zeichen2=matheoperator wort5=wort GLEICH wort6=wort NEWLINE
		GLEICH 			GLEICH 				GLEICH NEWLINE
		wort7=wort zeichen3=matheoperator wort8=wort GLEICH wort9=wort NEWLINE?
		->
		^(SYMBOLPUZZLE 	^(GLEICH ^($zeichen1 $wort1 $wort2) $wort3) 
						^(GLEICH ^($zeichen5 $wort4 $wort5) $wort6) 
						^(GLEICH ^($zeichen6 $wort7 $wort8) $wort9)
						^(GLEICH ^($zeichen2 $wort1 $wort4) $wort7) 
						^(GLEICH ^($zeichen3 $wort2 $wort5) $wort8) 
						^(GLEICH ^($zeichen4 $wort3 $wort6) $wort9));

matheoperator
	:	(PLUS | MINUS);						
		
BUCHSTABEN : ('A'..'Z');
PLUS	:	'+';
MINUS	:	'-';
GLEICH 	: '=';
WS	:	(' '|'\t'){skip();};
NEWLINE :	'\r'?'\n';

