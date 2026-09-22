import java.time.LocalDate;
import java.util.ArrayList;

public class PackagesAndAPIs {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Java");
		names.add("OOP");
		System.out.println("List: " + names);
		System.out.println("Date: " + LocalDate.of(2026, 9, 22));
	}
}
