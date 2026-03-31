package superKeyword;

public class Car {
	
	public final int minSpeed = 100;
	
	
	public Car() {
		this(200);
		System.out.println("car -- default const...");
	}
	
	public Car(int a) {
		System.out.println("car -- one param const..." + a);
	}
	
	public Car(int a, int b) {
		System.out.println("car -- two param const..." + a+b);
	}
	
	
	public void start() {
		System.out.println("car -- start");
	}
	
	

}