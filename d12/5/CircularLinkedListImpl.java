package impl;

import spec.List;

public class CircularLinkedListImpl implements List {

	private Node root;

	public void add(int value) {
		Node newNode = new Node(value);
		if (this.root == null) {
			this.root = newNode;
			this.root.setNext(this.root);
			return;
		}
		Node node = this.root;
		while (!node.getNext().equals(this.root)) {
			node = node.getNext();
		}
		node.setNext(newNode);
		node.getNext().setNext(this.root);
	}

	public void prettyPrint() {
		if (this.root == null) {
			return;
		}
		Node node = this.root;
		do {
			node.prettyPrint();
			node = node.getNext();
		} while (!node.equals(this.root));
	}

	public void remove(int value) {
		if (this.root == null) {
			return;
		}
		if (this.root.getValue() == value) {
			this.root = this.root.getNext();
			return;
		}
		Node node = this.root;
		while (!node.getNext().equals(this.root)) {
			if (node.getNext().getValue() == value) {
				node.setNext(node.getNext().getNext());
				return;
			}
			node = node.getNext();
		}
	}

}
