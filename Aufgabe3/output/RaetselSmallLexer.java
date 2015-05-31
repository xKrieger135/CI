// $ANTLR 3.4 C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g 2015-05-31 13:53:28

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
    public static final int PLUS=7;
    public static final int SYMBOLPUZZLE=8;
    public static final int WORT=9;

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
    public String getGrammarFileName() { return "C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g"; }

    // $ANTLR start "BUCHSTABEN"
    public final void mBUCHSTABEN() throws RecognitionException {
        try {
            int _type = BUCHSTABEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:35:12: ( ( 'A' .. 'Z' ) )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:
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
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:36:6: ( '+' )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:36:8: '+'
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
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:37:7: ( '-' )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:37:9: '-'
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
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:38:9: ( '=' )
            // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:38:11: '='
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

    public void mTokens() throws RecognitionException {
        // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:1:8: ( BUCHSTABEN | PLUS | MINUS | GLEICH )
        int alt1=4;
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
            alt1=1;
            }
            break;
        case '+':
            {
            alt1=2;
            }
            break;
        case '-':
            {
            alt1=3;
            }
            break;
        case '=':
            {
            alt1=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }

        switch (alt1) {
            case 1 :
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:1:10: BUCHSTABEN
                {
                mBUCHSTABEN(); 


                }
                break;
            case 2 :
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:1:21: PLUS
                {
                mPLUS(); 


                }
                break;
            case 3 :
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:1:26: MINUS
                {
                mMINUS(); 


                }
                break;
            case 4 :
                // C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\RaetselSmall.g:1:32: GLEICH
                {
                mGLEICH(); 


                }
                break;

        }

    }


 

}