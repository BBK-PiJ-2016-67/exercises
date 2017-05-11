public class ArrayUtilities {
	
	public static Node asList(int[] array) {
		if (array.length == 0) {
			return null;
		}
		Node root = new Node(array[0]);
		if (array.length == 1) {
			return root;
		}
		Node node = root;
		for (int i = 1; i < array.length; i++) {
			Node next = new Node(array[i]);
			node.setNext(next);
			node = next;
		}
		return root;
	}

}
