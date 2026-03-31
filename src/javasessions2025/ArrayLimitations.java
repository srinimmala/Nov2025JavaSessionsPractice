package javasessions2025;
import java.util.Arrays;

public class ArrayLimitations {
public static void main(String[] args) {
		
		//limitations of array:
		//1. size is fixed: static array: to overcome this, we need to use dynamic arrays (ArrayList)
		//2. similar type of data: to overcome this, we need to use Object static array or ArrayList
		
		
		//emp info: name(String), age(int), salary(double), gender(char), isPermanent(boolean)
		
		Object empInfo[] = new Object[5];//0-4, li=0, hi=4, len = 5
		System.out.println(Arrays.toString(empInfo));
		
		empInfo[0] = "Anu";
		empInfo[1] = 35;
		empInfo[2] = 34.55;
		empInfo[3] = 'f';
		empInfo[4] = true;
		//empInfo[5] = "Pune";//AIOB
		
		System.out.println(Arrays.toString(empInfo));
		
		
		for(Object ele : empInfo) {
			System.out.println(ele);
		}
		
		System.out.println("------");
		
		for(int i=0; i<=empInfo.length-1; i++) {
			System.out.println(empInfo[i]);
		}
				
		
		

	}

}
