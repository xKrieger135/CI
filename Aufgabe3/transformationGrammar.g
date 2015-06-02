tree grammar transformationGrammar;

options{output=AST;
	tokenVocab=RaetselSmall;	
	ASTLabelType=CommonTree;}

	
puzzle 	:	^(SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe);

aufgabe         :		^(GLEICH (^(PLUS wort wort)) wort)
		       |	^(GLEICH ^(MINUS wort1=wort wort2=wort) wort3=wort) -> ^(GLEICH ^(PLUS $wort1 $wort2) $wort2);	
		       
wort	:	^(WORT BUCHSTABEN+);	       