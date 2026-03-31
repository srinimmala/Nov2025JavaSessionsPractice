package javasessions2025;
import java.util.Arrays;

public class LoopsIteration {
	public static void main(String[] args) {

		int m[] = new int[4]; // 0-3; li=0; hi=3; l=4
		m[0] = 10;
		m[1] = 20;
		m[2] = 30;
		m[3] = 40;

		for (int ele : m) {
			System.out.println(ele);
		}

		System.out.println("---------");

		float marks[] = new float[5]; // 0-4; li=0; hi=4; l=5
		marks[0] = 12.33f;
		marks[1] = 22.33f;
		marks[2] = 12.34f;

		for (float ele : marks) {
			System.out.println(ele);
		}

		System.out.println("---------");

		char name[] = new char[4]; // 0-3; li=0; hi=3; l=4

		name[0] = 'v';
		name[1] = 'i';
		name[2] = '$';
		name[3] = '0';

		for (char ele : name) {
			System.out.println(ele);
		}

		System.out.println("---------");

		String browser[] = new String[4];// 0-3; li=0; hi=3; l=4
		browser[0] = "chrome";
		browser[1] = "firefox";
		browser[2] = "edge";
		browser[3] = "ie";

		for (String ele : browser) {
			System.out.println(ele);
		}

		System.out.println("---------");

		int num[] = new int[4]; // 0-3; li=0; hi=3; l=4
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;

		// 3 to 0
		for (int i = 3; i >= 0; i--) {
			System.out.println(num[i]);// 40 30 20 10
		}

		// reverse order using for each:
		int count = num.length - 1; // 3
		for (int ele : num) {
			System.out.println(num[count]);// 40 30 20 10
			count--;
		}

		System.out.println("---------------");

		String empData[] = new String[4];// 0-3; li=0; hi=3; l=4
		empData[0] = "Vijay";
		empData[1] = "Pooja";
		empData[2] = "Ravi";
		empData[3] = "Tarun";

		System.out.println(Arrays.toString(empData));

		for (int i = 0; i <= empData.length - 1; i++) {
			System.out.println(empData[i]);
			if (empData[i].equals("Ravi")) {
				System.out.println("salary is increased by 10%");
			} else {
				System.out.println("salary is increased by 5%");
			}
		}

		System.out.println("---------------");

		for (String ele : empData) {
			System.out.println(ele);
			if (ele.equals("Ravi")) {
				System.out.println("salary is increased by 10%");
			} else {
				System.out.println("salary is increased by 5%");
			}
		}

	}

}
