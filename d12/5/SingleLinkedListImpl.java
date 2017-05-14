package impl;

import spec.List;

public class SingleLinkedListImpl implements List {

	private Node root;

	public void add(int value) {
		Node newNode = new Node(value);
		if (this.root == null) {
			this.root = newNode;
			return;
		}
		Node node = this.root;
		while (node.getNext() != null) {
			node = node.getNext();
		}
		node.setNext(newNode);
	}

	public void prettyPrint() {
		Node node = this.root;
		do {
			node.prettyPrint();
			node = node.getNext();
		} while (node != null);
	}

	public void remove(int value) {
		if (this.root != null && this.root.getValue() == value) {
			this.root = this.root.getNext();
			return;
		}
		Node node = this.root;
		do {
			if (node.getNext() != null && node.getNext().getValue() == value) {
				node.setNext(node.getNext().getNext());
				return;
			}
			node = node.getNext();
		} while (node != null);
	}

}
