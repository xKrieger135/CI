// $ANTLR 3.4 D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g 2015-05-29 15:28:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class miniPLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public miniPLexer() {} 
    public miniPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public miniPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g"; }

    // $ANTLR start "PROGRAMTOKEN"
    public final void mPROGRAMTOKEN() throws RecognitionException {
        try {
            int _type = PROGRAMTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:37:13: ( 'program' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:37:16: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROGRAMTOKEN"

    // $ANTLR start "BEGINTOKEN"
    public final void mBEGINTOKEN() throws RecognitionException {
        try {
            int _type = BEGINTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:38:11: ( 'begin' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:38:14: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGINTOKEN"

    // $ANTLR start "ENDTOKEN"
    public final void mENDTOKEN() throws RecognitionException {
        try {
            int _type = ENDTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:39:9: ( 'end' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:39:13: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDTOKEN"

    // $ANTLR start "IFTOKEN"
    public final void mIFTOKEN() throws RecognitionException {
        try {
            int _type = IFTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:40:8: ( 'if' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:40:11: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IFTOKEN"

    // $ANTLR start "ELSETOKEN"
    public final void mELSETOKEN() throws RecognitionException {
        try {
            int _type = ELSETOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:41:10: ( 'else' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:41:13: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSETOKEN"

    // $ANTLR start "THENTOKEN"
    public final void mTHENTOKEN() throws RecognitionException {
        try {
            int _type = THENTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:42:10: ( 'then' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:42:13: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THENTOKEN"

    // $ANTLR start "FITOKEN"
    public final void mFITOKEN() throws RecognitionException {
        try {
            int _type = FITOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:43:8: ( 'fi' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:43:11: 'fi'
            {
            match("fi"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FITOKEN"

    // $ANTLR start "WHILETOKEN"
    public final void mWHILETOKEN() throws RecognitionException {
        try {
            int _type = WHILETOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:44:11: ( 'while' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:44:14: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILETOKEN"

    // $ANTLR start "DOTOKEN"
    public final void mDOTOKEN() throws RecognitionException {
        try {
            int _type = DOTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:45:9: ( 'do' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:45:12: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOTOKEN"

    // $ANTLR start "ODTOKEN"
    public final void mODTOKEN() throws RecognitionException {
        try {
            int _type = ODTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:46:9: ( 'od' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:46:12: 'od'
            {
            match("od"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ODTOKEN"

    // $ANTLR start "ZUWEISUNGSTOKEN"
    public final void mZUWEISUNGSTOKEN() throws RecognitionException {
        try {
            int _type = ZUWEISUNGSTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:47:16: ( ':=' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:47:18: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ZUWEISUNGSTOKEN"

    // $ANTLR start "ENDLINETOKEN"
    public final void mENDLINETOKEN() throws RecognitionException {
        try {
            int _type = ENDLINETOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:48:13: ( ';' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:48:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDLINETOKEN"

    // $ANTLR start "INTTOKEN"
    public final void mINTTOKEN() throws RecognitionException {
        try {
            int _type = INTTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:49:9: ( ( PLUSMINUS )? UINTTOKEN )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:49:13: ( PLUSMINUS )? UINTTOKEN
            {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:49:13: ( PLUSMINUS )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mUINTTOKEN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTTOKEN"

    // $ANTLR start "UINTTOKEN"
    public final void mUINTTOKEN() throws RecognitionException {
        try {
            int _type = UINTTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:50:10: ( ( '0' .. '9' )+ )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:50:14: ( '0' .. '9' )+
            {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:50:14: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UINTTOKEN"

    // $ANTLR start "REALSEPERATOR"
    public final void mREALSEPERATOR() throws RecognitionException {
        try {
            int _type = REALSEPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:52:14: ( '.' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:52:17: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REALSEPERATOR"

    // $ANTLR start "BOOLEANTOKEN"
    public final void mBOOLEANTOKEN() throws RecognitionException {
        try {
            int _type = BOOLEANTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:53:13: ( ( 'true' | 'false' ) )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:53:17: ( 'true' | 'false' )
            {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:53:17: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:53:18: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:53:25: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEANTOKEN"

    // $ANTLR start "STRINGTOKEN"
    public final void mSTRINGTOKEN() throws RecognitionException {
        try {
            int _type = STRINGTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:54:12: ( '(\\'' ( options {greedy=false; } : . )* '\\')' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:54:15: '(\\'' ( options {greedy=false; } : . )* '\\')'
            {
            match("('"); 



            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:54:21: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\'') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==')') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '(')||(LA4_1 >= '*' && LA4_1 <= '\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '&')||(LA4_0 >= '(' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:54:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match("')"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRINGTOKEN"

    // $ANTLR start "PLUSMINUS"
    public final void mPLUSMINUS() throws RecognitionException {
        try {
            int _type = PLUSMINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:55:10: ( ( '+' | '-' ) )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUSMINUS"

    // $ANTLR start "MALGETEILT"
    public final void mMALGETEILT() throws RecognitionException {
        try {
            int _type = MALGETEILT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:56:11: ( ( '*' | '/' ) )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MALGETEILT"

    // $ANTLR start "OPERATORENTOKEN"
    public final void mOPERATORENTOKEN() throws RecognitionException {
        try {
            int _type = OPERATORENTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:57:16: ( ( '<' | '>' | '=' | '!=' | '<=' | '>=' ) )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:57:18: ( '<' | '>' | '=' | '!=' | '<=' | '>=' )
            {
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:57:18: ( '<' | '>' | '=' | '!=' | '<=' | '>=' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='=') ) {
                    alt5=5;
                }
                else {
                    alt5=1;
                }
                }
                break;
            case '>':
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='=') ) {
                    alt5=6;
                }
                else {
                    alt5=2;
                }
                }
                break;
            case '=':
                {
                alt5=3;
                }
                break;
            case '!':
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:57:19: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:57:23: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:57:27: '='
                    {
                    match('='); 

                    }
                    break;
                case 4 :
                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:57:31: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 5 :
                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:57:36: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 6 :
                    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:57:41: '>='
                    {
                    match(">="); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPERATORENTOKEN"

    // $ANTLR start "KLAMMERAUFTOKEN"
    public final void mKLAMMERAUFTOKEN() throws RecognitionException {
        try {
            int _type = KLAMMERAUFTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:58:16: ( '(' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:58:18: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KLAMMERAUFTOKEN"

    // $ANTLR start "KLAMMERZUTOKEN"
    public final void mKLAMMERZUTOKEN() throws RecognitionException {
        try {
            int _type = KLAMMERZUTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:59:15: ( ')' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:59:18: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KLAMMERZUTOKEN"

    // $ANTLR start "KOMMATOKEN"
    public final void mKOMMATOKEN() throws RecognitionException {
        try {
            int _type = KOMMATOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:60:11: ( ',' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:60:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KOMMATOKEN"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:62:8: ( 'string' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:62:10: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:63:9: ( 'boolean' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:63:11: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:64:9: ( 'integer' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:64:11: 'integer'
            {
            match("integer"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:65:7: ( 'real' )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:65:9: 'real'
            {
            match("real"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "IDENTTOKEN"
    public final void mIDENTTOKEN() throws RecognitionException {
        try {
            int _type = IDENTTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:67:11: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | ( '0' .. '9' ) | '_' )* )
            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:67:13: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:67:33: ( 'a' .. 'z' | 'A' .. 'Z' | ( '0' .. '9' ) | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTTOKEN"

    public void mTokens() throws RecognitionException {
        // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:8: ( PROGRAMTOKEN | BEGINTOKEN | ENDTOKEN | IFTOKEN | ELSETOKEN | THENTOKEN | FITOKEN | WHILETOKEN | DOTOKEN | ODTOKEN | ZUWEISUNGSTOKEN | ENDLINETOKEN | INTTOKEN | UINTTOKEN | REALSEPERATOR | BOOLEANTOKEN | STRINGTOKEN | PLUSMINUS | MALGETEILT | OPERATORENTOKEN | KLAMMERAUFTOKEN | KLAMMERZUTOKEN | KOMMATOKEN | STRING | BOOLEAN | INTEGER | REAL | IDENTTOKEN )
        int alt7=28;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:10: PROGRAMTOKEN
                {
                mPROGRAMTOKEN(); 


                }
                break;
            case 2 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:23: BEGINTOKEN
                {
                mBEGINTOKEN(); 


                }
                break;
            case 3 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:34: ENDTOKEN
                {
                mENDTOKEN(); 


                }
                break;
            case 4 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:43: IFTOKEN
                {
                mIFTOKEN(); 


                }
                break;
            case 5 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:51: ELSETOKEN
                {
                mELSETOKEN(); 


                }
                break;
            case 6 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:61: THENTOKEN
                {
                mTHENTOKEN(); 


                }
                break;
            case 7 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:71: FITOKEN
                {
                mFITOKEN(); 


                }
                break;
            case 8 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:79: WHILETOKEN
                {
                mWHILETOKEN(); 


                }
                break;
            case 9 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:90: DOTOKEN
                {
                mDOTOKEN(); 


                }
                break;
            case 10 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:98: ODTOKEN
                {
                mODTOKEN(); 


                }
                break;
            case 11 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:106: ZUWEISUNGSTOKEN
                {
                mZUWEISUNGSTOKEN(); 


                }
                break;
            case 12 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:122: ENDLINETOKEN
                {
                mENDLINETOKEN(); 


                }
                break;
            case 13 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:135: INTTOKEN
                {
                mINTTOKEN(); 


                }
                break;
            case 14 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:144: UINTTOKEN
                {
                mUINTTOKEN(); 


                }
                break;
            case 15 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:154: REALSEPERATOR
                {
                mREALSEPERATOR(); 


                }
                break;
            case 16 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:168: BOOLEANTOKEN
                {
                mBOOLEANTOKEN(); 


                }
                break;
            case 17 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:181: STRINGTOKEN
                {
                mSTRINGTOKEN(); 


                }
                break;
            case 18 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:193: PLUSMINUS
                {
                mPLUSMINUS(); 


                }
                break;
            case 19 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:203: MALGETEILT
                {
                mMALGETEILT(); 


                }
                break;
            case 20 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:214: OPERATORENTOKEN
                {
                mOPERATORENTOKEN(); 


                }
                break;
            case 21 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:230: KLAMMERAUFTOKEN
                {
                mKLAMMERAUFTOKEN(); 


                }
                break;
            case 22 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:246: KLAMMERZUTOKEN
                {
                mKLAMMERZUTOKEN(); 


                }
                break;
            case 23 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:261: KOMMATOKEN
                {
                mKOMMATOKEN(); 


                }
                break;
            case 24 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:272: STRING
                {
                mSTRING(); 


                }
                break;
            case 25 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:279: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 26 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:287: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 27 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:295: REAL
                {
                mREAL(); 


                }
                break;
            case 28 :
                // D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe1\\miniP.g:1:300: IDENTTOKEN
                {
                mIDENTTOKEN(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\11\26\2\uffff\1\46\1\45\1\uffff\1\50\4\uffff\2\26\1\uffff"+
        "\5\26\1\60\3\26\1\64\2\26\1\67\1\70\4\uffff\5\26\1\76\1\26\1\uffff"+
        "\3\26\1\uffff\2\26\2\uffff\5\26\1\uffff\1\112\1\26\1\114\1\115\3"+
        "\26\1\121\1\26\1\123\1\26\1\uffff\1\26\2\uffff\1\115\1\126\1\26"+
        "\1\uffff\1\26\1\uffff\2\26\1\uffff\1\133\1\134\1\135\1\136\4\uffff";
    static final String DFA7_eofS =
        "\137\uffff";
    static final String DFA7_minS =
        "\1\41\1\162\1\145\1\154\1\146\1\150\1\141\1\150\1\157\1\144\2\uffff"+
        "\2\60\1\uffff\1\47\4\uffff\1\164\1\145\1\uffff\1\157\1\147\1\157"+
        "\1\144\1\163\1\60\1\164\1\145\1\165\1\60\1\154\1\151\2\60\4\uffff"+
        "\1\162\1\141\1\147\1\151\1\154\1\60\1\145\1\uffff\1\145\1\156\1"+
        "\145\1\uffff\1\163\1\154\2\uffff\1\151\1\154\1\162\1\156\1\145\1"+
        "\uffff\1\60\1\147\2\60\2\145\1\156\1\60\1\141\1\60\1\141\1\uffff"+
        "\1\145\2\uffff\2\60\1\147\1\uffff\1\155\1\uffff\1\156\1\162\1\uffff"+
        "\4\60\4\uffff";
    static final String DFA7_maxS =
        "\1\172\1\162\1\157\2\156\1\162\1\151\1\150\1\157\1\144\2\uffff\2"+
        "\71\1\uffff\1\47\4\uffff\1\164\1\145\1\uffff\1\157\1\147\1\157\1"+
        "\144\1\163\1\172\1\164\1\145\1\165\1\172\1\154\1\151\2\172\4\uffff"+
        "\1\162\1\141\1\147\1\151\1\154\1\172\1\145\1\uffff\1\145\1\156\1"+
        "\145\1\uffff\1\163\1\154\2\uffff\1\151\1\154\1\162\1\156\1\145\1"+
        "\uffff\1\172\1\147\2\172\2\145\1\156\1\172\1\141\1\172\1\141\1\uffff"+
        "\1\145\2\uffff\2\172\1\147\1\uffff\1\155\1\uffff\1\156\1\162\1\uffff"+
        "\4\172\4\uffff";
    static final String DFA7_acceptS =
        "\12\uffff\1\13\1\14\2\uffff\1\17\1\uffff\1\23\1\24\1\26\1\27\2\uffff"+
        "\1\34\16\uffff\1\15\1\22\1\21\1\25\7\uffff\1\4\3\uffff\1\7\2\uffff"+
        "\1\11\1\12\5\uffff\1\3\13\uffff\1\5\1\uffff\1\6\1\20\3\uffff\1\33"+
        "\1\uffff\1\2\2\uffff\1\10\4\uffff\1\30\1\1\1\31\1\32";
    static final String DFA7_specialS =
        "\137\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\21\6\uffff\1\17\1\22\1\20\1\14\1\23\1\14\1\16\1\20\12\15"+
            "\1\12\1\13\3\21\2\uffff\32\26\6\uffff\1\26\1\2\1\26\1\10\1\3"+
            "\1\6\2\26\1\4\5\26\1\11\1\1\1\26\1\25\1\24\1\5\2\26\1\7\3\26",
            "\1\27",
            "\1\30\11\uffff\1\31",
            "\1\33\1\uffff\1\32",
            "\1\34\7\uffff\1\35",
            "\1\36\11\uffff\1\37",
            "\1\41\7\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "\12\45",
            "\12\15",
            "",
            "\1\47",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\65",
            "\1\66",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\113",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\122",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\124",
            "",
            "\1\125",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\127",
            "",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PROGRAMTOKEN | BEGINTOKEN | ENDTOKEN | IFTOKEN | ELSETOKEN | THENTOKEN | FITOKEN | WHILETOKEN | DOTOKEN | ODTOKEN | ZUWEISUNGSTOKEN | ENDLINETOKEN | INTTOKEN | UINTTOKEN | REALSEPERATOR | BOOLEANTOKEN | STRINGTOKEN | PLUSMINUS | MALGETEILT | OPERATORENTOKEN | KLAMMERAUFTOKEN | KLAMMERZUTOKEN | KOMMATOKEN | STRING | BOOLEAN | INTEGER | REAL | IDENTTOKEN );";
        }
    }
 

}