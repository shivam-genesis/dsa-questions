package classes;

public class Constructor {
	public static void main(String args[]) {
		Vehicle audi = new Audi("audiA4", "1000000", 4);
		Vehicle bmw = new BMW("320d", "1043423", 2);

		audi.testDrive();
		bmw.testDrive();
		
		System.out.println(audi.getQuantity());
		
		audi.setQuantity(audi.getQuantity()+10);
		
		System.out.println(audi.getQuantity());

		audi.setQuantity(audi.getQuantity()-3);
		
		System.out.println(audi.getQuantity());
	}
}

abstract class Vehicle {
	private String model;
	private String price;
	private Integer quantity;

	Vehicle(String model, String price, Integer quantity) {
		this.model = model;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public abstract void testDrive();
}

class Audi extends Vehicle {
	Audi(String model, String price, Integer quantity) {
		super(model, price, quantity);
	}

	public void testDrive() {
		System.out.println("Driving Audi!");
	}
}

class BMW extends Vehicle {
	BMW(String model, String price, Integer quantity) {
		super(model, price, quantity);
	}

	public void testDrive() {
		System.out.println("Not Available");
	}
}
