// $ANTLR 3.4 C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g 2015-06-02 09:31:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class RaetselSmallParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public RaetselSmallParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RaetselSmallParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return RaetselSmallParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:10:1: start : all ;
    public final start_return start() throws RecognitionException {
        start_return retval = new start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        all_return all1 =null;



        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:10:7: ( all )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:10:9: all
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_all_in_start37);
            all1=all();

            state._fsp--;

            adaptor.addChild(root_0, all1.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start"


    public static class old_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "old"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:11:1: old : zeile operatorline ! zeile equalline ! zeile ;
    public final old_return old() throws RecognitionException {
        old_return retval = new old_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        zeile_return zeile2 =null;

        operatorline_return operatorline3 =null;

        zeile_return zeile4 =null;

        equalline_return equalline5 =null;

        zeile_return zeile6 =null;



        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:11:4: ( zeile operatorline ! zeile equalline ! zeile )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:11:6: zeile operatorline ! zeile equalline ! zeile
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_zeile_in_old43);
            zeile2=zeile();

            state._fsp--;

            adaptor.addChild(root_0, zeile2.getTree());

            pushFollow(FOLLOW_operatorline_in_old45);
            operatorline3=operatorline();

            state._fsp--;


            pushFollow(FOLLOW_zeile_in_old48);
            zeile4=zeile();

            state._fsp--;

            adaptor.addChild(root_0, zeile4.getTree());

            pushFollow(FOLLOW_equalline_in_old50);
            equalline5=equalline();

            state._fsp--;


            pushFollow(FOLLOW_zeile_in_old53);
            zeile6=zeile();

            state._fsp--;

            adaptor.addChild(root_0, zeile6.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "old"


    public static class zeile_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "zeile"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:12:1: zeile : BUCHSTABEN matheoperator BUCHSTABEN GLEICH BUCHSTABEN -> GLEICH matheoperator ;
    public final zeile_return zeile() throws RecognitionException {
        zeile_return retval = new zeile_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BUCHSTABEN7=null;
        Token BUCHSTABEN9=null;
        Token GLEICH10=null;
        Token BUCHSTABEN11=null;
        matheoperator_return matheoperator8 =null;


        CommonTree BUCHSTABEN7_tree=null;
        CommonTree BUCHSTABEN9_tree=null;
        CommonTree GLEICH10_tree=null;
        CommonTree BUCHSTABEN11_tree=null;
        RewriteRuleTokenStream stream_BUCHSTABEN=new RewriteRuleTokenStream(adaptor,"token BUCHSTABEN");
        RewriteRuleTokenStream stream_GLEICH=new RewriteRuleTokenStream(adaptor,"token GLEICH");
        RewriteRuleSubtreeStream stream_matheoperator=new RewriteRuleSubtreeStream(adaptor,"rule matheoperator");
        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:12:8: ( BUCHSTABEN matheoperator BUCHSTABEN GLEICH BUCHSTABEN -> GLEICH matheoperator )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:12:10: BUCHSTABEN matheoperator BUCHSTABEN GLEICH BUCHSTABEN
            {
            BUCHSTABEN7=(Token)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_zeile61);  
            stream_BUCHSTABEN.add(BUCHSTABEN7);


            pushFollow(FOLLOW_matheoperator_in_zeile63);
            matheoperator8=matheoperator();

            state._fsp--;

            stream_matheoperator.add(matheoperator8.getTree());

            BUCHSTABEN9=(Token)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_zeile65);  
            stream_BUCHSTABEN.add(BUCHSTABEN9);


            GLEICH10=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_zeile67);  
            stream_GLEICH.add(GLEICH10);


            BUCHSTABEN11=(Token)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_zeile69);  
            stream_BUCHSTABEN.add(BUCHSTABEN11);


            // AST REWRITE
            // elements: GLEICH, matheoperator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 12:64: -> GLEICH matheoperator
            {
                adaptor.addChild(root_0, 
                stream_GLEICH.nextNode()
                );

                adaptor.addChild(root_0, stream_matheoperator.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "zeile"


    public static class operatorline_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operatorline"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:13:1: operatorline : matheoperator matheoperator matheoperator ;
    public final operatorline_return operatorline() throws RecognitionException {
        operatorline_return retval = new operatorline_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        matheoperator_return matheoperator12 =null;

        matheoperator_return matheoperator13 =null;

        matheoperator_return matheoperator14 =null;



        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:13:14: ( matheoperator matheoperator matheoperator )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:13:16: matheoperator matheoperator matheoperator
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_matheoperator_in_operatorline83);
            matheoperator12=matheoperator();

            state._fsp--;

            adaptor.addChild(root_0, matheoperator12.getTree());

            pushFollow(FOLLOW_matheoperator_in_operatorline85);
            matheoperator13=matheoperator();

            state._fsp--;

            adaptor.addChild(root_0, matheoperator13.getTree());

            pushFollow(FOLLOW_matheoperator_in_operatorline87);
            matheoperator14=matheoperator();

            state._fsp--;

            adaptor.addChild(root_0, matheoperator14.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operatorline"


    public static class equalline_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalline"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:15:1: equalline : GLEICH GLEICH GLEICH ;
    public final equalline_return equalline() throws RecognitionException {
        equalline_return retval = new equalline_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GLEICH15=null;
        Token GLEICH16=null;
        Token GLEICH17=null;

        CommonTree GLEICH15_tree=null;
        CommonTree GLEICH16_tree=null;
        CommonTree GLEICH17_tree=null;

        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:15:11: ( GLEICH GLEICH GLEICH )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:15:13: GLEICH GLEICH GLEICH
            {
            root_0 = (CommonTree)adaptor.nil();


            GLEICH15=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_equalline95); 
            GLEICH15_tree = 
            (CommonTree)adaptor.create(GLEICH15)
            ;
            adaptor.addChild(root_0, GLEICH15_tree);


            GLEICH16=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_equalline97); 
            GLEICH16_tree = 
            (CommonTree)adaptor.create(GLEICH16)
            ;
            adaptor.addChild(root_0, GLEICH16_tree);


            GLEICH17=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_equalline99); 
            GLEICH17_tree = 
            (CommonTree)adaptor.create(GLEICH17)
            ;
            adaptor.addChild(root_0, GLEICH17_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalline"


    public static class wort_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wort"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:17:1: wort : ( BUCHSTABEN )+ -> ^( WORT ( BUCHSTABEN )+ ) ;
    public final wort_return wort() throws RecognitionException {
        wort_return retval = new wort_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BUCHSTABEN18=null;

        CommonTree BUCHSTABEN18_tree=null;
        RewriteRuleTokenStream stream_BUCHSTABEN=new RewriteRuleTokenStream(adaptor,"token BUCHSTABEN");

        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:17:5: ( ( BUCHSTABEN )+ -> ^( WORT ( BUCHSTABEN )+ ) )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:17:7: ( BUCHSTABEN )+
            {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:17:7: ( BUCHSTABEN )+
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
            	    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:17:7: BUCHSTABEN
            	    {
            	    BUCHSTABEN18=(Token)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_wort106);  
            	    stream_BUCHSTABEN.add(BUCHSTABEN18);


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


            // AST REWRITE
            // elements: BUCHSTABEN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 17:19: -> ^( WORT ( BUCHSTABEN )+ )
            {
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:17:22: ^( WORT ( BUCHSTABEN )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WORT, "WORT")
                , root_1);

                if ( !(stream_BUCHSTABEN.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_BUCHSTABEN.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_BUCHSTABEN.nextNode()
                    );

                }
                stream_BUCHSTABEN.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "wort"


    public static class all_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "all"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:19:1: all : wort1= wort zeichen1= matheoperator wort2= wort GLEICH wort3= wort NEWLINE zeichen4= matheoperator zeichen5= matheoperator zeichen6= matheoperator NEWLINE wort4= wort zeichen2= matheoperator wort5= wort GLEICH wort6= wort NEWLINE GLEICH GLEICH GLEICH NEWLINE wort7= wort zeichen3= matheoperator wort8= wort GLEICH wort9= wort ( NEWLINE )? -> ^( SYMBOLPUZZLE ^( GLEICH ^( $zeichen1 $wort1 $wort2) $wort3) ^( GLEICH ^( $zeichen5 $wort4 $wort5) $wort6) ^( GLEICH ^( $zeichen6 $wort7 $wort8) $wort9) ^( GLEICH ^( $zeichen2 $wort1 $wort4) $wort7) ^( GLEICH ^( $zeichen3 $wort2 $wort5) $wort8) ^( GLEICH ^( $zeichen4 $wort3 $wort6) $wort9) ) ;
    public final all_return all() throws RecognitionException {
        all_return retval = new all_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GLEICH19=null;
        Token NEWLINE20=null;
        Token NEWLINE21=null;
        Token GLEICH22=null;
        Token NEWLINE23=null;
        Token GLEICH24=null;
        Token GLEICH25=null;
        Token GLEICH26=null;
        Token NEWLINE27=null;
        Token GLEICH28=null;
        Token NEWLINE29=null;
        wort_return wort1 =null;

        matheoperator_return zeichen1 =null;

        wort_return wort2 =null;

        wort_return wort3 =null;

        matheoperator_return zeichen4 =null;

        matheoperator_return zeichen5 =null;

        matheoperator_return zeichen6 =null;

        wort_return wort4 =null;

        matheoperator_return zeichen2 =null;

        wort_return wort5 =null;

        wort_return wort6 =null;

        wort_return wort7 =null;

        matheoperator_return zeichen3 =null;

        wort_return wort8 =null;

        wort_return wort9 =null;


        CommonTree GLEICH19_tree=null;
        CommonTree NEWLINE20_tree=null;
        CommonTree NEWLINE21_tree=null;
        CommonTree GLEICH22_tree=null;
        CommonTree NEWLINE23_tree=null;
        CommonTree GLEICH24_tree=null;
        CommonTree GLEICH25_tree=null;
        CommonTree GLEICH26_tree=null;
        CommonTree NEWLINE27_tree=null;
        CommonTree GLEICH28_tree=null;
        CommonTree NEWLINE29_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_GLEICH=new RewriteRuleTokenStream(adaptor,"token GLEICH");
        RewriteRuleSubtreeStream stream_matheoperator=new RewriteRuleSubtreeStream(adaptor,"rule matheoperator");
        RewriteRuleSubtreeStream stream_wort=new RewriteRuleSubtreeStream(adaptor,"rule wort");
        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:19:4: (wort1= wort zeichen1= matheoperator wort2= wort GLEICH wort3= wort NEWLINE zeichen4= matheoperator zeichen5= matheoperator zeichen6= matheoperator NEWLINE wort4= wort zeichen2= matheoperator wort5= wort GLEICH wort6= wort NEWLINE GLEICH GLEICH GLEICH NEWLINE wort7= wort zeichen3= matheoperator wort8= wort GLEICH wort9= wort ( NEWLINE )? -> ^( SYMBOLPUZZLE ^( GLEICH ^( $zeichen1 $wort1 $wort2) $wort3) ^( GLEICH ^( $zeichen5 $wort4 $wort5) $wort6) ^( GLEICH ^( $zeichen6 $wort7 $wort8) $wort9) ^( GLEICH ^( $zeichen2 $wort1 $wort4) $wort7) ^( GLEICH ^( $zeichen3 $wort2 $wort5) $wort8) ^( GLEICH ^( $zeichen4 $wort3 $wort6) $wort9) ) )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:19:7: wort1= wort zeichen1= matheoperator wort2= wort GLEICH wort3= wort NEWLINE zeichen4= matheoperator zeichen5= matheoperator zeichen6= matheoperator NEWLINE wort4= wort zeichen2= matheoperator wort5= wort GLEICH wort6= wort NEWLINE GLEICH GLEICH GLEICH NEWLINE wort7= wort zeichen3= matheoperator wort8= wort GLEICH wort9= wort ( NEWLINE )?
            {
            pushFollow(FOLLOW_wort_in_all126);
            wort1=wort();

            state._fsp--;

            stream_wort.add(wort1.getTree());

            pushFollow(FOLLOW_matheoperator_in_all130);
            zeichen1=matheoperator();

            state._fsp--;

            stream_matheoperator.add(zeichen1.getTree());

            pushFollow(FOLLOW_wort_in_all134);
            wort2=wort();

            state._fsp--;

            stream_wort.add(wort2.getTree());

            GLEICH19=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_all136);  
            stream_GLEICH.add(GLEICH19);


            pushFollow(FOLLOW_wort_in_all140);
            wort3=wort();

            state._fsp--;

            stream_wort.add(wort3.getTree());

            NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_all142);  
            stream_NEWLINE.add(NEWLINE20);


            pushFollow(FOLLOW_matheoperator_in_all148);
            zeichen4=matheoperator();

            state._fsp--;

            stream_matheoperator.add(zeichen4.getTree());

            pushFollow(FOLLOW_matheoperator_in_all152);
            zeichen5=matheoperator();

            state._fsp--;

            stream_matheoperator.add(zeichen5.getTree());

            pushFollow(FOLLOW_matheoperator_in_all156);
            zeichen6=matheoperator();

            state._fsp--;

            stream_matheoperator.add(zeichen6.getTree());

            NEWLINE21=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_all158);  
            stream_NEWLINE.add(NEWLINE21);


            pushFollow(FOLLOW_wort_in_all164);
            wort4=wort();

            state._fsp--;

            stream_wort.add(wort4.getTree());

            pushFollow(FOLLOW_matheoperator_in_all168);
            zeichen2=matheoperator();

            state._fsp--;

            stream_matheoperator.add(zeichen2.getTree());

            pushFollow(FOLLOW_wort_in_all172);
            wort5=wort();

            state._fsp--;

            stream_wort.add(wort5.getTree());

            GLEICH22=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_all174);  
            stream_GLEICH.add(GLEICH22);


            pushFollow(FOLLOW_wort_in_all178);
            wort6=wort();

            state._fsp--;

            stream_wort.add(wort6.getTree());

            NEWLINE23=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_all180);  
            stream_NEWLINE.add(NEWLINE23);


            GLEICH24=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_all184);  
            stream_GLEICH.add(GLEICH24);


            GLEICH25=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_all189);  
            stream_GLEICH.add(GLEICH25);


            GLEICH26=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_all195);  
            stream_GLEICH.add(GLEICH26);


            NEWLINE27=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_all197);  
            stream_NEWLINE.add(NEWLINE27);


            pushFollow(FOLLOW_wort_in_all203);
            wort7=wort();

            state._fsp--;

            stream_wort.add(wort7.getTree());

            pushFollow(FOLLOW_matheoperator_in_all207);
            zeichen3=matheoperator();

            state._fsp--;

            stream_matheoperator.add(zeichen3.getTree());

            pushFollow(FOLLOW_wort_in_all211);
            wort8=wort();

            state._fsp--;

            stream_wort.add(wort8.getTree());

            GLEICH28=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_all213);  
            stream_GLEICH.add(GLEICH28);


            pushFollow(FOLLOW_wort_in_all217);
            wort9=wort();

            state._fsp--;

            stream_wort.add(wort9.getTree());

            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:23:66: ( NEWLINE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:23:66: NEWLINE
                    {
                    NEWLINE29=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_all219);  
                    stream_NEWLINE.add(NEWLINE29);


                    }
                    break;

            }


            // AST REWRITE
            // elements: wort6, wort4, wort1, wort3, wort8, wort9, GLEICH, wort3, zeichen4, GLEICH, GLEICH, wort5, wort2, zeichen6, GLEICH, wort7, wort8, wort1, zeichen5, wort4, wort2, GLEICH, wort9, zeichen3, wort7, zeichen1, GLEICH, wort5, zeichen2, wort6
            // token labels: 
            // rule labels: retval, zeichen1, zeichen3, zeichen2, wort1, wort3, wort2, wort5, wort4, wort7, zeichen5, wort6, zeichen4, wort9, wort8, zeichen6
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_zeichen1=new RewriteRuleSubtreeStream(adaptor,"rule zeichen1",zeichen1!=null?zeichen1.tree:null);
            RewriteRuleSubtreeStream stream_zeichen3=new RewriteRuleSubtreeStream(adaptor,"rule zeichen3",zeichen3!=null?zeichen3.tree:null);
            RewriteRuleSubtreeStream stream_zeichen2=new RewriteRuleSubtreeStream(adaptor,"rule zeichen2",zeichen2!=null?zeichen2.tree:null);
            RewriteRuleSubtreeStream stream_wort1=new RewriteRuleSubtreeStream(adaptor,"rule wort1",wort1!=null?wort1.tree:null);
            RewriteRuleSubtreeStream stream_wort3=new RewriteRuleSubtreeStream(adaptor,"rule wort3",wort3!=null?wort3.tree:null);
            RewriteRuleSubtreeStream stream_wort2=new RewriteRuleSubtreeStream(adaptor,"rule wort2",wort2!=null?wort2.tree:null);
            RewriteRuleSubtreeStream stream_wort5=new RewriteRuleSubtreeStream(adaptor,"rule wort5",wort5!=null?wort5.tree:null);
            RewriteRuleSubtreeStream stream_wort4=new RewriteRuleSubtreeStream(adaptor,"rule wort4",wort4!=null?wort4.tree:null);
            RewriteRuleSubtreeStream stream_wort7=new RewriteRuleSubtreeStream(adaptor,"rule wort7",wort7!=null?wort7.tree:null);
            RewriteRuleSubtreeStream stream_zeichen5=new RewriteRuleSubtreeStream(adaptor,"rule zeichen5",zeichen5!=null?zeichen5.tree:null);
            RewriteRuleSubtreeStream stream_wort6=new RewriteRuleSubtreeStream(adaptor,"rule wort6",wort6!=null?wort6.tree:null);
            RewriteRuleSubtreeStream stream_zeichen4=new RewriteRuleSubtreeStream(adaptor,"rule zeichen4",zeichen4!=null?zeichen4.tree:null);
            RewriteRuleSubtreeStream stream_wort9=new RewriteRuleSubtreeStream(adaptor,"rule wort9",wort9!=null?wort9.tree:null);
            RewriteRuleSubtreeStream stream_wort8=new RewriteRuleSubtreeStream(adaptor,"rule wort8",wort8!=null?wort8.tree:null);
            RewriteRuleSubtreeStream stream_zeichen6=new RewriteRuleSubtreeStream(adaptor,"rule zeichen6",zeichen6!=null?zeichen6.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 24:3: -> ^( SYMBOLPUZZLE ^( GLEICH ^( $zeichen1 $wort1 $wort2) $wort3) ^( GLEICH ^( $zeichen5 $wort4 $wort5) $wort6) ^( GLEICH ^( $zeichen6 $wort7 $wort8) $wort9) ^( GLEICH ^( $zeichen2 $wort1 $wort4) $wort7) ^( GLEICH ^( $zeichen3 $wort2 $wort5) $wort8) ^( GLEICH ^( $zeichen4 $wort3 $wort6) $wort9) )
            {
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:25:3: ^( SYMBOLPUZZLE ^( GLEICH ^( $zeichen1 $wort1 $wort2) $wort3) ^( GLEICH ^( $zeichen5 $wort4 $wort5) $wort6) ^( GLEICH ^( $zeichen6 $wort7 $wort8) $wort9) ^( GLEICH ^( $zeichen2 $wort1 $wort4) $wort7) ^( GLEICH ^( $zeichen3 $wort2 $wort5) $wort8) ^( GLEICH ^( $zeichen4 $wort3 $wort6) $wort9) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SYMBOLPUZZLE, "SYMBOLPUZZLE")
                , root_1);

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:25:19: ^( GLEICH ^( $zeichen1 $wort1 $wort2) $wort3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_GLEICH.nextNode()
                , root_2);

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:25:28: ^( $zeichen1 $wort1 $wort2)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_zeichen1.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort1.nextTree());

                adaptor.addChild(root_3, stream_wort2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort3.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:26:7: ^( GLEICH ^( $zeichen5 $wort4 $wort5) $wort6)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_GLEICH.nextNode()
                , root_2);

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:26:16: ^( $zeichen5 $wort4 $wort5)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_zeichen5.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort4.nextTree());

                adaptor.addChild(root_3, stream_wort5.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort6.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:27:7: ^( GLEICH ^( $zeichen6 $wort7 $wort8) $wort9)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_GLEICH.nextNode()
                , root_2);

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:27:16: ^( $zeichen6 $wort7 $wort8)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_zeichen6.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort7.nextTree());

                adaptor.addChild(root_3, stream_wort8.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort9.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:28:7: ^( GLEICH ^( $zeichen2 $wort1 $wort4) $wort7)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_GLEICH.nextNode()
                , root_2);

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:28:16: ^( $zeichen2 $wort1 $wort4)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_zeichen2.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort1.nextTree());

                adaptor.addChild(root_3, stream_wort4.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort7.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:29:7: ^( GLEICH ^( $zeichen3 $wort2 $wort5) $wort8)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_GLEICH.nextNode()
                , root_2);

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:29:16: ^( $zeichen3 $wort2 $wort5)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_zeichen3.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort2.nextTree());

                adaptor.addChild(root_3, stream_wort5.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort8.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:30:7: ^( GLEICH ^( $zeichen4 $wort3 $wort6) $wort9)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_GLEICH.nextNode()
                , root_2);

                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:30:16: ^( $zeichen4 $wort3 $wort6)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_zeichen4.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort3.nextTree());

                adaptor.addChild(root_3, stream_wort6.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort9.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "all"


    public static class matheoperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "matheoperator"
    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:32:1: matheoperator : ( PLUS | MINUS ) ;
    public final matheoperator_return matheoperator() throws RecognitionException {
        matheoperator_return retval = new matheoperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set30=null;

        CommonTree set30_tree=null;

        try {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:33:2: ( ( PLUS | MINUS ) )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set30=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set30)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "matheoperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_all_in_start37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zeile_in_old43 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_operatorline_in_old45 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_zeile_in_old48 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_equalline_in_old50 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_zeile_in_old53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_zeile61 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_matheoperator_in_zeile63 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_zeile65 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_GLEICH_in_zeile67 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_zeile69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matheoperator_in_operatorline83 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_matheoperator_in_operatorline85 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_matheoperator_in_operatorline87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GLEICH_in_equalline95 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_GLEICH_in_equalline97 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_GLEICH_in_equalline99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_wort106 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_wort_in_all126 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_matheoperator_in_all130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_wort_in_all134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_GLEICH_in_all136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_wort_in_all140 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_all142 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_matheoperator_in_all148 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_matheoperator_in_all152 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_matheoperator_in_all156 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_all158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_wort_in_all164 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_matheoperator_in_all168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_wort_in_all172 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_GLEICH_in_all174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_wort_in_all178 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_all180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_GLEICH_in_all184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_GLEICH_in_all189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_GLEICH_in_all195 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_all197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_wort_in_all203 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_matheoperator_in_all207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_wort_in_all211 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_GLEICH_in_all213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_wort_in_all217 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_all219 = new BitSet(new long[]{0x0000000000000002L});

}