public class Patient {

	private String name;
	private Patient next;

	public Patient(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public Patient getNextPatient() {
		return this.next;
	}

	public void prettyPrint() {
		System.out.println(this.name);
	}

	public void setNextPatient(Patient patient) {
		this.next = patient;
	}

}
