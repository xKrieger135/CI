// $ANTLR 3.4 D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\transformationGrammar.g 2015-06-01 16:38:34

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class transformationGrammar extends TreeParser {
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
    public String getGrammarFileName() { return "D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\transformationGrammar.g"; }


    public static class puzzle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "puzzle"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\transformationGrammar.g:9:1: puzzle : ^( SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe ) ;
    public final puzzle_return puzzle() throws RecognitionException {
        puzzle_return retval = new puzzle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SYMBOLPUZZLE1=null;
        aufgabe_return aufgabe2 =null;

        aufgabe_return aufgabe3 =null;

        aufgabe_return aufgabe4 =null;

        aufgabe_return aufgabe5 =null;

        aufgabe_return aufgabe6 =null;

        aufgabe_return aufgabe7 =null;


        CommonTree SYMBOLPUZZLE1_tree=null;

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\transformationGrammar.g:9:9: ( ^( SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe ) )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\transformationGrammar.g:9:11: ^( SYMBOLPUZZLE aufgabe aufgabe aufgabe aufgabe aufgabe aufgabe )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SYMBOLPUZZLE1=(CommonTree)match(input,SYMBOLPUZZLE,FOLLOW_SYMBOLPUZZLE_in_puzzle38); 
            SYMBOLPUZZLE1_tree = (CommonTree)adaptor.dupNode(SYMBOLPUZZLE1);


            root_1 = (CommonTree)adaptor.becomeRoot(SYMBOLPUZZLE1_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle40);
            aufgabe2=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle42);
            aufgabe3=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle44);
            aufgabe4=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle46);
            aufgabe5=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_aufgabe_in_puzzle48);
            aufgabe6=aufgabe();

            state._fsp--;

            adaptor.addChild(root_1, aufgabe6.getTree());


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
        return retval;
    }
    // $ANTLR end "puzzle"


    public static class aufgabe_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aufgabe"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\transformationGrammar.g:11:1: aufgabe : ( ^( GLEICH ^( PLUS ^( BUCHSTABEN BUCHSTABEN ) ) BUCHSTABEN ) | ^( GLEICH ^( MINUS wort1= BUCHSTABEN wort2= BUCHSTABEN ) wort3= BUCHSTABEN ) -> ^( GLEICH ^( PLUS BUCHSTABEN BUCHSTABEN ) BUCHSTABEN ) );
    public final aufgabe_return aufgabe() throws RecognitionException {
        aufgabe_return retval = new aufgabe_return();
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

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\transformationGrammar.g:11:17: ( ^( GLEICH ^( PLUS ^( BUCHSTABEN BUCHSTABEN ) ) BUCHSTABEN ) | ^( GLEICH ^( MINUS wort1= BUCHSTABEN wort2= BUCHSTABEN ) wort3= BUCHSTABEN ) -> ^( GLEICH ^( PLUS BUCHSTABEN BUCHSTABEN ) BUCHSTABEN ) )
            int alt1=2;
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
                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\transformationGrammar.g:11:20: ^( GLEICH ^( PLUS ^( BUCHSTABEN BUCHSTABEN ) ) BUCHSTABEN )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GLEICH8=(CommonTree)match(input,GLEICH,FOLLOW_GLEICH_in_aufgabe69); 
                    GLEICH8_tree = (CommonTree)adaptor.dupNode(GLEICH8);


                    root_1 = (CommonTree)adaptor.becomeRoot(GLEICH8_tree, root_1);


                    match(input, Token.DOWN, null); 
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
                    {
                    CommonTree _save_last_3 = _last;
                    CommonTree _first_3 = null;
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BUCHSTABEN10=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_aufgabe75); 
                    BUCHSTABEN10_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN10);


                    root_3 = (CommonTree)adaptor.becomeRoot(BUCHSTABEN10_tree, root_3);


                    match(input, Token.DOWN, null); 
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
                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\transformationGrammar.g:12:12: ^( GLEICH ^( MINUS wort1= BUCHSTABEN wort2= BUCHSTABEN ) wort3= BUCHSTABEN )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GLEICH13=(CommonTree)match(input,GLEICH,FOLLOW_GLEICH_in_aufgabe96);  
                    stream_GLEICH.add(GLEICH13);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS14=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aufgabe99);  
                    stream_MINUS.add(MINUS14);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    wort1=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_aufgabe103);  
                    stream_BUCHSTABEN.add(wort1);


                    _last = (CommonTree)input.LT(1);
                    wort2=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_aufgabe107);  
                    stream_BUCHSTABEN.add(wort2);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    wort3=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_aufgabe112);  
                    stream_BUCHSTABEN.add(wort3);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: BUCHSTABEN, BUCHSTABEN, BUCHSTABEN, GLEICH
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
                        // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\transformationGrammar.g:12:85: ^( GLEICH ^( PLUS BUCHSTABEN BUCHSTABEN ) BUCHSTABEN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_GLEICH.nextNode()
                        , root_1);

                        // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\transformationGrammar.g:12:94: ^( PLUS BUCHSTABEN BUCHSTABEN )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PLUS, "PLUS")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_BUCHSTABEN.nextNode()
                        );

                        adaptor.addChild(root_2, 
                        stream_BUCHSTABEN.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

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