class Car {
	String brand;

	void drive() {
		System.out.println(brand + " is driving.");
	}
}

public class ClassAndObject {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "Toyota";
		car.drive();
	}
}
