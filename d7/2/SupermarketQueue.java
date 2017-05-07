public class SupermarketQueue implements PersonQueue {
	
	private Person head;

	public SupermarketQueue() {
		head = null;
	}
	
	public void insert(Person person) {
		if (head == null) {
			head = person;
			return;
		}
		
		head.prev = person;
		person.next = head;
		head = person;
	}

	public Person retrieve() {
		if (head == null) {
			return null;
		}
		
		Person result;
		
		if (head.next == null) {
			result = head;
			head = null;
			return result;
		}
		
		Person current = head;
		
		do {
			current = current.next;
		} while (current.next != null);
		
		return current;
	}

}