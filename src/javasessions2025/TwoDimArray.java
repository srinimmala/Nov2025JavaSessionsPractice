package javasessions2025;
import java.util.Arrays;

public class TwoDimArray {
public static void main(String[] args) {
		
		
		int num[][] = new int[4][4];
		
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[0][3] = 40;
		
		//num[0][4] = 100;//AIOB
		//num[4][0] = 100;//AIOB
		
		System.out.println(Arrays.deepToString(num));
		
		System.out.println(num.length);//total number of rows
		
		
		//2d array literals:
		//3x3 = 9
		
		System.out.println("-------------");
		
		int numbers[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
			};
		
		System.out.println(Arrays.deepToString(numbers));

		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		//for each loop:
		for(int row[] : numbers) {
			for(int col: row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		//
		Object userData[][] = {
				{"Omkar", "automation", "om@gmai.com", "9090987676", "om@123", true},
				{"Vijay", "auto", "vj@gmai.com", "9090987679", "vj@123", false},
				{"Anu", "sharma", "anu@gmai.com", "8090987676", "an@123", true}
		};
		
		System.out.println(Arrays.deepToString(userData));

		for(Object row[] : userData) {
			for(Object col: row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		

	}

}
