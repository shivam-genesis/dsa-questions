package classes;
import java.util.Scanner;
public class Pet 
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		System.out.println("Enter dog name: ");
		dog1.name = sc.nextLine();
		
		dog2.name = "Liza";
		cat1.name = "Pussy";
		cat2.name = "Pissy";
		dog1.breed = "Lebra";
		dog2.breed = "Husky";
		cat1.breed = "Persian";
		cat2.breed = "White";
		dog1.description();
		dog1.jump();
		dog2.description();
		dog2.jump();
		cat1.description();
		cat1.sit();
		cat2.description();
		cat2.sit();
	}
}

class Dog
{
	String name;
	String breed;
	public void description()
	{
		System.out.println(name+" is "+breed);
	}
	
	public void jump()
	{
		System.out.println(name+" jumps!");
	}
}

class Cat
{
	String name,breed;
	public void description()
	{
		System.out.println(name+" is "+breed);
	}
	
	public void sit()
	{
		System.out.println(name+" sits!");
	}
}
