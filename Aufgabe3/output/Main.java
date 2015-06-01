import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class Main {

    public static void main(String args[]) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream("D:\\Uni\\CI\\Praktikum\\CI\\Aufgabe3\\output\\__Test___input.txt", "UTF8");
		RaetselSmallLexer raetselLexer = new RaetselSmallLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(raetselLexer);

        RaetselSmallParser parser = new RaetselSmallParser(tokens);
        RaetselSmallParser.all_return r = parser.all();
		CommonTree commonTree = (CommonTree)r.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(commonTree);

        System.out.println(commonTree.toString());

        transformationGrammar walker = new transformationGrammar(nodes);
        walker.puzzle();
    }

}