public class Employee implements LinkedElement {
	
	public Employee next;
	public String name;
	
	public Employee(String name) {
		this.name = name;
	}
}