package javasessions2025;

public class StringConcatenation {

	public static void main(String[] args) {
		
		
		//String - inbuilt class in java
		//Non-primitive Data types
		
		String s = "I love java programming";
		System.out.println(s);
		
		int a = 100;
		int b = 200;
		
		String x = "hello";
		String y = "selenium";
		
		System.out.println(a+b);//300
		System.out.println(x+y);//helloselenium
		System.out.println(a+x);//100hello
		
		System.out.println(a+b+x+y);//300helloselenium
		System.out.println(x+y+a+b);//helloselenium100200
		System.out.println(x+y+(a+b));//helloselenium300
		
		System.out.println(a+b+x+y+a+b);//300helloselenium100200
		
		System.out.println("the value of a : " + a);
		System.out.println("the value of b : " + b);
		System.out.println("the sum is : " + (a+b));
		
		double d1 = 12.33;
		double d2 = 23.33;
		
		System.out.println(a+b+x+y+d1+d2);
		System.out.println(a+b+x+y+(d1+d2));

		char ch1 = 'a';
		String s1 = "Testing";
		
		System.out.println(ch1+s1+10+20);
		
		boolean flag = true;
		String name = "Kumar";
		System.out.println(flag + name);
		
		//System.out.println(flag + 'a'); //error
		
		System.out.println('a' % 2);
		
		
		

	}

}
