package comparators;

import java.util.Comparator;

public class CityComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.getCity().compareToIgnoreCase(e2.getCity());
	}
}
