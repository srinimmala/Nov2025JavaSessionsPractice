package OOP_Encapsulation;

public class Company {
	private String name;
	private int empCount;
	private String hq;
	private double sharePrice;

	public Company(String name) {
		this(name, "LA");//1st statement -- const.. calling -- const..chaining
		this.name = name;
	}

	public Company(String name, String hq) {
		this.name = name;
		this.hq = hq;
	}

	public Company(String name, int empCount, String hq, double sharePrice) {
		this.name = name;
		this.empCount = empCount;
		this.hq = hq;
		this.sharePrice = sharePrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public String getHq() {
		return hq;
	}

	public void setHq(String hq) {
		this.hq = hq;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

}
