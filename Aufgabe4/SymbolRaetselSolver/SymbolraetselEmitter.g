tree grammar SymbolraetselEmitter;

/*
 * Der SymbolraetselEmitter soll die Symbole einsammeln und speichern
 * Diese Symbole müssen dann später an das Template weitergegeben werden.
 * Die Constraints müssen wie in Aufgabe 3 auch mit beachtet werden.
 * Als Eingabe kommt ein Symbolraetsel mit 6 Aufgaben, die gelöst werden müssen.
 */
 
options {
  	tokenVocab   = RaetselSmall;
  	output       = template;
  	ASTLabelType = CommonTree;
}

@header {
	import java.util.Set;
	import java.util.HashSet;	
	import java.lang.String;
	import java.util.List;
}

// Rückgabe Buchstaben:  Rückgabe ist hier ein Set von Strings, wobei die Strings die einzelnen Buchstaben sind.
// Rückgabe Buchstaben:  Der Set von Strings bietet sich an, da somit keine doppelten Buchstaben vorhanden sein können.
// Rückgabe Buchstaben:  Somit ist jeder Buchstabe nur einmal vorhanden, kann aber öfters verwendet werden.
// Rückgabe Constraints: Ebenfalls benötigt werden die Constraints. Diese müssen auch noch zurückgegeben werden.
puzzle returns [Set<String> buchstaben, Set<String> constraints]
  :  ^(SYMBOLPUZZLE aufgabe1=sammeleSymbole aufgabe2=sammeleSymbole aufgabe3=sammeleSymbole aufgabe4=sammeleSymbole aufgabe5=sammeleSymbole aufgabe6=sammeleSymbole)
  {
  	$buchstaben  = new HashSet<String>();
  	$constraints = new HashSet<String>();
  	
  	$buchstaben.addAll($aufgabe1.gesammelteSymbole);
  	$buchstaben.addAll($aufgabe2.gesammelteSymbole);
  	$buchstaben.addAll($aufgabe3.gesammelteSymbole);
  	$buchstaben.addAll($aufgabe4.gesammelteSymbole);
  	$buchstaben.addAll($aufgabe5.gesammelteSymbole);
  	$buchstaben.addAll($aufgabe6.gesammelteSymbole);
  	
  	$constraints.addAll($aufgabe1.st.toString());  	  	
 	$constraints.addAll($aufgabe2.st.toString());
 	$constraints.addAll($aufgabe3.st.toString());
  	$constraints.addAll($aufgabe4.st.toString());
  	$constraints.addAll($aufgabe5.st.toString());
  	$constraints.addAll($aufgabe6.st.toString());
  }
  // Uebergabe der Symbole und constraints
  -> sums(uebergabeConstraint={$constraints}, uebergabeBuchstaben={$buchstaben});

// Sammele jedes Symbol (Zeichen) ein und speichere es in dem set gesammelteSymbole
// Das @after wird zum Schluss ausgeführt. Deswegen fügt man die einzelnen Zeichen aus den Worten in den SammelSet
// Verwendete Methoden sind aus der Klasse Number
sammeleSymbole returns[Set<String> gesammelteSymbole]
	@after {
		// Initialisierung des Sets (Rückgabeset)
		$gesammelteSymbole = new HashSet<String>();
		$gesammelteSymbole.addAll(wort1.number.getCharacters());
		$gesammelteSymbole.addAll(wort2.number.getCharacters());
		$gesammelteSymbole.addAll(wort3.number.getCharacters());				
		/*List<String> listeMitWorten = new ArrayList<String>();
		listeMitWorten.add(wort1.number.getCharacters());
		listeMitWorten.add(wort2.number.getCharacters());
		listeMitWorten.add(wort3.number.getCharacters());
		
		{
			for(String string : listeMitWorten) {
				for(int i = 0; i < string.length() - 1; i++) {
					$gesammelteSymbole.add(string.charAt(i));
				}
			}
		}*/
	}
  	:  ^(GLEICH (^(PLUS wort1=wort wort2=wort) wort3=wort)) ->
	     sum(ersteswort={$wort1.number}, zweiteswort={$wort2.number}, ergebniswort={$wort3.number});

// Folgende Aenderungen werden hier gemacht:
// Number austauschen durch wort, da wir das Wort als Ergebnis haben wollen.
// Weiterhin wird aber eine Nummer zurückgegeben, da wir ja mit Zahlen addieren.
wort returns [Number number] 
	@after {
		$number = new Number();
		$number.setDigits($buchstaben);
	}
	:  	^(WORT buchstaben+=BUCHSTABEN+);
