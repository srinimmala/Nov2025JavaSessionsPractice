package ClassObjectsConcept;

public class Employee {
	String name;
	int age;
	int empID;
	String deptName;
	char gender;
	boolean isPermanent;
	double salary;
		

	public static void main(String[] args) {
				
		//class: Category, Blueprint, template -- fields/class variables/instance vars
		//Object/instance: Physical entity - properties
		//non primitive - no fixed memory
		
		//create the object: using new keyword
		//Employee - class name / type of e1
		//e1 -- object/instance ref name -- STACK
		//new Employee -- actual object in HEAP
		Employee e1 = new Employee();
		e1.name = "Vijay";
		e1.age = 30;
		e1.empID = 100;
		e1.deptName = "HR";
		e1.gender = 'm';
		e1.isPermanent = true;
		e1.salary = 23.44;
		
		System.out.println(e1.name);
		System.out.println(e1.empID);
		System.out.println(e1.salary);
		
		//
		Employee e2 = new Employee();
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.isPermanent);
		System.out.println(e2.salary);
		
		//no reference name object
		new Employee().name = "Tom";
		new Employee().age = 40;
		
		System.out.println(new Employee().name);
		
		
		//null reference object:
		Employee e3 = new Employee();
		e3 = null;
		e3.name = "Niti"; //NPE
		System.out.println(e3.name);
		
		
		System.gc();//calling the gc programmatically -- but there is no guarantee that gc will be called...gc is dependent on JVM
		
		
		
		
		
		

	}
}
