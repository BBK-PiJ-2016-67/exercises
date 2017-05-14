package impl;

import spec.List;

public class DoubleLinkedListImpl implements List {

	private Node root;
	private Node last;

	public void add(int value) {
		Node newNode = new Node(value);
		if (this.root == null) {
			this.root = newNode;
			this.last = newNode;
			return;
		}
		Node node = this.root;
		while (node.getNext() != null) {
			node = node.getNext();
		}
		newNode.setPrev(node);
		node.setNext(newNode);
		this.last = newNode;
	}

	public void prettyPrint() {
		Node node = this.root;
		while (node != null) {
			node.prettyPrint();
			node = node.getNext();
		}
	}

	public void remove(int value) {
		if (this.root != null && this.root.getValue() == value) {
			this.root = this.root.getNext();
			this.root.setPrev(null);
			return;
		}
		Node node = this.root;
		do {
			if (node.getNext() != null && node.getNext().getValue() == value) {
				node.setNext(node.getNext().getNext());
				if (node.getNext() == null) {
					this.last = node;
				} else {
					node.getNext().setPrev(node);
				}
				return;
			}
			node = node.getNext();
		} while (node != null);
	}

}
