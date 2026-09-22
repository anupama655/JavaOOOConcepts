class Employee {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

public class EncapsulationExample {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(101);
		System.out.println("Employee ID: " + employee.getId());
	}
}
