package OOP_Encapsulation;

public class Customer {
	private String name;
	private int age;
	private int custId;
	private String city;

	// public const...behaving like a setter -- first time values will be given to the const...
	public Customer(String name, int age, int custId, String city) {
		this.name = name;
		this.age = age;
		this.custId = custId;
		this.city = city;
	}

	// public getters and setters:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCustId() {
		return custId;
	}

//	public void setCustId(int custId) {
//		this.custId = custId;
//	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
