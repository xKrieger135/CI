// $ANTLR 3.4 D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g 2015-06-18 20:03:05

	import java.util.Set;
	import java.util.HashSet;	
	import java.lang.String;
	import java.util.List;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselEmitter extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BUCHSTABEN", "GLEICH", "MINUS", "NEWLINE", "PLUS", "SYMBOLPUZZLE", "WORT", "WS"
    };

    public static final int EOF=-1;
    public static final int BUCHSTABEN=4;
    public static final int GLEICH=5;
    public static final int MINUS=6;
    public static final int NEWLINE=7;
    public static final int PLUS=8;
    public static final int SYMBOLPUZZLE=9;
    public static final int WORT=10;
    public static final int WS=11;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SymbolraetselEmitter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselEmitter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SymbolraetselEmitterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return SymbolraetselEmitter.tokenNames; }
    public String getGrammarFileName() { return "D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g"; }


    public static class puzzle_return extends TreeRuleReturnScope {
        public Set<String> buchstaben;
        public Set<String> constraints;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "puzzle"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:27:1: puzzle returns [Set<String> buchstaben, Set<String> constraints] : ^( SYMBOLPUZZLE aufgabe1= sammeleSymbole aufgabe2= sammeleSymbole aufgabe3= sammeleSymbole aufgabe4= sammeleSymbole aufgabe5= sammeleSymbole aufgabe6= sammeleSymbole ) -> sums(uebergabeConstraint=$constraintsuebergabeBuchstaben=$buchstaben);
    public final SymbolraetselEmitter.puzzle_return puzzle() throws RecognitionException {
        SymbolraetselEmitter.puzzle_return retval = new SymbolraetselEmitter.puzzle_return();
        retval.start = input.LT(1);


        SymbolraetselEmitter.sammeleSymbole_return aufgabe1 =null;

        SymbolraetselEmitter.sammeleSymbole_return aufgabe2 =null;

        SymbolraetselEmitter.sammeleSymbole_return aufgabe3 =null;

        SymbolraetselEmitter.sammeleSymbole_return aufgabe4 =null;

        SymbolraetselEmitter.sammeleSymbole_return aufgabe5 =null;

        SymbolraetselEmitter.sammeleSymbole_return aufgabe6 =null;


        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:28:3: ( ^( SYMBOLPUZZLE aufgabe1= sammeleSymbole aufgabe2= sammeleSymbole aufgabe3= sammeleSymbole aufgabe4= sammeleSymbole aufgabe5= sammeleSymbole aufgabe6= sammeleSymbole ) -> sums(uebergabeConstraint=$constraintsuebergabeBuchstaben=$buchstaben))
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:28:6: ^( SYMBOLPUZZLE aufgabe1= sammeleSymbole aufgabe2= sammeleSymbole aufgabe3= sammeleSymbole aufgabe4= sammeleSymbole aufgabe5= sammeleSymbole aufgabe6= sammeleSymbole )
            {
            match(input,SYMBOLPUZZLE,FOLLOW_SYMBOLPUZZLE_in_puzzle77); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_sammeleSymbole_in_puzzle81);
            aufgabe1=sammeleSymbole();

            state._fsp--;


            pushFollow(FOLLOW_sammeleSymbole_in_puzzle85);
            aufgabe2=sammeleSymbole();

            state._fsp--;


            pushFollow(FOLLOW_sammeleSymbole_in_puzzle89);
            aufgabe3=sammeleSymbole();

            state._fsp--;


            pushFollow(FOLLOW_sammeleSymbole_in_puzzle93);
            aufgabe4=sammeleSymbole();

            state._fsp--;


            pushFollow(FOLLOW_sammeleSymbole_in_puzzle97);
            aufgabe5=sammeleSymbole();

            state._fsp--;


            pushFollow(FOLLOW_sammeleSymbole_in_puzzle101);
            aufgabe6=sammeleSymbole();

            state._fsp--;


            match(input, Token.UP, null); 



              	retval.buchstaben = new HashSet<String>();
              	retval.constraints = new HashSet<String>();
              	
              	retval.buchstaben.addAll((aufgabe1!=null?aufgabe1.gesammelteSymbole:null));
              	retval.buchstaben.addAll((aufgabe2!=null?aufgabe2.gesammelteSymbole:null));
              	retval.buchstaben.addAll((aufgabe3!=null?aufgabe3.gesammelteSymbole:null));
              	retval.buchstaben.addAll((aufgabe4!=null?aufgabe4.gesammelteSymbole:null));
              	retval.buchstaben.addAll((aufgabe5!=null?aufgabe5.gesammelteSymbole:null));
              	retval.buchstaben.addAll((aufgabe6!=null?aufgabe6.gesammelteSymbole:null));
              	
              	retval.constraints.addAll((aufgabe1!=null?aufgabe1.st:null).toString());  	  	
             	retval.constraints.addAll((aufgabe2!=null?aufgabe2.st:null).toString());
             	retval.constraints.addAll((aufgabe3!=null?aufgabe3.st:null).toString());
              	retval.constraints.addAll((aufgabe4!=null?aufgabe4.st:null).toString());
              	retval.constraints.addAll((aufgabe5!=null?aufgabe5.st:null).toString());
              	retval.constraints.addAll((aufgabe6!=null?aufgabe6.st:null).toString());
              

            // TEMPLATE REWRITE
            // 48:3: -> sums(uebergabeConstraint=$constraintsuebergabeBuchstaben=$buchstaben)
            {
                retval.st = templateLib.getInstanceOf("sums",new STAttrMap().put("uebergabeConstraint", retval.constraints).put("uebergabeBuchstaben", retval.buchstaben));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "puzzle"


    public static class sammeleSymbole_return extends TreeRuleReturnScope {
        public Set<String> gesammelteSymbole;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "sammeleSymbole"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:53:1: sammeleSymbole returns [Set<String> gesammelteSymbole] : ^( GLEICH ( ^( PLUS wort1= wort wort2= wort ) wort3= wort ) ) -> sum(ersteswort=$wort1.numberzweiteswort=$wort2.numberergebniswort=$wort3.number);
    public final SymbolraetselEmitter.sammeleSymbole_return sammeleSymbole() throws RecognitionException {
        SymbolraetselEmitter.sammeleSymbole_return retval = new SymbolraetselEmitter.sammeleSymbole_return();
        retval.start = input.LT(1);


        SymbolraetselEmitter.wort_return wort1 =null;

        SymbolraetselEmitter.wort_return wort2 =null;

        SymbolraetselEmitter.wort_return wort3 =null;


        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:73:4: ( ^( GLEICH ( ^( PLUS wort1= wort wort2= wort ) wort3= wort ) ) -> sum(ersteswort=$wort1.numberzweiteswort=$wort2.numberergebniswort=$wort3.number))
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:73:7: ^( GLEICH ( ^( PLUS wort1= wort wort2= wort ) wort3= wort ) )
            {
            match(input,GLEICH,FOLLOW_GLEICH_in_sammeleSymbole150); 

            match(input, Token.DOWN, null); 
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:73:16: ( ^( PLUS wort1= wort wort2= wort ) wort3= wort )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:73:17: ^( PLUS wort1= wort wort2= wort ) wort3= wort
            {
            match(input,PLUS,FOLLOW_PLUS_in_sammeleSymbole154); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_wort_in_sammeleSymbole158);
            wort1=wort();

            state._fsp--;


            pushFollow(FOLLOW_wort_in_sammeleSymbole162);
            wort2=wort();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_wort_in_sammeleSymbole167);
            wort3=wort();

            state._fsp--;


            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 73:60: -> sum(ersteswort=$wort1.numberzweiteswort=$wort2.numberergebniswort=$wort3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("ersteswort", (wort1!=null?wort1.number:null)).put("zweiteswort", (wort2!=null?wort2.number:null)).put("ergebniswort", (wort3!=null?wort3.number:null)));
            }



            }


            		// Initialisierung des Sets (Rückgabeset)
            		retval.gesammelteSymbole = new HashSet<String>();
            		retval.gesammelteSymbole.addAll(wort1.number.getCharacters());
            		retval.gesammelteSymbole.addAll(wort2.number.getCharacters());
            		retval.gesammelteSymbole.addAll(wort3.number.getCharacters());				
            		/*List<String> listeMitWorten = new ArrayList<String>();
            		listeMitWorten.add(wort1.number.getCharacters());
            		listeMitWorten.add(wort2.number.getCharacters());
            		listeMitWorten.add(wort3.number.getCharacters());
            		
            		{
            			for(String string : listeMitWorten) {
            				for(int i = 0; i < string.length() - 1; i++) {
            					retval.gesammelteSymbole.add(string.charAt(i));
            				}
            			}
            		}*/
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sammeleSymbole"


    public static class wort_return extends TreeRuleReturnScope {
        public Number number;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "wort"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:79:1: wort returns [Number number] : ^( WORT (buchstaben+= BUCHSTABEN )+ ) ;
    public final SymbolraetselEmitter.wort_return wort() throws RecognitionException {
        SymbolraetselEmitter.wort_return retval = new SymbolraetselEmitter.wort_return();
        retval.start = input.LT(1);


        CommonTree buchstaben=null;
        List list_buchstaben=null;

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:84:2: ( ^( WORT (buchstaben+= BUCHSTABEN )+ ) )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:84:6: ^( WORT (buchstaben+= BUCHSTABEN )+ )
            {
            match(input,WORT,FOLLOW_WORT_in_wort220); 

            match(input, Token.DOWN, null); 
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:84:23: (buchstaben+= BUCHSTABEN )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BUCHSTABEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe4\\SymbolRaetselSolver\\SymbolraetselEmitter.g:84:23: buchstaben+= BUCHSTABEN
            	    {
            	    buchstaben=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_wort224); 
            	    if (list_buchstaben==null) list_buchstaben=new ArrayList();
            	    list_buchstaben.add(buchstaben);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input, Token.UP, null); 


            }


            		retval.number = new Number();
            		retval.number.setDigits(list_buchstaben);
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "wort"

    // Delegated rules


 

    public static final BitSet FOLLOW_SYMBOLPUZZLE_in_puzzle77 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sammeleSymbole_in_puzzle81 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_sammeleSymbole_in_puzzle85 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_sammeleSymbole_in_puzzle89 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_sammeleSymbole_in_puzzle93 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_sammeleSymbole_in_puzzle97 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_sammeleSymbole_in_puzzle101 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GLEICH_in_sammeleSymbole150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_sammeleSymbole154 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wort_in_sammeleSymbole158 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_wort_in_sammeleSymbole162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_wort_in_sammeleSymbole167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORT_in_wort220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_wort224 = new BitSet(new long[]{0x0000000000000018L});

}