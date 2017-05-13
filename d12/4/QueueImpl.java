package impl;

import spec.Queue;

public class QueueImpl implements Queue {

	private Node root;

	public void add(int value) {
		if (this.root == null) {
			this.root = new Node(value);
			return;
		}
		Node node = this.root;
		while (node.getNext() != null) {
			node = node.getNext();
		}
		node.setNext(new Node(value));
	}

	public int remove() {
		if (this.root == null) {
			return -1;
		}
		Node node = this.root;
		this.root = node.getNext();
		return node.getValue();
	}

	public int size() {
		if (this.root == null) {
			return 0;
		}
		int count = 1;
		Node node = this.root;
		while (node.getNext() != null) {
			node = node.getNext();
			count += 1;
		}
		return count;
	}

}
