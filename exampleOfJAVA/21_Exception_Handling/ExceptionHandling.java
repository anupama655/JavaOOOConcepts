public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int x = 10 / 0;
			System.out.println(x);
		} catch (ArithmeticException exception) {
			System.out.println("Exception caught: " + exception.getMessage());
		} finally {
			System.out.println("Finally block executed.");
		}
	}
}
