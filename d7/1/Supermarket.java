public class Supermarket {
	
	private SupermarketQueue queue;
	
	public Supermarket() {
		queue = new SupermarketQueue();
	}
	
	public void addPerson(Person person) {
		queue.insert(person);
	}
	
	public Person servePerson() {
		return queue.retrieve();
	}

}