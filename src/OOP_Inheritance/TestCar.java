package OOP_Inheritance;

public class TestCar {
public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); //Overridden
		b.stop(); //Inherited
		b.refuel();//Inherited
		b.autoParking();//Individual
		b.engine();
		b.parts();//Inherited
		BMW.billing();
		System.out.println(b.minSpeed);
		b.dashboard();
	
		
		System.out.println("--------");
		
		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.theftSafety();
		au.engine();
		Audi.billing(); //inheritance
		au.parts();
		
		System.out.println("--------");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.billing();
		
		
		System.out.println("--------");

		//child class object can be refered by parent class ref variable.
		//Top Casting: widening
		Car c1 = new BMW();
		c1.start();
		c1.engine();
		c1.stop();
		c1.refuel();
		
		//down casting: NA - ClassCastException
		//parent class object can be refered by child class ref variable.
		//BMW b1 = (BMW) new Car();//ClassCastException - RT
		
		//sibling to sibling casting:
		//Audi a1 = new BMW();
		
		//child class object can be referred by grand parent class ref variable:
		//Top Casting
		Vehicle v1 = new BMW();
		v1.engine();
		
		//
		Vehicle v2 = new Car();
		v2.engine();		
		

	}

}
