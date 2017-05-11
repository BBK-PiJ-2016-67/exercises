public class TreeIntSortedList implements IntSortedList {

	private Node root;

	private void add(Node node, int value) {
		if (value > node.getValue()) {
			if (node.right == null) {
				node.right = new Node(value);
				return;
			} else {
				this.add(node.right, value);
				return;
			}
		}
		if (node.left == null) {
			node.left = new Node(value);
			return;
		} else {
			this.add(node.left, value);
			return;
		}
	}

	public void add(int value) {
		if (this.root == null) {
			this.root = new Node(value);
			return;
		}
		this.add(this.root, value);
	}

	private boolean contains(Node node, int value) {
		if (node.getValue() == value) {
			return true;
		}
		if (value > node.getValue()) {
			if (node.right == null) {
				return false;
			} else {
				return this.contains(node.right, value);
			}
		}
		if (node.left == null) {
			return false;
		} else {
			return this.contains(node.left, value);
		}
	}

	public boolean contains(int value) {
		if (this.root == null) {
			return false;
		}
		return this.contains(this.root, value);
	}

	private String print(Node node) {
		String string = Integer.toString(node.getValue()) + ",";
		if (node.left != null) {
			string += this.print(node.left);
		}
		if (node.right != null) {
			string += this.print(node.right);
		}
		return string;
	}

	public String toString() {
		if (this.root == null) {
			return null;
		}
		return print(this.root);
	}
	
}
