// $ANTLR 3.4 D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g 2015-05-29 15:28:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class miniPParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEGINTOKEN", "BOOLEAN", "BOOLEANTOKEN", "DOTOKEN", "ELSETOKEN", "ENDLINETOKEN", "ENDTOKEN", "FITOKEN", "IDENTTOKEN", "IFTOKEN", "INTEGER", "INTTOKEN", "KLAMMERAUFTOKEN", "KLAMMERZUTOKEN", "KOMMATOKEN", "MALGETEILT", "ODTOKEN", "OPERATORENTOKEN", "PLUSMINUS", "PROGRAMTOKEN", "REAL", "REALSEPERATOR", "STRING", "STRINGTOKEN", "THENTOKEN", "UINTTOKEN", "WHILETOKEN", "ZUWEISUNGSTOKEN"
    };

    public static final int EOF=-1;
    public static final int BEGINTOKEN=4;
    public static final int BOOLEAN=5;
    public static final int BOOLEANTOKEN=6;
    public static final int DOTOKEN=7;
    public static final int ELSETOKEN=8;
    public static final int ENDLINETOKEN=9;
    public static final int ENDTOKEN=10;
    public static final int FITOKEN=11;
    public static final int IDENTTOKEN=12;
    public static final int IFTOKEN=13;
    public static final int INTEGER=14;
    public static final int INTTOKEN=15;
    public static final int KLAMMERAUFTOKEN=16;
    public static final int KLAMMERZUTOKEN=17;
    public static final int KOMMATOKEN=18;
    public static final int MALGETEILT=19;
    public static final int ODTOKEN=20;
    public static final int OPERATORENTOKEN=21;
    public static final int PLUSMINUS=22;
    public static final int PROGRAMTOKEN=23;
    public static final int REAL=24;
    public static final int REALSEPERATOR=25;
    public static final int STRING=26;
    public static final int STRINGTOKEN=27;
    public static final int THENTOKEN=28;
    public static final int UINTTOKEN=29;
    public static final int WHILETOKEN=30;
    public static final int ZUWEISUNGSTOKEN=31;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "ergebnis", "zuweisung", "verzweigung", "rechnung", "start", 
    "initialisierung", "vergleich", "punktRechnung", "programm", "zahl", 
    "wert", "schleife", "zuweisungswert", "real"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public miniPParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public miniPParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public miniPParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return miniPParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g"; }



    // $ANTLR start "start"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:3:1: start : PROGRAMTOKEN ( initialisierung )* BEGINTOKEN programm ENDTOKEN ;
    public final void start() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(3, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:3:6: ( PROGRAMTOKEN ( initialisierung )* BEGINTOKEN programm ENDTOKEN )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:5:2: PROGRAMTOKEN ( initialisierung )* BEGINTOKEN programm ENDTOKEN
            {
            dbg.location(5,2);
            match(input,PROGRAMTOKEN,FOLLOW_PROGRAMTOKEN_in_start11); 
            dbg.location(6,3);
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:6:3: ( initialisierung )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOLEAN||LA1_0==INTEGER||LA1_0==REAL||LA1_0==STRING) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:6:3: initialisierung
            	    {
            	    dbg.location(6,3);
            	    pushFollow(FOLLOW_initialisierung_in_start15);
            	    initialisierung();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(7,2);
            match(input,BEGINTOKEN,FOLLOW_BEGINTOKEN_in_start19); 
            dbg.location(8,3);
            pushFollow(FOLLOW_programm_in_start23);
            programm();

            state._fsp--;

            dbg.location(9,3);
            match(input,ENDTOKEN,FOLLOW_ENDTOKEN_in_start27); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(9, 10);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "initialisierung"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:11:1: initialisierung : ( STRING | BOOLEAN | REAL | INTEGER ) IDENTTOKEN ( KOMMATOKEN IDENTTOKEN )* ENDLINETOKEN ;
    public final void initialisierung() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "initialisierung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:11:16: ( ( STRING | BOOLEAN | REAL | INTEGER ) IDENTTOKEN ( KOMMATOKEN IDENTTOKEN )* ENDLINETOKEN )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:11:18: ( STRING | BOOLEAN | REAL | INTEGER ) IDENTTOKEN ( KOMMATOKEN IDENTTOKEN )* ENDLINETOKEN
            {
            dbg.location(11,18);
            if ( input.LA(1)==BOOLEAN||input.LA(1)==INTEGER||input.LA(1)==REAL||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(11,48);
            match(input,IDENTTOKEN,FOLLOW_IDENTTOKEN_in_initialisierung44); 
            dbg.location(11,58);
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:11:58: ( KOMMATOKEN IDENTTOKEN )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==KOMMATOKEN) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:11:59: KOMMATOKEN IDENTTOKEN
            	    {
            	    dbg.location(11,59);
            	    match(input,KOMMATOKEN,FOLLOW_KOMMATOKEN_in_initialisierung46); 
            	    dbg.location(11,70);
            	    match(input,IDENTTOKEN,FOLLOW_IDENTTOKEN_in_initialisierung48); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(11,83);
            match(input,ENDLINETOKEN,FOLLOW_ENDLINETOKEN_in_initialisierung52); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(11, 94);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "initialisierung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "initialisierung"



    // $ANTLR start "programm"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:13:1: programm : ( zuweisung | verzweigung | schleife )* ;
    public final void programm() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "programm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:13:9: ( ( zuweisung | verzweigung | schleife )* )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:13:11: ( zuweisung | verzweigung | schleife )*
            {
            dbg.location(13,11);
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:13:11: ( zuweisung | verzweigung | schleife )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=4;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                switch ( input.LA(1) ) {
                case IDENTTOKEN:
                    {
                    alt3=1;
                    }
                    break;
                case IFTOKEN:
                    {
                    alt3=2;
                    }
                    break;
                case WHILETOKEN:
                    {
                    alt3=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:13:12: zuweisung
            	    {
            	    dbg.location(13,12);
            	    pushFollow(FOLLOW_zuweisung_in_programm60);
            	    zuweisung();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:13:24: verzweigung
            	    {
            	    dbg.location(13,24);
            	    pushFollow(FOLLOW_verzweigung_in_programm64);
            	    verzweigung();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:13:38: schleife
            	    {
            	    dbg.location(13,38);
            	    pushFollow(FOLLOW_schleife_in_programm68);
            	    schleife();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(13, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "programm");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "programm"



    // $ANTLR start "zuweisung"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:15:1: zuweisung : IDENTTOKEN ZUWEISUNGSTOKEN zuweisungswert ENDLINETOKEN ;
    public final void zuweisung() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "zuweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:15:10: ( IDENTTOKEN ZUWEISUNGSTOKEN zuweisungswert ENDLINETOKEN )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:15:12: IDENTTOKEN ZUWEISUNGSTOKEN zuweisungswert ENDLINETOKEN
            {
            dbg.location(15,12);
            match(input,IDENTTOKEN,FOLLOW_IDENTTOKEN_in_zuweisung77); 
            dbg.location(15,23);
            match(input,ZUWEISUNGSTOKEN,FOLLOW_ZUWEISUNGSTOKEN_in_zuweisung79); 
            dbg.location(15,39);
            pushFollow(FOLLOW_zuweisungswert_in_zuweisung81);
            zuweisungswert();

            state._fsp--;

            dbg.location(15,54);
            match(input,ENDLINETOKEN,FOLLOW_ENDLINETOKEN_in_zuweisung83); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(15, 65);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "zuweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "zuweisung"



    // $ANTLR start "zuweisungswert"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:16:1: zuweisungswert : ( INTTOKEN | real | STRINGTOKEN | BOOLEANTOKEN | ergebnis ) ;
    public final void zuweisungswert() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "zuweisungswert");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:16:15: ( ( INTTOKEN | real | STRINGTOKEN | BOOLEANTOKEN | ergebnis ) )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:16:17: ( INTTOKEN | real | STRINGTOKEN | BOOLEANTOKEN | ergebnis )
            {
            dbg.location(16,17);
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:16:17: ( INTTOKEN | real | STRINGTOKEN | BOOLEANTOKEN | ergebnis )
            int alt4=5;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            switch ( input.LA(1) ) {
            case INTTOKEN:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==REALSEPERATOR) ) {
                    alt4=2;
                }
                else if ( (LA4_1==ENDLINETOKEN) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case STRINGTOKEN:
                {
                alt4=3;
                }
                break;
            case BOOLEANTOKEN:
                {
                alt4=4;
                }
                break;
            case KLAMMERAUFTOKEN:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:16:18: INTTOKEN
                    {
                    dbg.location(16,18);
                    match(input,INTTOKEN,FOLLOW_INTTOKEN_in_zuweisungswert90); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:16:29: real
                    {
                    dbg.location(16,29);
                    pushFollow(FOLLOW_real_in_zuweisungswert94);
                    real();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:16:36: STRINGTOKEN
                    {
                    dbg.location(16,36);
                    match(input,STRINGTOKEN,FOLLOW_STRINGTOKEN_in_zuweisungswert98); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:16:50: BOOLEANTOKEN
                    {
                    dbg.location(16,50);
                    match(input,BOOLEANTOKEN,FOLLOW_BOOLEANTOKEN_in_zuweisungswert102); 

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:16:65: ergebnis
                    {
                    dbg.location(16,65);
                    pushFollow(FOLLOW_ergebnis_in_zuweisungswert106);
                    ergebnis();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(16, 73);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "zuweisungswert");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "zuweisungswert"



    // $ANTLR start "ergebnis"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:18:1: ergebnis : KLAMMERAUFTOKEN rechnung KLAMMERZUTOKEN ;
    public final void ergebnis() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "ergebnis");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:18:9: ( KLAMMERAUFTOKEN rechnung KLAMMERZUTOKEN )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:18:11: KLAMMERAUFTOKEN rechnung KLAMMERZUTOKEN
            {
            dbg.location(18,11);
            match(input,KLAMMERAUFTOKEN,FOLLOW_KLAMMERAUFTOKEN_in_ergebnis114); 
            dbg.location(18,27);
            pushFollow(FOLLOW_rechnung_in_ergebnis116);
            rechnung();

            state._fsp--;

            dbg.location(18,36);
            match(input,KLAMMERZUTOKEN,FOLLOW_KLAMMERZUTOKEN_in_ergebnis118); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(18, 49);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ergebnis");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ergebnis"



    // $ANTLR start "rechnung"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:19:1: rechnung : punktRechnung ( PLUSMINUS punktRechnung )* ;
    public final void rechnung() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "rechnung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:19:9: ( punktRechnung ( PLUSMINUS punktRechnung )* )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:19:13: punktRechnung ( PLUSMINUS punktRechnung )*
            {
            dbg.location(19,13);
            pushFollow(FOLLOW_punktRechnung_in_rechnung127);
            punktRechnung();

            state._fsp--;

            dbg.location(19,27);
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:19:27: ( PLUSMINUS punktRechnung )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==PLUSMINUS) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:19:28: PLUSMINUS punktRechnung
            	    {
            	    dbg.location(19,28);
            	    match(input,PLUSMINUS,FOLLOW_PLUSMINUS_in_rechnung130); 
            	    dbg.location(19,38);
            	    pushFollow(FOLLOW_punktRechnung_in_rechnung132);
            	    punktRechnung();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(19, 52);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rechnung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rechnung"



    // $ANTLR start "punktRechnung"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:21:1: punktRechnung : zahl ( MALGETEILT zahl )* ;
    public final void punktRechnung() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "punktRechnung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:21:14: ( zahl ( MALGETEILT zahl )* )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:21:18: zahl ( MALGETEILT zahl )*
            {
            dbg.location(21,18);
            pushFollow(FOLLOW_zahl_in_punktRechnung144);
            zahl();

            state._fsp--;

            dbg.location(21,23);
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:21:23: ( MALGETEILT zahl )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==MALGETEILT) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:21:24: MALGETEILT zahl
            	    {
            	    dbg.location(21,24);
            	    match(input,MALGETEILT,FOLLOW_MALGETEILT_in_punktRechnung147); 
            	    dbg.location(21,35);
            	    pushFollow(FOLLOW_zahl_in_punktRechnung149);
            	    zahl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "punktRechnung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "punktRechnung"



    // $ANTLR start "zahl"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:22:1: zahl : ( INTTOKEN | real );
    public final void zahl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "zahl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:22:5: ( INTTOKEN | real )
            int alt7=2;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==INTTOKEN) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==REALSEPERATOR) ) {
                    alt7=2;
                }
                else if ( (LA7_1==DOTOKEN||LA7_1==KLAMMERZUTOKEN||LA7_1==MALGETEILT||(LA7_1 >= OPERATORENTOKEN && LA7_1 <= PLUSMINUS)||LA7_1==THENTOKEN) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:22:7: INTTOKEN
                    {
                    dbg.location(22,7);
                    match(input,INTTOKEN,FOLLOW_INTTOKEN_in_zahl157); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:22:18: real
                    {
                    dbg.location(22,18);
                    pushFollow(FOLLOW_real_in_zahl161);
                    real();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(22, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "zahl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "zahl"



    // $ANTLR start "verzweigung"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:24:1: verzweigung : IFTOKEN vergleich THENTOKEN programm ( ELSETOKEN programm )? FITOKEN ;
    public final void verzweigung() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "verzweigung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:24:12: ( IFTOKEN vergleich THENTOKEN programm ( ELSETOKEN programm )? FITOKEN )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:24:14: IFTOKEN vergleich THENTOKEN programm ( ELSETOKEN programm )? FITOKEN
            {
            dbg.location(24,14);
            match(input,IFTOKEN,FOLLOW_IFTOKEN_in_verzweigung168); 
            dbg.location(24,22);
            pushFollow(FOLLOW_vergleich_in_verzweigung170);
            vergleich();

            state._fsp--;

            dbg.location(24,32);
            match(input,THENTOKEN,FOLLOW_THENTOKEN_in_verzweigung172); 
            dbg.location(24,42);
            pushFollow(FOLLOW_programm_in_verzweigung174);
            programm();

            state._fsp--;

            dbg.location(24,51);
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:24:51: ( ELSETOKEN programm )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSETOKEN) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:24:52: ELSETOKEN programm
                    {
                    dbg.location(24,52);
                    match(input,ELSETOKEN,FOLLOW_ELSETOKEN_in_verzweigung177); 
                    dbg.location(24,62);
                    pushFollow(FOLLOW_programm_in_verzweigung179);
                    programm();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(24,73);
            match(input,FITOKEN,FOLLOW_FITOKEN_in_verzweigung183); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(24, 79);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "verzweigung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "verzweigung"



    // $ANTLR start "vergleich"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:26:1: vergleich : ( wert | IDENTTOKEN ) OPERATORENTOKEN ( wert | IDENTTOKEN ) ;
    public final void vergleich() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "vergleich");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:26:10: ( ( wert | IDENTTOKEN ) OPERATORENTOKEN ( wert | IDENTTOKEN ) )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:26:12: ( wert | IDENTTOKEN ) OPERATORENTOKEN ( wert | IDENTTOKEN )
            {
            dbg.location(26,12);
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:26:12: ( wert | IDENTTOKEN )
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==INTTOKEN||LA9_0==STRINGTOKEN) ) {
                alt9=1;
            }
            else if ( (LA9_0==IDENTTOKEN) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:26:13: wert
                    {
                    dbg.location(26,13);
                    pushFollow(FOLLOW_wert_in_vergleich191);
                    wert();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:26:20: IDENTTOKEN
                    {
                    dbg.location(26,20);
                    match(input,IDENTTOKEN,FOLLOW_IDENTTOKEN_in_vergleich195); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(26,32);
            match(input,OPERATORENTOKEN,FOLLOW_OPERATORENTOKEN_in_vergleich198); 
            dbg.location(26,48);
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:26:48: ( wert | IDENTTOKEN )
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==INTTOKEN||LA10_0==STRINGTOKEN) ) {
                alt10=1;
            }
            else if ( (LA10_0==IDENTTOKEN) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:26:49: wert
                    {
                    dbg.location(26,49);
                    pushFollow(FOLLOW_wert_in_vergleich201);
                    wert();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:26:56: IDENTTOKEN
                    {
                    dbg.location(26,56);
                    match(input,IDENTTOKEN,FOLLOW_IDENTTOKEN_in_vergleich205); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(26, 66);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vergleich");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vergleich"



    // $ANTLR start "wert"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:27:1: wert : ( STRINGTOKEN | zahl ) ;
    public final void wert() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "wert");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:27:5: ( ( STRINGTOKEN | zahl ) )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:27:7: ( STRINGTOKEN | zahl )
            {
            dbg.location(27,7);
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:27:7: ( STRINGTOKEN | zahl )
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==STRINGTOKEN) ) {
                alt11=1;
            }
            else if ( (LA11_0==INTTOKEN) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:27:8: STRINGTOKEN
                    {
                    dbg.location(27,8);
                    match(input,STRINGTOKEN,FOLLOW_STRINGTOKEN_in_wert213); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:27:22: zahl
                    {
                    dbg.location(27,22);
                    pushFollow(FOLLOW_zahl_in_wert217);
                    zahl();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(27, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wert");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "wert"



    // $ANTLR start "schleife"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:29:1: schleife : WHILETOKEN vergleich DOTOKEN programm ODTOKEN ;
    public final void schleife() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "schleife");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:29:9: ( WHILETOKEN vergleich DOTOKEN programm ODTOKEN )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:29:11: WHILETOKEN vergleich DOTOKEN programm ODTOKEN
            {
            dbg.location(29,11);
            match(input,WHILETOKEN,FOLLOW_WHILETOKEN_in_schleife225); 
            dbg.location(29,22);
            pushFollow(FOLLOW_vergleich_in_schleife227);
            vergleich();

            state._fsp--;

            dbg.location(29,32);
            match(input,DOTOKEN,FOLLOW_DOTOKEN_in_schleife229); 
            dbg.location(29,40);
            pushFollow(FOLLOW_programm_in_schleife231);
            programm();

            state._fsp--;

            dbg.location(29,49);
            match(input,ODTOKEN,FOLLOW_ODTOKEN_in_schleife233); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(29, 55);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "schleife");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "schleife"



    // $ANTLR start "real"
    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:31:1: real : INTTOKEN REALSEPERATOR UINTTOKEN ;
    public final void real() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "real");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 0);

        try {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:31:6: ( INTTOKEN REALSEPERATOR UINTTOKEN )
            dbg.enterAlt(1);

            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:31:8: INTTOKEN REALSEPERATOR UINTTOKEN
            {
            dbg.location(31,8);
            match(input,INTTOKEN,FOLLOW_INTTOKEN_in_real241); 
            dbg.location(31,17);
            match(input,REALSEPERATOR,FOLLOW_REALSEPERATOR_in_real243); 
            dbg.location(31,31);
            match(input,UINTTOKEN,FOLLOW_UINTTOKEN_in_real245); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(31, 39);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "real");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "real"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAMTOKEN_in_start11 = new BitSet(new long[]{0x0000000005004030L});
    public static final BitSet FOLLOW_initialisierung_in_start15 = new BitSet(new long[]{0x0000000005004030L});
    public static final BitSet FOLLOW_BEGINTOKEN_in_start19 = new BitSet(new long[]{0x0000000040003400L});
    public static final BitSet FOLLOW_programm_in_start23 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ENDTOKEN_in_start27 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_initialisierung34 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTTOKEN_in_initialisierung44 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_KOMMATOKEN_in_initialisierung46 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTTOKEN_in_initialisierung48 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_ENDLINETOKEN_in_initialisierung52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zuweisung_in_programm60 = new BitSet(new long[]{0x0000000040003002L});
    public static final BitSet FOLLOW_verzweigung_in_programm64 = new BitSet(new long[]{0x0000000040003002L});
    public static final BitSet FOLLOW_schleife_in_programm68 = new BitSet(new long[]{0x0000000040003002L});
    public static final BitSet FOLLOW_IDENTTOKEN_in_zuweisung77 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ZUWEISUNGSTOKEN_in_zuweisung79 = new BitSet(new long[]{0x0000000008018040L});
    public static final BitSet FOLLOW_zuweisungswert_in_zuweisung81 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDLINETOKEN_in_zuweisung83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTTOKEN_in_zuweisungswert90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_in_zuweisungswert94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGTOKEN_in_zuweisungswert98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANTOKEN_in_zuweisungswert102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ergebnis_in_zuweisungswert106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KLAMMERAUFTOKEN_in_ergebnis114 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rechnung_in_ergebnis116 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KLAMMERZUTOKEN_in_ergebnis118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punktRechnung_in_rechnung127 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_PLUSMINUS_in_rechnung130 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_punktRechnung_in_rechnung132 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_zahl_in_punktRechnung144 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_MALGETEILT_in_punktRechnung147 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_zahl_in_punktRechnung149 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_INTTOKEN_in_zahl157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_in_zahl161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFTOKEN_in_verzweigung168 = new BitSet(new long[]{0x0000000008009000L});
    public static final BitSet FOLLOW_vergleich_in_verzweigung170 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THENTOKEN_in_verzweigung172 = new BitSet(new long[]{0x0000000040003900L});
    public static final BitSet FOLLOW_programm_in_verzweigung174 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ELSETOKEN_in_verzweigung177 = new BitSet(new long[]{0x0000000040003800L});
    public static final BitSet FOLLOW_programm_in_verzweigung179 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_FITOKEN_in_verzweigung183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wert_in_vergleich191 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTTOKEN_in_vergleich195 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_OPERATORENTOKEN_in_vergleich198 = new BitSet(new long[]{0x0000000008009000L});
    public static final BitSet FOLLOW_wert_in_vergleich201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTTOKEN_in_vergleich205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGTOKEN_in_wert213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zahl_in_wert217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILETOKEN_in_schleife225 = new BitSet(new long[]{0x0000000008009000L});
    public static final BitSet FOLLOW_vergleich_in_schleife227 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DOTOKEN_in_schleife229 = new BitSet(new long[]{0x0000000040103000L});
    public static final BitSet FOLLOW_programm_in_schleife231 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ODTOKEN_in_schleife233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTTOKEN_in_real241 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_REALSEPERATOR_in_real243 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_UINTTOKEN_in_real245 = new BitSet(new long[]{0x0000000000000002L});

}