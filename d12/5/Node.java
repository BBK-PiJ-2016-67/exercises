package impl;

public class Node {

	private Node next;
	private Node prev;
	private int value;

	public Node(int value) {
		this.value = value;
	}

	public Node getNext() {
		return this.next;
	}

	public Node getPrev() {
		return this.prev;
	}

	public int getValue() {
		return this.value;
	}

	public void prettyPrint() {
		System.out.println(this.value);
	}

	public void setNext(Node node) {
		this.next = node;
	}

	public void setPrev(Node node) {
		this.prev = node;
	}

}
