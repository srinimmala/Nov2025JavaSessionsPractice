package ExceptionHandling;

import java.io.FileInputStream;

public class Employee {

	String name;

	public static void testing() {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0;// AE
			System.out.println("hello");
			Employee obj = new Employee();
			obj = null;
			System.out.println(obj.name);// NPE
			
			
			
		}

		catch (NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}

		catch (ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
		
		catch (RuntimeException e) {
			System.out.println("some exception is coming....");
			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("some exception is coming....");
			e.printStackTrace();
		}
		
		catch (Throwable e) {
			System.out.println("some exception is coming....");
			e.printStackTrace();
		}
		
//		catch (Error e) {
//			System.out.println("some exception is coming....");
//			e.printStackTrace();
//		}
		

		System.out.println("Bye!!");
	}
	

	public static void main(String[] args) {

		testing();

	}

}