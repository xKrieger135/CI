import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

public class Main {
	private static final String TEMPLATE_FILE = System.getProperty("user.dir")+"\\template.stg";

	public static void main(String[] args) throws RecognitionException,
			FileNotFoundException, IOException {
		ANTLRInputStream  input  = new ANTLRInputStream(new FileInputStream(System.getProperty("user.dir")+"\\__Test__input.txt"));
		RaetselSmallLexer lexer  = new RaetselSmallLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		RaetselSmallParser parser = new RaetselSmallParser(tokens);
		RaetselSmallParser.start_return result = parser.start();
		CommonTree treeBeforeNormalisation = (CommonTree) result.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(treeBeforeNormalisation);
		
		System.out.println("++++++++++++++++++++ Tree before nomalization ++++++++++++++++++++");
		System.out.println("");
		System.out.println(treeBeforeNormalisation.toStringTree());
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		transformationGrammar walker = new transformationGrammar(nodes);
		CommonTree treeAfterNormalisation = (CommonTree) walker.puzzle().getTree();
		
		System.out.println("++++++++++++++++++++ Tree after normalization ++++++++++++++++++++");
		System.out.println("");
		System.out.println(treeAfterNormalisation.toStringTree());
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		CommonTreeNodeStream nodesAfterNormalisation = new CommonTreeNodeStream(treeAfterNormalisation);
		nodesAfterNormalisation.setTokenStream(tokens);
		SymbolraetselEmitter normalizer = new SymbolraetselEmitter(nodesAfterNormalisation);
		
		
		// String template file wird hier herein geladen.
		InputStream templateIs = new FileInputStream(TEMPLATE_FILE);
		StringTemplateGroup templates = new StringTemplateGroup(new InputStreamReader(templateIs, "ISO-8859-15"), AngleBracketTemplateLexer.class);
		normalizer.setTemplateLib(templates);
		SymbolraetselEmitter.puzzle_return ast2 = normalizer.puzzle();

		String output = ast2.getTemplate().toString();
		System.out.println("++++++++++++++++++++ Output from String Template ++++++++++++++++++++");
		System.out.println("");
		System.out.println(output);
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		// Java File erstellen was auch in der Konsole angezeigt wird wenn man die Main.Java ausführt
		Files.write(Paths.get(System.getProperty("user.dir") + "\\src\\PuzzleSolver\\PuzzleSolver.java"), output.getBytes());

	}

}
