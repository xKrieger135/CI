import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
		System.out.println(System.getProperty("user.dir")+"\\__Test__input.txt");
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(System.getProperty("user.dir")+"\\__Test__input.txt"));
		RaetselSmallLexer lexer = new RaetselSmallLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		RaetselSmallParser parser = new RaetselSmallParser(tokens);
		RaetselSmallParser.start_return result = parser.start();
		CommonTree treeBeforeNormalisation = (CommonTree) result.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(treeBeforeNormalisation);
		
		System.out.println("nach dem parsen");
		System.out.println(treeBeforeNormalisation.toStringTree());
		
		transformationGrammar walker = new transformationGrammar(nodes);
		CommonTree treeAfterNormalisation = (CommonTree) walker.puzzle().getTree();
		System.out.println(treeAfterNormalisation.toStringTree());
		
		CommonTreeNodeStream nodesAfterNormalisation = new CommonTreeNodeStream(treeAfterNormalisation);
		nodesAfterNormalisation.setTokenStream(tokens);
		SymbolraetselEmitter normalizer = new SymbolraetselEmitter(nodesAfterNormalisation);
		
		System.out.println(TEMPLATE_FILE);
		
		InputStream templateIs = new FileInputStream(TEMPLATE_FILE);
		StringTemplateGroup templates = new StringTemplateGroup(new InputStreamReader(templateIs, "ISO-8859-15"), AngleBracketTemplateLexer.class);
		normalizer.setTemplateLib(templates);
		SymbolraetselEmitter.puzzle_return ast2 = normalizer.puzzle();

		String output = ast2.getTemplate().toString();
		System.out.println("\n\nausgabe");
		System.out.println(output);
		System.out.println("\n\nnach dem normalisieren");
		//System.out.println(r2.toStringTree());


//		CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(r2);
//		nodes2.setTokenStream(tokens);
//		SymbolraetselEmitter emitter = new SymbolraetselEmitter(nodes2);

//		SymbolraetselEmitter.puzzle_return puzzle_return = normalizer.puzzle();
//		String output = puzzle_return.getTemplate().toString();
//		System.out.println("\n\nausgabe");
//		System.out.println(output);



	}

}
