public class SupermarketQueue implements PersonQueue {
	
	private Person[] personArray;

	private int size;

	public SupermarketQueue() {
		personArray = new Person[1];
		size = 0;
	}
	
	public void insert(Person person) {
		if (personArray.length - size < 1) {
			Person[] array = new Person[size + 1];
			for (int i = 0; i < size; i++) {
				array[i] = personArray[i];
			}
			personArray = array;
		}
		personArray[size] = person;
		size++;
	}

	public Person retrieve() {
		if (size < 1) {
			return null;
		}
		size--;
		Person result = personArray[0];
		if (size < 1) {
			return result;
		}
		Person[] array = new Person[size];
		for (int i = 1; i < personArray.length; i++) {
			array[i - 1] = personArray[i];
		}
		personArray = array;
		return result;
	}

}