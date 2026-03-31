package FunctionsConcept;

public class User {
	// AC: getting the student marks : 1-100
	// WAF: function name : getStudentMarks(String studentName)
	// 1 parameter: studentName (String)
	// return : marks (int)

	public int getStudentMarks(String studentName) {
		System.out.println("getting the marks for : " + studentName);

		if (studentName.equals("snehal")) {
			return 90;
		} else if (studentName.equals("vijay")) {
			return 80;
		} else if (studentName.equals("priya")) {
			return 85;
		} else if (studentName.equals("naveen")) {
			return 10;
		} else {
			System.out.println("student is not found...." + studentName);
			return 0;
		}

	}

	public int getMarks(String studentName) {
		System.out.println("getting the marks for : " + studentName);

		switch (studentName.trim().toLowerCase()) {
		case "snehal":
			return 90;
		case "vijay":
			return 80;
		case "priya":
			return 85;
		case "naveen":
			return 10;

		default:
			System.out.println("student is not found...." + studentName);
			return 0;
		}

	}

	public static void main(String[] args) {

		User u1 = new User();
		int m1 = u1.getStudentMarks("snehal");
		System.out.println(m1);

		if (m1 >= 1 && m1 <= 100) {
			System.out.println("print the marksheet");
		}
		
		int m2 = u1.getMarks("  SNEHAL ");
		System.out.println(m2);

	}
}
