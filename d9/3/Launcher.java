public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	public void launch() {
		Company company = new Company();
		
		company.addEmployeeWithName("John");
		company.addEmployeeWithName("Paul");
		
		String employee = company.retrieveEmployeeName();
		System.out.println(employee);
	}
}
