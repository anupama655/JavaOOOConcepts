class MathOps {
	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}
}

class Animal {
	void sound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		MathOps mathOps = new MathOps();
		System.out.println("Overload: " + mathOps.add(10, 20));
		System.out.println("Overload: " + mathOps.add(10.5, 20.5));
		Animal animal = new Dog();
		animal.sound();
	}
}
