package DynamicArrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// ArrayList -- default class in java
		// order based collection -- it maintains the index/order: 0,1,2...n

		ArrayList ar = new ArrayList();//vc=10; pc=0
		System.out.println(ar.size());// size()=pc=0

		ar.add(100);// 0
		ar.add(200);// 1

		System.out.println(ar.size());// 2

		ar.add(300);// 2
		ar.add(400);// 3

		System.out.println(ar.size());// 4

		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		 System.out.println(ar.get(4));//IOB
		
		ar.add(4, 500);
		System.out.println(ar.get(4));
		
		System.out.println(ar);
		
		ar.add(0, 10);
		System.out.println(ar);
		
		ar.set(0, 20);
		System.out.println(ar);	
		
		ar.remove(0);
		System.out.println(ar);
		
		ar.remove(2);
		System.out.println(ar);
		
		ar.removeAll(ar);
		System.out.println(ar);
		
		ar.add('a');
		ar.add("testing");
		System.out.println(ar);


		
		System.out.println("---------------");
		
//		ArrayList ar1 = new ArrayList();
//		ar1.add(2, 100);//IOB
//		System.out.println(ar1.get(2));
		

		
		

	}

}