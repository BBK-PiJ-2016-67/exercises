public class Hospital {

	private Patient root;

	public void addPatient(Patient newPatient) {
		if (this.root == null) {
			this.root = newPatient;
			this.root.setNextPatient(this.root);
			return;
		}
		Patient patient = this.root;
		while (!patient.getNextPatient().equals(this.root)) {
			patient = patient.getNextPatient();
		}
		patient.setNextPatient(newPatient);
		patient.getNextPatient().setNextPatient(this.root);
	}

	public int count() {
		if (this.root == null) {
			return 0;
		}
		int length = 1;
		Patient patient = this.root;
		while (!patient.getNextPatient().equals(this.root)) {
			length += 1;
			patient = patient.getNextPatient();
		}
		return length;
	}

	public void prettyPrint() {
		if (this.root == null) {
			return;
		}
		Patient patient = this.root;
		do {
			patient.prettyPrint();
			patient = patient.getNextPatient();
		} while (!patient.equals(this.root));
	}

	public void removePatient(String name) {
		if (this.root == null) {
			return;
		}
		if (this.root.getName() == name) {
			this.root = this.root.getNextPatient();
			return;
		}
		Patient patient = this.root;
		while (!patient.getNextPatient().equals(this.root)) {
			if (patient.getNextPatient().getName() == name) {
				patient.setNextPatient(patient.getNextPatient().getNextPatient());
				return;
			}
			patient = patient.getNextPatient();
		}
	}

}
