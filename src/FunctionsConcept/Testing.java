package FunctionsConcept;

public class Testing {
	public void getMail() {
		System.out.println("get mail...");
	}
	
	public static void sendMail() {
		System.out.println("send mail");
	}
	

	public static void main(String[] args) {
		
		//how to call non static function: create the object:
		Testing t1 = new Testing();
		t1.getMail();

		//how to call static function :
		//1. using the class name:
		Testing.sendMail();
		
		//2. call it directly:
		sendMail();
		
		//3. using the object ref name:
		t1.sendMail();//The static method sendMail() from the type Testing should be accessed in a static way
		
		Testing t2 = new Testing();
		t2.getMail();
		

	}


}
