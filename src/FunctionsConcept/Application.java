package FunctionsConcept;

public class Application {
	// Method Overloading: within the same class, when we have multiple methods:
		// OOP -- Poly (many) + morphism(forms) --> Compile time Polymorphism (static Polymorphism/binding)
		// 1. with the same name
		// 2. with the different number of parameters
		// 3. with the different type of parameters
		// 4. with the different sequence of parameters
		// 5. return type could be anything -- it doesnt matter
		

		public int test() { // 0 param
			return 100;
		}

		public void test(int a) { // 1 param
			
		}

		public void test(int a, int b) { // 2 params

		}

		public void test(int a, String b) { // 2 params

		}

		public void test(String a, int b) { // 2 params

		}

		// ecomm:
		// login feature with different parameters
		public void login() {

		}

		public void login(String un, String pwd) {

		}

		public void login(String un, String pwd, int otp) {

		}

		public void login(String un, String pwd, int otp, String role) {

		}

		// search:
		public void search() {

		}

		public void search(String productName) {

		}

		public void search(String productName, int price) {

		}

		// payment:
		public void makePayment(String upi) {

		}

		public void makePayment(String cc, int cvv) {

		}

		public void makePayment(String paypal, String pwd) {

		}

		// uber -- booking
		public void bookingCab(String stPoint, String endPoint) {

		}

		public void bookingCab(String stPoint, String endPoint, String carType) {

		}
		
		
		public void bookingCab(String stPoint, String endPoint, String carType, int totalPassngers) {

		}
		


		// like a user -- calling method
		//PSVM - String[]
		public static void main(String[] args) {
			Application a1 = new Application();
			a1.test();
			a1.test(10);

			a1.test(10, 20);
			// a1.test("naveen");

			a1.login("admin", "admin");
			
			a1.bookingCab("koramnagala", "airport", "suv", 4);
			
			

		}

}
