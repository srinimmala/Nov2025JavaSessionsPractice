package OOP_Abstract;

public abstract class Page {

	// abs methods + non abs methods:
	// can not create the object of abstract class
	
	//can we create the const.. of the abstract class: YES
	//it will be called when you create the object of the child class.
	
	//0 to 100% abstraction
	//0 abstract methods: 0% abstraction
	//0 non abstract methods (only abs methods): 100% abstraction 
	// some abs + some non abs methods: partial abstraction
	
	
	public Page() {
		System.out.println("Page ..default const....");
	}
	
	public Page(int a) {
		System.out.println("Page ..one param const...." + a);
	}
	
	public Page(int a, int b) {
		System.out.println("Page ..two param const...." + a+b);
	}
	

	public abstract void title();
	public abstract void url();

	public void loadingTime() {
		System.out.println("Page -- loading time : 10 secs");
	}

	public static final void logo() {
		System.out.println("Page -- logo");
	}

}
