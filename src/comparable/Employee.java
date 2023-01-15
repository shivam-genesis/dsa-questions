package comparable;

//Comparable is restrict to only one attribute sorting 
public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String phone;

	public Employee(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int compareTo(Employee e) {
		//return this.id-e.id; //for ascending order
		//return e.id-this.id; //for descending order
		return (this.name).compareTo(e.name); //for comparing name in ascending order
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
}