package impl;

import spec.Stack;

public class StackImpl implements Stack {

	private Node top;

	public int peek() {
		if (this.top == null) {
			return -1;
		}
		return this.top.getValue();
	}

	public int pop() {
		if (this.top == null) {
			return -1;
		}
		Node node = this.top;
		this.top = node.getNext();
		return node.getValue();
	}

	public void push(int value) {
		Node node = new Node(value);
		node.setNext(this.top);
		this.top = node;
	}

	public int size() {
		if (this.top == null) {
			return 0;
		}
		int count = 1;
		Node node = this.top;
		while (node.getNext() != null) {
			node = node.getNext();
			count += 1;
		}
		return count;
	}

}
