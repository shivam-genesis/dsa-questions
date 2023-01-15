package stream;

import java.util.List;

public class Student {
	public Student(int id, String name, Integer marks, List<String> contactNum) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.contactNum = contactNum;
	}

	private int id;
	private String name;
	private Integer marks;
	private List<String> contactNum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public List<String> getContactNum() {
		return contactNum;
	}

	public void setContactNum(List<String> contactNum) {
		this.contactNum = contactNum;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", contact=" + contactNum + "]";
	}
}
