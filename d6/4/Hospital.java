public class Hospital {

	private Patient root;

	public void addPatient(Patient newPatient) {
		Patient patient = this.root;
		if (patient == null) {
			this.root = newPatient;
			patient = this.root;
		} else {
			do {
				patient = patient.getNextPatient();
			} while (!patient.equals(this.root));
			patient.setNextPatient(newPatient);
			patient = patient.getNextPatient();
		}
		patient.setNextPatient(this.root);
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
		} while (!patient.equals(this.root));
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
