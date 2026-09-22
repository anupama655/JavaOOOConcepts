class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Student: " + name);
	}
}

public class ConstructorsExample {
	public static void main(String[] args) {
		new Student("Anu").display();
	}
}
