// $ANTLR 3.4 C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\transformationGrammar.g 2015-05-31 13:55:01

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class transformationGrammar extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BUCHSTABEN", "GLEICH", "MINUS", "PLUS", "SYMBOLPUZZLE", "WORT"
    };

    public static final int EOF=-1;
    public static final int BUCHSTABEN=4;
    public static final int GLEICH=5;
    public static final int MINUS=6;
    public static final int PLUS=7;
    public static final int SYMBOLPUZZLE=8;
    public static final int WORT=9;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "puzzle", "aufgabe"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public transformationGrammar(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public transformationGrammar(TreeNodeStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,input.getTreeAdaptor());
        setDebugListener(proxy);
        setTreeNodeStream(new DebugTreeNodeStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public transformationGrammar(TreeNodeStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return transformationGrammar.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\transformationGrammar.g"; }


    public static class puzzle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "puzzle"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\transformationGrammar.g:9:1: puzzle : ^( SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe ) ;
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

        try { dbg.enterRule(getGrammarFileName(), "puzzle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 0);

        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\transformationGrammar.g:9:9: ( ^( SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe ) )
            dbg.enterAlt(1);

            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\transformationGrammar.g:9:11: ^( SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(9,11);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            dbg.location(9,13);
            _last = (CommonTree)input.LT(1);
            SYMBOLPUZZLE1=(CommonTree)match(input,SYMBOLPUZZLE,FOLLOW_SYMBOLPUZZLE_in_puzzle38); 
            SYMBOLPUZZLE1_tree = (CommonTree)adaptor.dupNode(SYMBOLPUZZLE1);


            root_1 = (CommonTree)adaptor.becomeRoot(SYMBOLPUZZLE1_tree, root_1);


            match(input, Token.DOWN, null); 
            dbg.location(9,26);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle40);
            aufgabe2=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe2.getTree());

            dbg.location(9,34);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle42);
            aufgabe3=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe3.getTree());

            dbg.location(9,42);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle44);
            aufgabe4=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe4.getTree());

            dbg.location(9,50);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle46);
            aufgabe5=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe5.getTree());

            dbg.location(9,58);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle48);
            aufgabe6=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe6.getTree());

            dbg.location(9,66);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle50);
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
        dbg.location(9, 73);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "puzzle");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "puzzle"


    public static class aufgabe_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aufgabe"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\transformationGrammar.g:11:1: aufgabe : ( ^( GLEICH ^( PLUS ^( BUCHSTABEN BUCHSTABEN ) ) BUCHSTABEN ) | ^( GLEICH ^( MINUS wort1= BUCHSTABEN wort2= BUCHSTABEN ) wort3= BUCHSTABEN ) -> ^( GLEICH ^( PLUS BUCHSTABEN BUCHSTABEN ) BUCHSTABEN ) );
    public final transformationGrammar.aufgabe_return aufgabe() throws RecognitionException {
        transformationGrammar.aufgabe_return retval = new transformationGrammar.aufgabe_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree wort1=null;
        CommonTree wort2=null;
        CommonTree wort3=null;
        CommonTree GLEICH8=null;
        CommonTree PLUS9=null;
        CommonTree BUCHSTABEN10=null;
        CommonTree BUCHSTABEN11=null;
        CommonTree BUCHSTABEN12=null;
        CommonTree GLEICH13=null;
        CommonTree MINUS14=null;

        CommonTree wort1_tree=null;
        CommonTree wort2_tree=null;
        CommonTree wort3_tree=null;
        CommonTree GLEICH8_tree=null;
        CommonTree PLUS9_tree=null;
        CommonTree BUCHSTABEN10_tree=null;
        CommonTree BUCHSTABEN11_tree=null;
        CommonTree BUCHSTABEN12_tree=null;
        CommonTree GLEICH13_tree=null;
        CommonTree MINUS14_tree=null;
        RewriteRuleNodeStream stream_BUCHSTABEN=new RewriteRuleNodeStream(adaptor,"token BUCHSTABEN");
        RewriteRuleNodeStream stream_GLEICH=new RewriteRuleNodeStream(adaptor,"token GLEICH");
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");

        try { dbg.enterRule(getGrammarFileName(), "aufgabe");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\transformationGrammar.g:11:17: ( ^( GLEICH ^( PLUS ^( BUCHSTABEN BUCHSTABEN ) ) BUCHSTABEN ) | ^( GLEICH ^( MINUS wort1= BUCHSTABEN wort2= BUCHSTABEN ) wort3= BUCHSTABEN ) -> ^( GLEICH ^( PLUS BUCHSTABEN BUCHSTABEN ) BUCHSTABEN ) )
            int alt1=2;
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==GLEICH) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==PLUS) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==MINUS) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\transformationGrammar.g:11:20: ^( GLEICH ^( PLUS ^( BUCHSTABEN BUCHSTABEN ) ) BUCHSTABEN )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(11,20);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(11,22);
                    _last = (CommonTree)input.LT(1);
                    GLEICH8=(CommonTree)match(input,GLEICH,FOLLOW_GLEICH_in_aufgabe69); 
                    GLEICH8_tree = (CommonTree)adaptor.dupNode(GLEICH8);


                    root_1 = (CommonTree)adaptor.becomeRoot(GLEICH8_tree, root_1);


                    match(input, Token.DOWN, null); 
                    dbg.location(11,29);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(11,31);
                    _last = (CommonTree)input.LT(1);
                    PLUS9=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_aufgabe72); 
                    PLUS9_tree = (CommonTree)adaptor.dupNode(PLUS9);


                    root_2 = (CommonTree)adaptor.becomeRoot(PLUS9_tree, root_2);


                    match(input, Token.DOWN, null); 
                    dbg.location(11,36);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_3 = _last;
                    CommonTree _first_3 = null;
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    dbg.location(11,38);
                    _last = (CommonTree)input.LT(1);
                    BUCHSTABEN10=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_aufgabe75); 
                    BUCHSTABEN10_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN10);


                    root_3 = (CommonTree)adaptor.becomeRoot(BUCHSTABEN10_tree, root_3);


                    match(input, Token.DOWN, null); 
                    dbg.location(11,49);
                    _last = (CommonTree)input.LT(1);
                    BUCHSTABEN11=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_aufgabe77); 
                    BUCHSTABEN11_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN11);


                    adaptor.addChild(root_3, BUCHSTABEN11_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_2, root_3);
                    _last = _save_last_3;
                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }

                    dbg.location(11,62);
                    _last = (CommonTree)input.LT(1);
                    BUCHSTABEN12=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_aufgabe81); 
                    BUCHSTABEN12_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN12);


                    adaptor.addChild(root_1, BUCHSTABEN12_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\transformationGrammar.g:12:12: ^( GLEICH ^( MINUS wort1= BUCHSTABEN wort2= BUCHSTABEN ) wort3= BUCHSTABEN )
                    {
                    dbg.location(12,12);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(12,14);
                    _last = (CommonTree)input.LT(1);
                    GLEICH13=(CommonTree)match(input,GLEICH,FOLLOW_GLEICH_in_aufgabe96);  
                    stream_GLEICH.add(GLEICH13);


                    match(input, Token.DOWN, null); 
                    dbg.location(12,21);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(12,23);
                    _last = (CommonTree)input.LT(1);
                    MINUS14=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aufgabe99);  
                    stream_MINUS.add(MINUS14);


                    match(input, Token.DOWN, null); 
                    dbg.location(12,34);
                    _last = (CommonTree)input.LT(1);
                    wort1=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_aufgabe103);  
                    stream_BUCHSTABEN.add(wort1);

                    dbg.location(12,51);
                    _last = (CommonTree)input.LT(1);
                    wort2=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_aufgabe107);  
                    stream_BUCHSTABEN.add(wort2);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }

                    dbg.location(12,69);
                    _last = (CommonTree)input.LT(1);
                    wort3=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_aufgabe112);  
                    stream_BUCHSTABEN.add(wort3);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: BUCHSTABEN, BUCHSTABEN, GLEICH, BUCHSTABEN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 12:82: -> ^( GLEICH ^( PLUS BUCHSTABEN BUCHSTABEN ) BUCHSTABEN )
                    {
                        dbg.location(12,85);
                        // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\transformationGrammar.g:12:85: ^( GLEICH ^( PLUS BUCHSTABEN BUCHSTABEN ) BUCHSTABEN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(12,87);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_GLEICH.nextNode()
                        , root_1);

                        dbg.location(12,94);
                        // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\transformationGrammar.g:12:94: ^( PLUS BUCHSTABEN BUCHSTABEN )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(12,96);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PLUS, "PLUS")
                        , root_2);

                        dbg.location(12,101);
                        adaptor.addChild(root_2, 
                        stream_BUCHSTABEN.nextNode()
                        );
                        dbg.location(12,112);
                        adaptor.addChild(root_2, 
                        stream_BUCHSTABEN.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(12,124);
                        adaptor.addChild(root_1, 
                        stream_BUCHSTABEN.nextNode()
                        );

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
        dbg.location(12, 134);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "aufgabe");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "aufgabe"

    // Delegated rules


 

    public static final BitSet FOLLOW_SYMBOLPUZZLE_in_puzzle38 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle40 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle42 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle46 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle48 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aufgabe_in_puzzle50 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GLEICH_in_aufgabe69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_aufgabe72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_aufgabe75 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_aufgabe77 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_aufgabe81 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GLEICH_in_aufgabe96 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_aufgabe99 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_aufgabe103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_aufgabe107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_aufgabe112 = new BitSet(new long[]{0x0000000000000008L});

}