public class Launcher {

	public static void main(String[] args) {
		NumberStack numberStack = new NumberStack();
		numberStack.push(new Integer(1));
		System.out.println(numberStack.size());
		numberStack.push(new Double(2.0));
		System.out.println(numberStack.size());
		numberStack.pop();
		System.out.println(numberStack.size());
	}
	
}
