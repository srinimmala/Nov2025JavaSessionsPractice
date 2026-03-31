package javasessions2025;

public class SwitchCaseStatements {
public static void main(String[] args) {
		
		
		String browser = "Chrome";
		int version = 100;
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			
				switch (version) {
				case 100:
					System.out.println("chrome v100.0");
					int p = 100;
					
					break;

				default:
					break;
				}
			System.out.println("hello chrome.....");
			break;
			
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("plz pass the right browser name..." + browser);
			break;			
			
		case "ie":
			System.out.println("launch ie");
			break;	
			
		}
		
		System.out.println("enter the url");
		
		
		//1 - 100
		//byte, short, int, String -- allowed
		//long, float, double, boolean -- is not allowed
		int marks = 90;
		
		switch (marks) {
		case 90:
			System.out.println("grade A");
			break;
		case 50:
			System.out.println("grade B");
			break;
		case 100:
			System.out.println("grade A++");
			break;
		case 0:
			System.out.println("FAILED");
			break;

		default:
			System.out.println("invalid marks");
			break;
		}
		
		
		//boolean in switch case: not allowed
		
//		boolean flag = true;
//		
//		switch (flag) {
//		case true:
//			
//			break;
//		case false:
//			
//			break;
//
//		default:
//			break;
//		}
		
		
		//char: numeric:
		char ch = 't';
		
		switch (ch) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;

		default:
			System.out.println(ch + " is a consonant");
			break;
		}
		
		
		
		char th = 'B';
		
		switch (th) {
		case 65:
			System.out.println("hiii");
			break;
		case 'B':
			System.out.println("hello");
			break;

		default:
			System.out.println("BYE");
			break;
		}
		
		//use cases of switch case:
		//1. cross browser testing: ch/ff/edge/safari
		//2. cross OS/Platform: windows/mac/linux
		//3. multi env testing: qa/dev/stage/uat/prod
		//4. devices: ios/andorid/windows/desktop/browser
		//5. uber app: type of car: mini/sedan/suv/
		//6. RABC: users: admin/customer/seller/cat manager/vendor/delivery
		//7. payment methods: upi/paypal/cc/emi
		//8. api automation: GET/POST/PUT/DELETE
		
		

	}
}
