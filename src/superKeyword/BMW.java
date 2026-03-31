package superKeyword;

public class BMW extends Car{
	
	public final int minSpeed = 200;

	//if we dont have any const... then java will add one hidden default const.. here in the class
	
	public BMW() {
		System.out.println("BMW -- default const...");
	}
	
	public BMW(int a) {
		super(100);
		System.out.println("BMW -- one param const..." + a);
	}
	
	public BMW(int a, int b) {
		//call parent class const... using super() keyword
		super(a, b);
		System.out.println("BMW -- two param const..." + a+b);
	}
	
		
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	
	

}