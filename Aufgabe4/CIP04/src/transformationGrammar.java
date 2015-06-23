// $ANTLR 3.4 C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g 2015-06-23 15:42:13

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class transformationGrammar extends TreeParser {
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


    public transformationGrammar(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public transformationGrammar(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return transformationGrammar.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g"; }


    public static class puzzle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "puzzle"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:8:1: puzzle : ^( SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe ) ;
    public final transformationGrammar.puzzle_return puzzle() throws RecognitionException {
        transformationGrammar.puzzle_return retval = new transformationGrammar.puzzle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SYMBOLPUZZLE1=null;
        transformationGrammar.aufgabe_return aufgabe2 =null;

        transformationGrammar.aufgabe_return aufgabe3 =null;

        transformationGrammar.aufgabe_return aufgabe4 =null;

        transformationGrammar.aufgabe_return aufgabe5 =null;

        transformationGrammar.aufgabe_return aufgabe6 =null;

        transformationGrammar.aufgabe_return aufgabe7 =null;


        CommonTree SYMBOLPUZZLE1_tree=null;

        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:8:9: ( ^( SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe ) )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:8:11: ^( SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SYMBOLPUZZLE1=(CommonTree)match(input,SYMBOLPUZZLE,FOLLOW_SYMBOLPUZZLE_in_puzzle37); 
            SYMBOLPUZZLE1_tree = (CommonTree)adaptor.dupNode(SYMBOLPUZZLE1);


            root_1 = (CommonTree)adaptor.becomeRoot(SYMBOLPUZZLE1_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle39);
            aufgabe2=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle41);
            aufgabe3=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle43);
            aufgabe4=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle45);
            aufgabe5=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle47);
            aufgabe6=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe6.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle49);
            aufgabe7=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe7.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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


    public static class aufgabe_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aufgabe"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:10:1: aufgabe : ( ^( GLEICH ( ^( PLUS wort wort ) ) wort ) | ^( GLEICH ^( MINUS wort1= wort wort2= wort ) wort3= wort ) -> ^( GLEICH ^( PLUS[\"+\"] $wort3 $wort2) $wort1) );
    public final transformationGrammar.aufgabe_return aufgabe() throws RecognitionException {
        transformationGrammar.aufgabe_return retval = new transformationGrammar.aufgabe_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GLEICH8=null;
        CommonTree PLUS9=null;
        CommonTree GLEICH13=null;
        CommonTree MINUS14=null;
        transformationGrammar.wort_return wort1 =null;

        transformationGrammar.wort_return wort2 =null;

        transformationGrammar.wort_return wort3 =null;

        transformationGrammar.wort_return wort10 =null;

        transformationGrammar.wort_return wort11 =null;

        transformationGrammar.wort_return wort12 =null;


        CommonTree GLEICH8_tree=null;
        CommonTree PLUS9_tree=null;
        CommonTree GLEICH13_tree=null;
        CommonTree MINUS14_tree=null;
        RewriteRuleNodeStream stream_GLEICH=new RewriteRuleNodeStream(adaptor,"token GLEICH");
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_wort=new RewriteRuleSubtreeStream(adaptor,"rule wort");
        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:10:17: ( ^( GLEICH ( ^( PLUS wort wort ) ) wort ) | ^( GLEICH ^( MINUS wort1= wort wort2= wort ) wort3= wort ) -> ^( GLEICH ^( PLUS[\"+\"] $wort3 $wort2) $wort1) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GLEICH) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==MINUS) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==PLUS) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:10:20: ^( GLEICH ( ^( PLUS wort wort ) ) wort )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GLEICH8=(CommonTree)match(input,GLEICH,FOLLOW_GLEICH_in_aufgabe68); 
                    GLEICH8_tree = (CommonTree)adaptor.dupNode(GLEICH8);


                    root_1 = (CommonTree)adaptor.becomeRoot(GLEICH8_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:10:29: ( ^( PLUS wort wort ) )
                    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:10:30: ^( PLUS wort wort )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PLUS9=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_aufgabe72); 
                    PLUS9_tree = (CommonTree)adaptor.dupNode(PLUS9);


                    root_2 = (CommonTree)adaptor.becomeRoot(PLUS9_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe74);
                    wort10=wort();

                    state._fsp--;

                    adaptor.addChild(root_2, wort10.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe76);
                    wort11=wort();

                    state._fsp--;

                    adaptor.addChild(root_2, wort11.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe80);
                    wort12=wort();

                    state._fsp--;

                    adaptor.addChild(root_1, wort12.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:11:12: ^( GLEICH ^( MINUS wort1= wort wort2= wort ) wort3= wort )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GLEICH13=(CommonTree)match(input,GLEICH,FOLLOW_GLEICH_in_aufgabe95);  
                    stream_GLEICH.add(GLEICH13);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS14=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aufgabe98);  
                    stream_MINUS.add(MINUS14);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe102);
                    wort1=wort();

                    state._fsp--;

                    stream_wort.add(wort1.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe106);
                    wort2=wort();

                    state._fsp--;

                    stream_wort.add(wort2.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wort_in_aufgabe111);
                    wort3=wort();

                    state._fsp--;

                    stream_wort.add(wort3.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: wort2, wort1, GLEICH, wort3
                    // token labels: 
                    // rule labels: wort1, wort3, wort2, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_wort1=new RewriteRuleSubtreeStream(adaptor,"rule wort1",wort1!=null?wort1.tree:null);
                    RewriteRuleSubtreeStream stream_wort3=new RewriteRuleSubtreeStream(adaptor,"rule wort3",wort3!=null?wort3.tree:null);
                    RewriteRuleSubtreeStream stream_wort2=new RewriteRuleSubtreeStream(adaptor,"rule wort2",wort2!=null?wort2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 11:64: -> ^( GLEICH ^( PLUS[\"+\"] $wort3 $wort2) $wort1)
                    {
                        // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:11:67: ^( GLEICH ^( PLUS[\"+\"] $wort3 $wort2) $wort1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_GLEICH.nextNode()
                        , root_1);

                        // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:11:76: ^( PLUS[\"+\"] $wort3 $wort2)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PLUS, "+")
                        , root_2);

                        adaptor.addChild(root_2, stream_wort3.nextTree());

                        adaptor.addChild(root_2, stream_wort2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_wort1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "aufgabe"


    public static class wort_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wort"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:13:1: wort : ^( WORT ( BUCHSTABEN )+ ) ;
    public final transformationGrammar.wort_return wort() throws RecognitionException {
        transformationGrammar.wort_return retval = new transformationGrammar.wort_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WORT15=null;
        CommonTree BUCHSTABEN16=null;

        CommonTree WORT15_tree=null;
        CommonTree BUCHSTABEN16_tree=null;

        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:13:6: ( ^( WORT ( BUCHSTABEN )+ ) )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:13:8: ^( WORT ( BUCHSTABEN )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORT15=(CommonTree)match(input,WORT,FOLLOW_WORT_in_wort151); 
            WORT15_tree = (CommonTree)adaptor.dupNode(WORT15);


            root_1 = (CommonTree)adaptor.becomeRoot(WORT15_tree, root_1);


            match(input, Token.DOWN, null); 
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:13:15: ( BUCHSTABEN )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==BUCHSTABEN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\transformationGrammar.g:13:15: BUCHSTABEN
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    BUCHSTABEN16=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_wort153); 
            	    BUCHSTABEN16_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN16);


            	    adaptor.addChild(root_1, BUCHSTABEN16_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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


 

    public static final BitSet FOLLOW_SYMBOLPUZZLE_in_puzzle37 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle39 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle41 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle43 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle45 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle47 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle49 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GLEICH_in_aufgabe68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_aufgabe72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wort_in_aufgabe74 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_wort_in_aufgabe76 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_wort_in_aufgabe80 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GLEICH_in_aufgabe95 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_aufgabe98 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wort_in_aufgabe102 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_wort_in_aufgabe106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_wort_in_aufgabe111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORT_in_wort151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_wort153 = new BitSet(new long[]{0x0000000000000018L});

}