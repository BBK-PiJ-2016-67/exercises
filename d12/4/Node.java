package impl;

public class Node {

	private Node next;
	private int value;

	public Node(int value) {
		this.value = value;
	}

	public Node getNext() {
		return this.next;
	}

	public int getValue() {
		return this.value;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
