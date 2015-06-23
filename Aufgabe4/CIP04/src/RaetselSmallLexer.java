// $ANTLR 3.4 C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g 2015-06-23 15:39:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RaetselSmallLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public RaetselSmallLexer() {} 
    public RaetselSmallLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RaetselSmallLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g"; }

    // $ANTLR start "BUCHSTABEN"
    public final void mBUCHSTABEN() throws RecognitionException {
        try {
            int _type = BUCHSTABEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:35:12: ( ( 'A' .. 'Z' ) )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
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
    // $ANTLR end "BUCHSTABEN"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:36:6: ( '+' )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:36:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:37:7: ( '-' )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:37:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "GLEICH"
    public final void mGLEICH() throws RecognitionException {
        try {
            int _type = GLEICH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:38:9: ( '=' )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:38:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GLEICH"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:39:4: ( ( ' ' | '\\t' ) )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:39:6: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:40:9: ( ( '\\r' )? '\\n' )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:40:11: ( '\\r' )? '\\n'
            {
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:40:11: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:40:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:1:8: ( BUCHSTABEN | PLUS | MINUS | GLEICH | WS | NEWLINE )
        int alt2=6;
        switch ( input.LA(1) ) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt2=1;
            }
            break;
        case '+':
            {
            alt2=2;
            }
            break;
        case '-':
            {
            alt2=3;
            }
            break;
        case '=':
            {
            alt2=4;
            }
            break;
        case '\t':
        case ' ':
            {
            alt2=5;
            }
            break;
        case '\n':
        case '\r':
            {
            alt2=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:1:10: BUCHSTABEN
                {
                mBUCHSTABEN(); 


                }
                break;
            case 2 :
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:1:21: PLUS
                {
                mPLUS(); 


                }
                break;
            case 3 :
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:1:26: MINUS
                {
                mMINUS(); 


                }
                break;
            case 4 :
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:1:32: GLEICH
                {
                mGLEICH(); 


                }
                break;
            case 5 :
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:1:39: WS
                {
                mWS(); 


                }
                break;
            case 6 :
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe4\\SymbolRaetselSolver\\RaetselSmall.g:1:42: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


 

}