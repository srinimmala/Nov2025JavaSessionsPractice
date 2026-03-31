package DynamicArrays;

import java.util.ArrayList;

public class ArrayListGenerics {
public static void main(String[] args) {
		
		
		ArrayList<String> empList = new ArrayList<String>();//vc=10, pc=0
		
		empList.add("Tom");//0
		empList.add("Vijay");//1
		empList.add("Peter");//2
		empList.add("Ravi");//3
		empList.add("Priya");//4
		empList.add("Pooja");//5
		
		empList.trimToSize();//vc-->pc=6
		
		
		System.out.println(empList.size());//6
		System.out.println(empList);
		
		//iterate the arrayList: using for loop:
		for(int i=0; i<=empList.size()-1; i++) {
			System.out.println(empList.get(i));
		}
		
		System.out.println("--------");
		//using for each loop:
		for(String e : empList) {
			System.out.println(e);
		}
		
		System.out.println("--------");
		ArrayList<Integer> marksList = new ArrayList<Integer>();//vc=10, pc=0
		marksList.add(100);//0
		marksList.add(200);//1

		
		ArrayList<Double> empSalaryList = new ArrayList<Double>();//vc=10, pc=0
		empSalaryList.add(12.33);
		empSalaryList.add(45.55);
		
		System.out.println("--------");
		
		//emp data: string, int, double, isActive, char
		ArrayList<Object> empDataList = new ArrayList<Object>();//vc=10, pc=0
		empDataList.add("Tom");
		empDataList.add(20.22);
		empDataList.add(30);
		empDataList.add(true);
		empDataList.add('m');
		
		
		for(Object e : empDataList) {
			System.out.println(e);
		}
		
		System.out.println(empDataList);
		
		
		

	}

}
