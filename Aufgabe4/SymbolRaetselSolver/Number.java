import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Number {
	List<String> digits = new ArrayList<String>();

	public void setDigits(List<Tree> tokens) {
		for (Tree tree : tokens) {
			digits.add(tree.getText());
		}
	}
		
	public List<String> getCharacters() {
		return digits;
	}

	public int getSize() {
		return digits.size();
	}
}
