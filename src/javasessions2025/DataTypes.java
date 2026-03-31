package javasessions2025;

public class DataTypes {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.println(1000);		
		System.out.println("I love Java");
		
		//Data Types:
		//1. primitive type data types: fixed memory size: int, double, boolean , char..etc...
		//2. Non-primitive Data types: Class, String, object, interface, array, OOPs
		
		
		//primitive type data types:
		//1. Numeric Type: 
				//Integral Value:
					//a. Integer : byte, short, int, long
					//b. Floating - point: 	float, double
				//character Value: char: 1, #, $, a
		//2. Boolean type: boolean: true/false
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127 => -2^7 to 2^7-1
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = 0;
		byte b4 = 127;
		byte b5 = -10;
		byte b6 = -128;
		byte age = 30;
		
		System.out.println(b1);
		System.out.println(age);
		
		//2. short: 
		//size: 2 bytes = 2x8 = 16 bits
		//range: -32768 to 32767 ==> -2^15 to 2^15-1
		short s1 = 1000;
		short s2 = -900;
		System.out.println(s1);
		System.out.println(s1+s2);
		
		//3. int:
		//size: 4 bytes = 4x8 = 32 bits
		//range: -2147483648 to 2147483647 ==> -2^31 to 2^31-1
		
		int i = 1989898989;
		
		
		//4. long:
		//size: 8 bytes = 8x8 = 64 bits
		//range: -2^63 to 2^63-1
		long l1 = 10;
		System.out.println(l1);
		long num = 9898765678L;
		System.out.println(num);
		
		
		int p = 10;
		p = 20;
		p = 30;
		System.out.println(p);
		
		//5. float:
		//size: 4 bytes = 4x8 = 32 bits
		//range: after . it may take upto 6-7 digits
		float t = 12.33f;
		float t1 = (float) 34.44;
		System.out.println(t1);
		System.out.println(t);
		
		float f3 = 121212121.90f;
		System.out.println(f3);

		//6. double:
		//size: 8 bytes = 8x8 = 64 bits
		//range: after . it may take upto 15-16 digits
		double d1 = 12.3333;
		double d2 = -909.98989;
		
		//BigDecimal class: for long ranges
		
		
		//7. char:
		//within single quotes: ''
		//can hold only single digit value
		//size: 2 bytes = 16 bits
		//chinese, arabic, symbols, unicodes
		//size: ASCII/UniCode
		char ch = 'a'; //a to z
		char ch1 = 'Z'; //A to Z
		char ch2 = '1'; //0 to 9
		char ch3 = '$';
		char gender = 'f';
		char executionFlag = 'Y';
		
		//8. boolean: 
		//range: true/false
		//size: ~ 1 bit
		boolean flag = true;
		boolean isActive = false;
		
		System.out.println(flag);
		System.out.println(isActive);
		
		//mobile number, SSN, AAdhar card, CC number, FAX number
		//--- String only
		String phone = "8989876543";
		String CC = "1221 2323 3434 5656";	

	}

}