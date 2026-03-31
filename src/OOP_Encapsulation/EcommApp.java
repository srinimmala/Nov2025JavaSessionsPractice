package OOP_Encapsulation;

public class EcommApp {
	public static void main(String[] args) {

		// reg page: POST
		Customer c1 = new Customer("Vijay", 35, 101, "Banaglore");

		// go to my profile page: GET
		System.out.println(c1.getName());//Vijay
		System.out.println(c1.getAge());//35
		System.out.println(c1.getCity());//Bangalore
		System.out.println(c1.getCustId());//101

		// update the values: PUT/PATCH
		c1.setAge(36);
		c1.setCity("Pune");
		
		System.out.println("-----------");

		// go to my profile page: GET
		System.out.println(c1.getName());//Vijay
		System.out.println(c1.getAge());//36
		System.out.println(c1.getCity());//Pune
		System.out.println(c1.getCustId());//101
		
		
		

	}

}
