package OOP_Inheritance;

public class BMW extends Car {

	//Method Overriding: when we have a method in the parent class and the same method in the child class:
	//1. with the same name
	//2. with the same number of parameters
	//3. with the same return type
	//Poly+Morphism: dynamic (Run time)
	
	public int minSpeed = 200;
	
	public void dashboard() {
		System.out.println("dashboard details");
		System.out.println(super.minSpeed);//100
		System.out.println(minSpeed);//200
		super.start(); //car start
		start();//BMW start
	}
	
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
		super.start();
		System.out.println("BMW -- start logic");
		System.out.println(minSpeed);
		System.out.println(super.minSpeed);
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}

	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
	//this method is not not overridden
	//Method Hiding
	public static void billing() {
		System.out.println("BMW -- billing");
	}
	
	//BMW.billing() --> BMW
	//Audi.billing() --> Car
	
	
	
	

}
