package StringConstantPool;

public class StringImmutable {
public static void main(String[] args) {
		
		String s = "java";
		s = s + "testing";
		System.out.println(s);
		
		System.out.println("hello" + "automation" + 100 + 12.33);
		
		//StringBuffer vs StringBuilder
		
		System.out.println("---------------");
		
		String str = "Automation";
		str.concat("Testing");
		System.out.println(str);
		
		System.out.println("---------------");

		StringBuilder sb = new StringBuilder("selenium");
		sb.append("Testing");
		System.out.println(sb);
		
		System.out.println("---------------");

		StringBuffer sbf = new StringBuffer("cypress");
		sbf.append("api");
		System.out.println(sbf);
		

	}

}
