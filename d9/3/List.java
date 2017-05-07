public class List<T extends LinkedElement> {
	
	private T head;

	public void insert(T newElement) {
		if (head != null) {
			head = newElement;
			return;
		}
		T currentElement = head;
		while (currentElement.next != null) {
			currentElement = currentElement.next;
		}
		currentElement.next = newElement;
	}
	
	public T retrieve() {
		if (head == null) {
			return null;
		}
		T currentElement = head;
		while (currentElement.next != null) {
			currentElement = currentElement.next;
		}
		return currentElement;
	}

}