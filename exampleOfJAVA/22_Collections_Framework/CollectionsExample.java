import java.util.*;

public class CollectionsExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");

		Set<String> set = new HashSet<>(list);

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "OOP");

		Queue<String> queue = new LinkedList<>();
		queue.add("First");
		queue.add("Second");

		System.out.println("List: " + list);
		System.out.println("Set: " + set);
		System.out.println("Map: " + map);
		System.out.println("Queue: " + queue);
	}
}
