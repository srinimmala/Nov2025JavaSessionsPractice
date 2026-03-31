package accessmodifiers;

public class Car {
	public String name;
	private int price;
	String color;
	protected int licenseNumber;
	

	public static void main(String[] args) {

		Car c = new Car();
		c.name = "BMW";
		c.price = 100;
		c.color = "Red";
		c.licenseNumber = 121212;

	}
}
