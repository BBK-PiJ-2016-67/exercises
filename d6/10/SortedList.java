public class SortedList {
	
	private Node root;

	public void add(int value) {
		Node newNode = new Node(value);
		if (this.root == null) {
			this.root = newNode;
			return;
		}
		if (this.root.value > value) {
			newNode.next = this.root;
			this.root = newNode;
			return;
		}
		Node node = this.root;
		while (node.next != null && node.next.value < value) {
			node = node.next;
		}
		newNode.next = node.next;
		node.next = newNode;
	}

	public void prettyPrint() {
		if (this.root == null) {
			return;
		}
		Node node = this.root;
		do {
			System.out.println(node.value);
			node = node.next;
		} while (node != null);
	}

}
