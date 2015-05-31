tree grammar transformationGrammar;

options{output=AST;
	tokenVocab=RaetselSmall;	
	ASTLabelType=CommonTree;}


	
puzzle 	:	^(SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe);

aufgabe         :		^(GLEICH ^(PLUS ^(BUCHSTABEN BUCHSTABEN)) BUCHSTABEN)
		       |	^(GLEICH ^(MINUS wort1=BUCHSTABEN wort2=BUCHSTABEN) wort3=BUCHSTABEN) -> ^(GLEICH ^(PLUS BUCHSTABEN BUCHSTABEN) BUCHSTABEN);	