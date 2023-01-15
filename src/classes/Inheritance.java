package classes;
public class Inheritance
{
	public static void main(String args[])
	{
		teacher t = new teacher();
		singer s = new singer();
		t.name = "Shivam";
		s.name = "Ayush";
		t.teach();
		s.sing();
		t.eat();
		t.walk();
		s.eat();
		s.walk();
	}
}

class Person
{
	String name;
	public void eat()
	{
		System.out.println(name+" eats!");
	}
	public void walk()
	{
		System.out.println(name+" walks!");
	}
}

class teacher extends Person
{
	public void teach()
	{
		System.out.println(name+" teach!");
	}
}

class singer extends Person
{
	public void sing()
	{
		System.out.println(name+" sing!");
	}
}
