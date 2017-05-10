public class Patient {

	private String name;
	private Patient next;
	private Patient prev;

	public Patient(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public Patient getNextPatient() {
		return this.next;
	}

	public Patient getPrevPatient() {
		return this.prev;
	}

	public void prettyPrint() {
		System.out.println(this.name);
	}

	public void setNextPatient(Patient patient) {
		this.next = patient;
	}

	public void setPrevPatient(Patient patient) {
		this.prev = patient;
	}

}
