public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	public void launch() {
		Comparator comparator = new Comparator();

		String maxString = comparator.getMax("10", "a2");
		System.out.println("The highest value of 10 and a2 is " + maxString);
		
		double maxDouble = comparator.getMax(1.0, 2.0);
		System.out.println("The highest value of 1.0 and 2.0 is " + maxDouble);
		
		int maxInt = comparator.getMax(1, 2);
		System.out.println("The highest value of 1 and 2 is " + maxInt);
	}
}
