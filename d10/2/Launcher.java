public class Launcher {

	public static void main(String[] args) {
		Classics classics = new Classics();
		System.out.println(classics.factorial(3));
		System.out.println(classics.fibonacci(10));
		classics.hanoi(3, "src", "aux", "dst");
	}

}
