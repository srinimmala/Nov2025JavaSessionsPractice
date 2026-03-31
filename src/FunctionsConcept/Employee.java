package FunctionsConcept;

public class Employee {
	//function/methods : same thing
	
		//functions are always written independently; parallel to each other
		//can not create a function inside a function
		//duplicate functions are not allowed ---> method overloading
		
		//login(){
			//enter un
			//enter pwd
			//click on login btn
		//}
		
		
		//1. no input (parameter) and no return
		//void -- can not return anything -- no return keyword
		public void test() {
			System.out.println("test method");
		}
		
		public void clickLoginButton() {
			System.out.println("cick on login button");
		}
		
		//2. some input (parameter) and no return:
		public void add(int a, int b) {
			System.out.println("add method");
			int c = a+b;
			System.out.println(c);
		}
		
		public void login(String username, String password) {
			System.out.println("login to app");
			System.out.println("enter username: "+ username);
			System.out.println("enter password: "+ password);
			System.out.println("click on login button");
		}
		
		//3. some input(parameters) and some return:
		//return type: int
		public int sum(int a, int b) {
			System.out.println("sum of two numbers..");
			int z = a+b;
			return z;
		}
		
		//return type: boolean
		public boolean isUserActive(String username) {
			System.out.println("checking user is active or not....");
			if(username.equals("naveen")) {
				return true;
			}
			else {
				return false;
			}
		}
		
		//4. no input but some return
		public String getTrainerName() {
			System.out.println("getting trainer name");
			return "naveen";
		}
			

		public static void main(String[] args) {
			//call the method/function: have to create the object of the class:
			Employee e1 = new Employee();
			e1.test(); //calling the function
			e1.clickLoginButton();
			
			e1.add(10, 20);
			
			e1.login("admin@gmail.com", "test123"); //call by value
			
			int s1 = e1.sum(10, 30);
			System.out.println(s1);
			System.out.println(s1+5);
			System.out.println(s1+50);
			
			boolean flag = e1.isUserActive("naveen");
			System.out.println(flag);
			if(flag) {
				System.out.println("increase the salary");
			}
			
			String trName = e1.getTrainerName();
			System.out.println(trName);
		}
		
}
