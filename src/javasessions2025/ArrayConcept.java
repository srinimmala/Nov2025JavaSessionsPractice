package javasessions2025;
import java.util.Arrays;

public class ArrayConcept {
public static void main(String[] args) {
		
		//array: the collection of similar types of values
		
		//declare the array: using new keyword:
		
		//int array:
		int i[] = new int[4]; //0-3; li=0; hi=3; length=4
		
		//i[-1] = 5;//AIOB
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;//AIOB
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException - AIOB - RT
		//System.out.println(i[-1]);//AIOB
		
		System.out.println("------");
		
		int p[] = new int[4];
		p[0] = 10;
		p[2] = 30;
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		
		
		System.out.println("------");

		//byte array:
		byte b[] = new byte[2];//0-1; li=0; hi=1; l=2
		System.out.println(Arrays.toString(b));
		System.out.println(b.length);//2
		
		System.out.println("------");

		
		//short array:
		short sh[] = new short[3]; //0-2; li=0; hi=2; l=3
		System.out.println(Arrays.toString(sh));

		System.out.println("------");

		//float array:
		float marks[] = new float[5]; //0-4; li=0; hi=4; l=5
		marks[0] = 12.33f;
		marks[1] = 22.33f;
		marks[2] = 12.34f;
		marks[4] = 100;
		System.out.println(Arrays.toString(marks));

		
		System.out.println(marks[0]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);//0.0
		System.out.println(marks[4]);

		
		System.out.println("------");

		//char array:
		char name[] = new char[4]; //0-3; li=0; hi=3; l=4
		
		name[0] = 'v';
		name[1] = 'i';
		name[2] = '$';
		System.out.println(Arrays.toString(name));

		
		System.out.println(name[0]);
		System.out.println((int)name[3]);
		
		//boolean array:
		boolean flag[] = new boolean[2];
		flag[0] = true;
		flag[1] = false;
		
		System.out.println("------");

		//String array:
		String browser[] = new String[4];//0-3; li=0; hi=3; l=4
		browser[0] = "chrome";
		browser[1] = "firefox";
		browser[2] = "edge";
		browser[3] = "ie";

		System.out.println(browser.length);//4
		
		System.out.println(Arrays.toString(browser));
		
		for(int k=0; k<=browser.length-1; k++) {
			System.out.println(browser[k]); 
			
		}
		
		System.out.println("-----------");
		

		
		System.out.println(browser[0]);
		System.out.println(browser[3]);
		//System.out.println(browser[4]);//AIOB

		System.out.println("-------------------");
		
		int m[] = new int[4]; //0-3; li=0; hi=3; l=4
		m[0] = 10;
		m[1] = 20;
		m[2] = 30;
		m[3] = 40;
				
		System.out.println(m);//[I@515f550a
		System.out.println(Arrays.toString(m));
		
		
		System.out.println(m.length);//4
		
		
		//to print all the values of array: iteration of the array: using for loop:
		
		//1. index based for loop:
		for(int k=0; k<=m.length-1; k++) {
			System.out.println(m[k]);//10 20 30 40
		}
		
		System.out.println("-------");
		
		//2. for each loop: advance for loop:
		for(int e : m) {
			System.out.println(e);
		}
		
		System.out.println("-------");

		
		
		
		
		
		

		//
		//int c[] = new int[-1];//NegativeArraySizeException: -1
		int c[] = new int[0];//[] empty array
		System.out.println(c.length);//0
		//c[0] = 10;//AIOB
		System.out.println(Arrays.toString(c));//[]
		
		
		

	}

}
