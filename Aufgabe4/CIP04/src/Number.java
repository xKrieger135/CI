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
	
//	private void blubb() {
//		List<Integer> ergebniswort=new ArrayList<>();
//		for(int i = ergebniswort.size()-1; i>=0; i--) {
//			addEqualsConstraint(model, 
//					ersteswort.size()<i ? zero : ersteswort.get(i),
//					zweiteswort.size()<i ? zero : zweiteswort.get(i),
//					u_in,
//					u_out,
//					ergebniswort.get(i));
//		}
//	}
}
