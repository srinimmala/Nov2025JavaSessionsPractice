package FunctionsConcept;

public class MainMethodOverloading {
	public static void login() {

	}

	public static void login(int otp) {
		System.out.println(otp);
	}

	public static void login(String un, String pwd) {

	}

	public static void main(int a, int b) {
		System.out.println("main method " + (a + b));

	}

	public static void main(int a) {
		System.out.println("main method " + a);

	}

	// psvm String[]
	public static void main(String[] a) {
		System.out.println("main method");
		//System.out.println(a[0]);// AIOB

		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, 20);
		
		MainMethodOverloading.login(1020);
		
		
	}

}
