package OOP_Encapsulation;

public class EmpTest {
public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setName(null);
		e1.setAge(10);
		e1.setGender('m');
		e1.setSalary(23.44);
		e1.setActive(true);
		
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		
		
//		Employee e2 = new Employee();
//		System.out.println(e2.getName());
//		System.out.println(e2.getAge());
//		System.out.println(e2.getSalary());

	}

}
