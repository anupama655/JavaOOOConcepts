import java.util.Arrays;
import java.util.List;

public class ModernJavaFeatures {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Anu", "Ravi", "Priya");

		System.out.println("Lambda and Streams:");
		names.stream()
				.filter(name -> name.length() > 3)
				.forEach(System.out::println);
		System.out.println("Arrays.asList and Streams demonstrated.");
	}
}
