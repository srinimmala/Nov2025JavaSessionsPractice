package FunctionsConcept;

public class App {
	public static void t1() {
		System.out.println("t1 method");
		App.t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		App.t3();
	}

	public static void t3() {
		System.out.println("t3 method");
	}

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		App.t1();//NS --> S
	}

	public static void main(String[] args) {
		App a1 = new App();
		a1.m1();
		//App.t1();
		
		//S --> S : use class name
		//NS --> NS : direct calling
		//NS --> S: use class name
		//S --> NS: use class object ref name
		
		

	}
}
