public class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}
	
	// accessor
	public String getName() {
		return name;
	}

	// mutators
	public void setName(String name) {
		this.name = name;
	}

	// print information test 
	public void printDetails() {
		System.out.println("Name: " + name);
	}
}
