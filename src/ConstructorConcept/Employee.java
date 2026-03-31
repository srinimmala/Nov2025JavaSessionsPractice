package ConstructorConcept;

public class Employee {
	// constructor of the class:
		// const.... name will be same as the class name
		// const.. can not return anything...no void, no return
		// const.. we never write the buss/app logic in const...
		// const... is used to initialize the class instance variables using this
		// keyword
		// it looks like a function but not a function
		// const... will be called when we create the object of the class
		// const... can be overloaded
//		public Employee() { //0 param
//			System.out.println("default const...");
//		}
	//	
//		public Employee(int a) {
//			System.out.println("1 param const..." + a);
//		}
	//	
//		public Employee(int a, String b) {
//			System.out.println("2 params const..." + a+b);
//		}

		String name;
		int age;
		double salary;
		boolean isActive;
		char gender;
		String dob;
		String city;

		// AC: you have to create the emp registration via registration form
		// rules:
		// 1. Emp can be registered with name, age, city
		// 2. Emp can be registered with name, age, city, gender
		// 3. Emp can be registered with name, age, dob, city
		// 4. Emp can be registered with all the values: name, age, city, age, isActive, gender, city

		
		public Employee(String name, int age, String city) {
			// G = L
			// this.G = L
			this.name = name;
			this.age = age;
			this.city = city;
		}

		public Employee(String name, int age, char gender, String city) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.city = city;
		}

		public Employee(String name, int age, String dob, String city) {
			this.name = name;
			this.age = age;
			this.dob = dob;
			this.city = city;
		}

		public Employee(String name, int age, double salary, boolean isActive, char gender, String dob, String city) {
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.isActive = isActive;
			this.gender = gender;
			this.dob = dob;
			this.city = city;
		}

		public static void main(String[] args) {

			Employee e1 = new Employee("Tom", 20, "Pune");

			System.out.println(e1.name + " " + e1.age + " " + e1.city + " "+ e1.salary + " "+ e1.dob + e1.gender);
			
			
			Employee e3 = new Employee("krishna", 25, "Bangalore");

			Employee e2 = new Employee("Peter", 20, 12.33, true, 'm', "01-01-1990", "LA");
			System.out.println(e2.name + " " + e2.age + " " + e2.city + " "+ e2.salary + " "+ e2.dob + e2.gender);
			
					
		}

}
