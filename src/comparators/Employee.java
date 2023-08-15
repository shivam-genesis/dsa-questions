package comparators;

import java.util.Date;

public class Employee {
	public Employee(int id, String name, String phone, Date date, String city) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.date = date;
		this.city = city;
	}

	private int id;
	private String name;
	private String phone;
	private Date date;
	private String city;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", date=" + date + ", city= " + city
				+ "]";
	}
}