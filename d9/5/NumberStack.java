import java.util.ArrayList;
import java.util.List;

public class NumberStack {
	
	private List<Number> stack = new ArrayList<Number>();

	public Number pop() {
		if (this.size() == 0) {
			return null;
		}
		Number number = this.stack.get(this.stack.size() - 1);
		this.stack.remove(this.stack.size() - 1);
		return number;
	}

	public void push(Number number) {
		this.stack.add(number);
	}

	public int size() {
		return this.stack.size();
	}

}
