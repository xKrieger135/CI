import java.util.ArrayList;
import java.util.List;


public class Constraint {
	List<Number> numbers = new ArrayList<Number>();  
	
	public void prepare() {
		int maxSize = -1;
		for (Number number : numbers) {
			if (number.getSize() > maxSize) {
				maxSize = number.getSize();
			}
		}
		for (Number number : numbers) {
			number.maxSize = maxSize;
		}
	}
}
