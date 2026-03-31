package javasessions2025;

public class LoopsConcept {
	public static void main(String[] args) {

		// while loop:
		// 1 to 10:

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("---------");

		// 10 to 1:
		int j = 10;
		while (j >= 1) {
			System.out.println(j);
			j--;
		}

		System.out.println("---------");

		int l = 1;
		while (l <= 10) {
			System.out.println("hi");
			l++;// 2
		}

		System.out.println("---------");

		while (true) {
			System.out.println("welcome to Hotel TAJ");
			break;
		}
		System.out.println("---------");

		int n = 1;
		while (n <= 10) {
			if (n % 2 == 0) {
				System.out.println(n + " is even number");
			}
			n++;
		}

		System.out.println("---------");

		int total = 1;

		while (total <= 100) {
			System.out.println("Hello!!");
			if (total == 10) {
				System.out.println("BYE!!!");
				break;
			}
			total++;// 2
		}

		System.out.println("---------");

		// 2. for loop:
		// 1 to 10:

		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}

		System.out.println("---------");

		for (; true;) {
			System.out.println("hey!!!");
			break;
		}

		System.out.println("---------");

		for (int k = 1; k <= 50; k++) {
			if (k % 5 == 0) {
				System.out.println(k);
			}
		}

		System.out.println("---------");

		// a-z:
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);// ab...z
		}

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);// 0 to 9
		}

		for (char ch = '0'; ch <= '9'; ch++) {
			System.out.println(ch);// 0 to 9
		}

		System.out.println("---------");

		//
		for (short b = 1; b <= 200; b++) {
			System.out.println(b);
		}

		//
		for (float r = 1.1f; r <= 5.5; r++) {
			System.out.println(r);
		}

		System.out.println("---------");

		// 10 to 1:
		for (int t = 10; t >= -10; t--) {
			System.out.println(t);// 109876543210-1-2.....-10
		}

		//use cases of while loop:
		//when number of iterations are not fixed...use while loop:
		//1. wait for element: 0 1 4 9 15
		//2. wait for page loading: 2 8 10 15 20
		//3. calendar handling: 
		//4. zomato/instagram/linkedin: infinite scrolling
		//5. carousel
		//6. webtable with pagination: 
		//7. database data: 
		//8. file reading: 
		
		//use cases for loop:
		//when number of iterations are  fixed...use for loop:
		//arrays
		//month drop down: jan to dec: 1 to 12
		//day: 1 to 31
		//category dropdown: 1 to 5
		//footer links 10 
		
		System.out.println("----------------");
		
		//3. do-while loop:
		
		int p = 1;
		do {
			System.out.println(p);//12345678910
			p++;//11
		}
		while(p<=10);
		
		System.out.println("----------------");

		do {
			System.out.println("welcome to NAL");
			//break;
		}
		while(false);
		
		System.out.println("Bye!!");
		
		//
		int r1 = 1;
		while(r1>=10) {
			System.out.println("hello");
			r1++;
		}
		//
		int p1 = 1;
		do {
			System.out.println("hello");
			p1++;
		}
		while(p1>=10);
		
		//use case of do-while:
		//element is present on the page already...no need to wait for the element
		//if ele is not present then only start the wait using loop:
		

	}

}
