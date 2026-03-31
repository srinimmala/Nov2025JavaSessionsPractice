package javasessions2025;
import java.util.Arrays;

public class ArrayLiterals {
public static void main(String[] args) {
		
		//ArrayLiterals: static array.
		int i[] = {10,20,30,40,50}; //0-4, li=0; hi=4; len=5
		
		System.out.println(i.length);
		
		System.out.println(Arrays.toString(i));
		
		System.out.println(i[0]);
		
		//i[5] = 60;//AIOB
		i[0] = 5;
		System.out.println(Arrays.toString(i));

		for(int m=0; m<=i.length-1; m++) {
			System.out.println(i[m]);
		}
		
		for(int e : i) {
			System.out.println(e);
		}
		
		
		String browser[] = {"chrome", "firefox", "edge", "safari"};
		
		Object productInfo[] = {"Macbook Pro", 1000, true, 4.8, 'y'};
		
		
		
		

	}

}
