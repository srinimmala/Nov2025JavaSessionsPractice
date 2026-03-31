package OOP_Encapsulation;

public class Employee {


	//private instance variables
	private String name; //can not be null
	private int age; // age can be greater than 20 only
	private double salary; //min salry should be 10 LPA
	private char gender;
	private boolean isActive;

	// public getter and setter:

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null) {
			this.name = name;
		}
		else {
			System.out.println("name can not be null");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=20) {
			this.age = age;
		}
		else {
			System.out.println("age must be greater than 20");
		}
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


}
