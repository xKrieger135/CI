import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        RaetselSmallLexer lex = new RaetselSmallLexer(new ANTLRFileStream("C:\\Users\\patrick_steinhauer\\Documents\\GitHub\\CI\\Aufgabe3\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        RaetselSmallParser g = new RaetselSmallParser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}