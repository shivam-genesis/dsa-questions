package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortEmployee {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(45, "Shivam", "123456", new Date("23/06/1998"),"Ghaziabad"));
		emps.add(new Employee(67, "Rupam", "123456987", new Date("03/03/1996"),"Noida"));
		emps.add(new Employee(90, "Vikas", "12345632", new Date("21/06/1995"),"Gurgoan"));
		emps.add(new Employee(10, "Ayush", "1234", new Date("28/04/1996"),"Delhi"));
		emps.add(new Employee(46, "Sunny", "1256", new Date("13/02/1997"),"Meerut"));
		emps.add(new Employee(98, "Abhishek", "3456", new Date("05/03/1999"),"Hapur"));

		Collections.sort(emps, new IdComparator());
		System.out.println(emps);
		
		Collections.sort(emps, new NameComparator());
		System.out.println(emps);
		
		Collections.sort(emps, new DateComparator());
		System.out.println(emps);
		
		Collections.sort(emps, new CityComparator());
		System.out.println(emps);
	}

}
