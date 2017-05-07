public class Company {
	
	private List<Employee> employees;
	
	public Company() {
		employees = new List<Employee>();
	}
	
	public void addEmployeeWithName(String employeeName) {
		Employee employee = new Employee(employeeName);
		employees.insert(employee);
	}
	
	public String retrieveEmployeeName() {
		Employee employee = employees.retrieve();
		return employee.name;
	}

}