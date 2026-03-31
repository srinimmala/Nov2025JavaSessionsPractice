package javasessions2025;

public class IfElseConcept {
	public static void main(String[] args) {

		System.out.println(10 == 10);
		
		int i = 10;
		System.out.println(i > 5);
		System.out.println(i<90);
		System.out.println(i>11);
		
		int p = 40;
		int m = 20;
		
		if(m > p) {//false
			System.out.println("hiii");
		}
		else {
			System.out.println("hello");
		}
		
		//
		if(false) { //Dead Code
			System.out.println("I love java");
		}
		else { 
			System.out.println("Bye!!");
		}
		
		//
		boolean flag = true;
		if(flag) {
			System.out.println("Java");
		}
		else {
			System.out.println("plz pick a prog lang");
		}
		
		//
		//nested if-if-if
		int marks = -10;
		if(marks >= 90) {
			if(marks >= 95) {
				System.out.println("Grade A");
					if(marks == 100) {
						System.out.println("Grade A++");
					}
			}
		}
		else {
			if(marks <= 80) {
				System.out.println("Grade B");
			}
			else {
				System.out.println("Bye!!");
			}
		}
		
		
		//AC: user is eligible for the voting if the user age is gr than or equal to 16:
		int age = 5;
		
		if(age >= 16) {
			System.out.println("eligible for voting");
		}
		else {
			System.out.println("age is less than 16...not eligible for voting ");
		}
		
		
		
		//parallel if-if-if-if....else
		String browser = "safari";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		if(browser.equals("edge")) {
			System.out.println("launch edge");
		}
		if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("plz pass the right browser..");
		}
		
		//if-elseif-elseif...else
//		String browser = "safari";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		else if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		else if(browser.equals("edge")) {
//			System.out.println("launch edge");
//		}
//		else if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		else {
//			System.out.println("plz pass the right browser..");
//		}
		
		
		//switch case statements
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
