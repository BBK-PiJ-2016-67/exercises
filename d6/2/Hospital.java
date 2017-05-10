public class Hospital {

	private Patient root;

	public void addPatient(Patient newPatient) {
		if (this.root == null) {
			this.root = newPatient;
			return;
		}
		Patient patient = this.root;
		while (patient.getNextPatient() != null) {
			patient = patient.getNextPatient();
		}
		patient.setNextPatient(newPatient);
	}

	public int count() {
		if (this.root == null) {
			return 0;
		}
		int length = 0;
		Patient patient = this.root;
		do {
			length += 1;
			patient = patient.getNextPatient();
		} while (patient != null);
		return length;
	}

	public void prettyPrint() {
		Patient patient = this.root;
		do {
			patient.prettyPrint();
			patient = patient.getNextPatient();
		} while (patient != null);
	}

	public void removePatient(String name) {
		if (this.root != null && this.root.getName() == name) {
			this.root = this.root.getNextPatient();
			return;
		}
		Patient patient = this.root;
		do {
			if (patient.getNextPatient() != null && patient.getNextPatient().getName() == name) {
				patient.setNextPatient(patient.getNextPatient().getNextPatient());
				return;
			}
			patient = patient.getNextPatient();
		} while (patient != null);
	}

}
