package MapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		//non order based collection
		// key-value pair
		// name:macbook pro
		// price:1000
		// stock:available

		//HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		//LinkedHashMap<String, Integer> empMap = new LinkedHashMap<String, Integer>();
		//TreeMap<String, Integer> empMap = new TreeMap<String, Integer>();
		
		Map<String, Integer> empMap = new HashMap<String, Integer>();
//		empMap = new LinkedHashMap<String, Integer>();
//		empMap = new TreeMap<String, Integer>();

		empMap.put("Tom", 10);
		empMap.put("Peter", 20);
		empMap.put("Vijay", 30);
		empMap.put("Anu", 40);
		empMap.put(null, 50);
		empMap.put("Gaurav", 60);
		empMap.put("Priya", 70);
		empMap.put("Vishaka", 80);

		System.out.println(empMap.get("Tom"));
		System.out.println(empMap.get("Vijay"));
		System.out.println(empMap.get("naveen"));// null
		//System.out.println(empMap.get(null));
		
		//empMap.remove("Tom", 10);
			

		System.out.println("-------------");
		System.out.println(empMap);
		System.out.println("-------------");

		HashMap<String, Object> productMap = new HashMap<String, Object>();
		productMap.put("name", "MacBook Pro");
		productMap.put("price", 1000);
		productMap.put("stock", "In Stock");
		
		
		
		Map<String, ArrayList<Object>> empList = new HashMap<String, ArrayList<Object>>();
		
		ArrayList<Object> tomList = new ArrayList<Object>();
		tomList.add("Tom");
		tomList.add(20.22);
		tomList.add(30);
		tomList.add(true);
		tomList.add('m');
		
		empList.put("Tom", tomList);
		
		System.out.println(empList.get("Tom").get(1));
		


	}

}