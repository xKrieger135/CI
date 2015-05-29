tree grammar transformationGrammar;

options{output=AST;
	tokenVocab=RaetselSmall;	
	ASTLabelType=CommonTree;}


	
program 	:	^(SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe);

aufgabe         :	^(PLUS );	