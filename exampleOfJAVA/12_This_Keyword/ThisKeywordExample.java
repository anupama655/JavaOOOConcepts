class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Name: " + this.name);
	}
}

public class ThisKeywordExample {
	public static void main(String[] args) {
		new Person("Anu").display();
	}
}
