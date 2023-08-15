package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {
	public static void main(String[] args) {
		List<Employee> empl = new ArrayList<>();
		empl.add(new Employee(45, "Shivam", "123456"));
		empl.add(new Employee(67, "Rupam", "123456987"));
		empl.add(new Employee(90, "Vikas", "12345632"));
		empl.add(new Employee(10, "Ayush", "1234"));
		empl.add(new Employee(46, "Sunny", "1256"));
		empl.add(new Employee(7, "Abhishek", "3456"));

		System.out.println(empl);// Print without sorting
		Collections.sort(empl);
		System.out.println(empl);// Print after sorting

		List<Employee> e = empl.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		System.out.println(e);

		List<Employee> emp = empl.stream().sorted((e1, e2) -> e1.getPhone().length() - e2.getPhone().length()).collect(Collectors.toList());
		for(Employee em : emp) {
			System.out.println(em);
		}
	}
}