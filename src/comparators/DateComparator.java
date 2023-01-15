package comparators;

import java.util.Comparator;

public class DateComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if (e1.getDate().before(e2.getDate())) {
            return -1;
        } else if (e1.getDate().after(e2.getDate())) {
            return 1;
        } else {
            return 0;
        } 
		
	}
}