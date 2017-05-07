public class Run {
	public static void main(String[] args) {
		Supermarket Waitrose = new Supermarket();
		
		Person john = new Person("John");
		
		Waitrose.addPerson(john);
		
		Person dave = new Person("Dave");
		
		Waitrose.addPerson(dave);
		
		Person nextInLine = Waitrose.servePerson();
		
		if (nextInLine != null) {
			System.out.println("Serve " + nextInLine.getName());
		}
		
		nextInLine = Waitrose.servePerson();
		
		if (nextInLine != null) {
			System.out.println("Serve " + nextInLine.getName());
		}
		
		nextInLine = Waitrose.servePerson();
		
		if (nextInLine != null) {
			System.out.println("Serve " + nextInLine.getName());
		}
	}
}