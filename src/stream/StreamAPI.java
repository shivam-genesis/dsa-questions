package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 5, 7, 2, 1, 9, 4, 5, 6, 7, 8, 9, 10);
		List<Boolean> l = List.of(true, false, false, true, false);
		List<Student> lst = new ArrayList<>();
		lst.add(new Student(1, "Shivam", 400, List.of("2453", "128")));
		lst.add(new Student(2, "Vikas", 567, List.of("312", "878")));
		lst.add(new Student(3, "Ayush", 300, List.of("5767")));
		lst.add(new Student(4, "Sunny", 200, List.of("8779087")));
		lst.add(new Student(5, "Rupam", 100, List.of("989080", "132", "1345")));
		lst.add(new Student(6, "Dinesh", 899, List.of("09890", "54654")));
		lst.add(new Student(7, "Mahfooz", 456, List.of("0192", "786765")));
		lst.add(new Student(8, "Abhishek", 621, List.of("09804", "346542")));
		lst.add(new Student(9, "Ashutosh", 576, List.of("65765")));

		List<Boolean> a = l.stream().filter(e -> e == true).collect(Collectors.toList());
		System.out.println(a);

		System.out.println("--------------------------------------------------------------");

		list.stream().sorted().distinct().forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		System.out.println("--------------------------------------------------------------");
		// Sort basis of ID Use of comparable
		lst.stream().sorted((s1, s2) -> s1.getId() - s2.getId())
				.forEach(s -> System.out.println(s.getId() + " " + s.getName()));

		System.out.println("--------------------------------------------------------------");

		// Sort basis of marks Use of comparable for sorting
		lst.stream().sorted((s1, s2) -> s1.getMarks() - s2.getMarks())
				.forEach(s -> System.out.println(s.getId() + " " + s.getName() + " " + s.getMarks()));

		System.out.println("--------------------------------------------------------------");

		// Print objects of student where toString method is not present
		lst.stream().forEach(s -> System.out.println(s.getId() + " --> " + s.getName()));

		System.out.println("--------------------------------------------------------------");

		int id = 5;
		String name = "Rupam";
		List<Student> found = lst.stream().filter(p -> /* (p.getName().equals(name)) && */p.getId() == id)
				.collect(Collectors.toList());
		System.out.println(found);

		System.out.println("--------------------------------------------------------------");

		lst.stream().filter(s -> (s.getId() == id && s.getName().equals(name)))
				.forEach(s -> System.out.println(s.getId() + " --> " + s.getName()));

		System.out.println("--------------------------------------------------------------");

		// Getting even elements
		List<Integer> even_list = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(even_list);

		System.out.println("--------------------------------------------------------------");

		// Getting odd elements
		List<Integer> odd_list = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(odd_list);

		System.out.println("--------------------------------------------------------------");

		/* List<String> x = */ lst.stream().filter(s -> s.getId() > 3).forEach(s -> System.out
				.print(s.getName() + " "))/* map(s -> s.getName()).limit(5).collect(Collectors.toList()) */;
		// System.out.println(x);
		System.out.println();

		System.out.println("--------------------------------------------------------------");

		// Getting names of object having id equal to 4
		lst.stream().filter(s -> s.getId() == 4).forEach(s -> System.out.println(s.getName()));

		System.out.println("--------------------------------------------------------------");

		List<Integer> marks = lst.stream().map(s -> s.getMarks()).collect(Collectors.toList());
		System.out.println(marks);

		System.out.println("--------------------------------------------------------------");

		// Without using flatMap we getting unflattened data
		List<List<String>> contact = lst.stream().map(s -> s.getContactNum()).collect(Collectors.toList());
		System.out.println(contact);

		System.out.println();

		// By using flatMap getting flattened data
		List<String> contact_num = lst.stream().flatMap(s -> s.getContactNum().stream()).collect(Collectors.toList());
		System.out.println(contact_num);

		System.out.println("--------------------------------------------------------------");

		// getting elements having length less than 8 and converting them to uppercase
		List<String> placesToVisit = List.of("Shimla", "Manali", "Kedarnath", "Mussoorie", "Kasol");
		System.out.println(placesToVisit.stream().filter(place -> place.length() <= 8).map(place -> place.toUpperCase())
				.collect(Collectors.toList()));

		System.out.println("--------------------------------------------------------------");

		// Getting elements start with specific character
		List<String> startWith = placesToVisit.stream().filter(p -> p.startsWith("Manali"))
				.collect(Collectors.toList());
		System.out.println(startWith);

		System.out.println("--------------------------------------------------------------");

		// Getting elements end with specific character
		List<String> endWith = placesToVisit.stream().filter(p -> p.endsWith("i")).collect(Collectors.toList());
		System.out.println(endWith);

		System.out.println("--------------------------------------------------------------");

		// Counting elements equal to given id
		long count = lst.stream().filter(p -> p.getId() == id).count();
		System.out.println(count);

		System.out.println("--------------------------------------------------------------");

		// Convert list into Set
		Set<Integer> new_set = list.stream().collect(Collectors.toSet());
		System.out.println(new_set);

		System.out.println("--------------------------------------------------------------");

		// Convert list into hashmap
		Map<Integer, String> map = lst.stream().collect(Collectors.toMap(s -> s.getId(), s -> s.getName()));
		System.out.println(map);

		System.out.println("--------------------------------------------------------------");

		// Getting distinct elements
		List<Integer> new_list = list.stream().distinct().collect(Collectors.toList());
		System.out.println(new_list);

		System.out.println("--------------------------------------------------------------");

		// Counting distinct elements
		Long countDistinct = list.stream().distinct().count();
		System.out.println(countDistinct);

		System.out.println("--------------------------------------------------------------");

		// Sum of Id's
		int sumId = lst.stream().collect(Collectors.summingInt(s -> s.getId()));
		System.out.println(sumId);

		System.out.println("--------------------------------------------------------------");

		int sumEle = list.stream().collect(Collectors.summingInt(e -> e));
		System.out.println(sumEle);

		System.out.println("--------------------------------------------------------------");

		boolean ans = lst.stream().anyMatch(s -> s.getName().equalsIgnoreCase("Ayush") && s.getId() == 3);
		System.out.println(ans);

		System.out.println("--------------------------------------------------------------");

		boolean ans1 = list.stream().anyMatch(e -> e == 20);
		System.out.println(ans1);

		System.out.println("--------------------------------------------------------------");

		Student stu_max = lst.stream().max((student1, student2) -> student1.getMarks() > student2.getMarks() ? 1 : -1)
				.get();
		System.out.println(stu_max);

		System.out.println("--------------------------------------------------------------");

		Student stu_min = lst.stream().min((student1, student2) -> student1.getMarks() > student2.getMarks() ? 1 : -1)
				.get();
		System.out.println(stu_min);

		List<Student> s = lst.stream().sorted((s1, s2) -> s1.getContactNum().size() - s2.getContactNum().size())
				.collect(Collectors.toList());
		System.out.println(s);
	}
}