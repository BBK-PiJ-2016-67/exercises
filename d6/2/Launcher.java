public class Launcher {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();

		System.out.println(hospital.count());

		System.out.println("---");

		hospital.addPatient(new Patient("Lucas"));

		System.out.println(hospital.count());

		System.out.println("---");

		hospital.addPatient(new Patient("Jack"));
		hospital.addPatient(new Patient("Ana"));
		hospital.addPatient(new Patient("Imran"));
		hospital.addPatient(new Patient("Olivia"));
		hospital.addPatient(new Patient("Paul"));
		hospital.addPatient(new Patient("Chris"));
		hospital.addPatient(new Patient("Vivian"));
		hospital.addPatient(new Patient("Lee"));
		hospital.addPatient(new Patient("Robin"));

		hospital.prettyPrint();

		System.out.println("---");

		System.out.println(hospital.count());

		System.out.println("---");

		hospital.removePatient("Lucas");
		hospital.removePatient("Olivia");
		hospital.removePatient("Lee");
		hospital.removePatient("Robin");

		hospital.prettyPrint();

		System.out.println("---");

		System.out.println(hospital.count());
	}

}
