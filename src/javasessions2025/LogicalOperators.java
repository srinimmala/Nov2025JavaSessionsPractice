package javasessions2025;

public class LogicalOperators {
public static void main(String[] args) {
		
		
		int i = 5;
		int j = 20;
		
		if(i>=10 & j>=20 & i>=30 & i<=0) {//f & t & f & f ==> f
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		
		//&& -- short circuit operator
		if(i>=1 && j>=20 && i>=30 && i<=0) {//t && t && f
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		
		
		
		System.out.println("-----");
		
		if(false & true & true & true & false & true) { //f & t & t & t & f & t == f
			System.out.println("Hello");
		}
		else {
			System.out.println("bye");
		}
		
		
		if(false && true && true && true && false && true) { //f 
			System.out.println("Hello");
		}
		else {
			System.out.println("bye");
		}
		
		
		System.out.println("-----");

		// | ||
		
		int m = 10;
		int n = 20;
		
		if(m>=10 | n<=5 | n<=2 | n< 1) { //t | f | f | f ==> t
			System.out.println("selenium");
		}
		else {
			System.out.println("Playwright");
		}
		
		System.out.println("-----");

		if(m>=10 || n<=5 || n<=2 || n< 1) { //t
			System.out.println("selenium");
		}
		else {
			System.out.println("Playwright");
		}
		
		
		
		if(false | true | true | true | false | true) { //
			System.out.println("Hello");
		}
		else {
			System.out.println("bye");
		}
		
		if(false || true || true || true || false || true) { //f || t
			System.out.println("Hello");
		}
		else {
			System.out.println("bye");
		}
		
		
		System.out.println("-----------");
		
		//WAP - to find put the highest number (given 3 diff numbers):
		
		int a = 1000;
		int b = 900;
		int c = 1200;
		
		if(a>b && a>c) { //t && f ==> f
			System.out.println("a is the greatest");
		}
		else if(b>c) {//f
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}
		
		
		

	}


}
