public class Launcher {
	
	public static void main(String[] args) {
		IntSortedList tree = new TreeIntSortedList();

		tree.add(1);
		tree.add(10);
		tree.add(5);
		tree.add(7);
		tree.add(76);
		tree.add(54);
		tree.add(2);

		System.out.println(tree.contains(5));
		System.out.println(tree.contains(42));

		tree.add(42);

		System.out.println(tree.contains(42));

		System.out.println(tree.toString());
	}

}
