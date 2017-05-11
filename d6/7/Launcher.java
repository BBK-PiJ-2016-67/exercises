public class Launcher {

	public static void main(String[] args) {
		int[] array = {1, 2, 7, 4, 5};

		Node node = ArrayUtilities.asList(array);

		do {
			System.out.println(node.getValue());
			node = node.getNext();
		} while (node != null);
	}

}
