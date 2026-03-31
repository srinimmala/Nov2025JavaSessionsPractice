package OOP_Inheritance;

public class Car extends Vehicle {
	
	public final int minSpeed = 100;
	

	public void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");
	}

	public void refuel() {
		System.out.println("car -- refuel");
	}

	@Override
	public void engine() {
		System.out.println("car -- engine");
	}

	// final method: can not be overridden
	public final void parts() {
		System.out.println("car -- parts");
	}

	// static method:can not be overridden
	public static void billing() {
		System.out.println("car -- billing");
	}

	// private method: can not be overridden
	private void payment() {
		System.out.println("car -- payment");
	}

}
