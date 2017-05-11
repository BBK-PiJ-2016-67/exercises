public class ListIntSortedList implements IntSortedList {

	private Node root;

	public void add(int value) {
		if (this.root == null) {
			this.root = new Node(value);
			return;
		}
		Node node = this.root;
		while (node.right != null) {
			node = node.right;
		}
		node.right = new Node(value);
	}

	public boolean contains(int value) {
		if (this.root == null) {
			return false;
		}
		Node node = this.root;
		do {
			if (node.getValue() == value) {
				return true;
			}
			node = node.right;
		} while (node != null);
		return false;
	}

	public String toString() {
		if (this.root == null) {
			return null;
		}
		String string = "";
		Node node = this.root;
		do {
			string += Integer.toString(node.getValue()) + ",";
			node = node.right;
		} while (node != null);
		return string;
	}
	
}
