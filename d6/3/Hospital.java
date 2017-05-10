public class Hospital {

	private Patient root;
	private Patient last;

	public void addPatient(Patient newPatient) {
		if (this.root == null) {
			this.root = newPatient;
			this.last = newPatient;
			return;
		}
		Patient patient = this.root;
		while (patient.getNextPatient() != null) {
			patient = patient.getNextPatient();
		}
		newPatient.setPrevPatient(patient);
		patient.setNextPatient(newPatient);
		this.last = newPatient;
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
		while (patient != null) {
			patient.prettyPrint();
			patient = patient.getNextPatient();
		}
	}

	public void prettyPrintReverse() {
		Patient patient = this.last;
		while (patient != null) {
			patient.prettyPrint();
			patient = patient.getPrevPatient();
		}
	}

	public void removePatient(String name) {
		if (this.root != null && this.root.getName() == name) {
			this.root = this.root.getNextPatient();
			this.root.setPrevPatient(null);
			return;
		}
		Patient patient = this.root;
		do {
			if (patient.getNextPatient() != null && patient.getNextPatient().getName() == name) {
				patient.setNextPatient(patient.getNextPatient().getNextPatient());
				if (patient.getNextPatient() == null) {
					this.last = patient;
				} else {
					patient.getNextPatient().setPrevPatient(patient);
				}
				return;
			}
			patient = patient.getNextPatient();
		} while (patient != null);
	}

}
