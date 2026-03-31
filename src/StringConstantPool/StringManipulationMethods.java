package StringConstantPool;

public class StringManipulationMethods {
public static void main(String[] args) {
		
		String str = "hi this is my java code";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(22));
		//System.out.println(str.charAt(22));//SIOB

		System.out.println(str.indexOf('h'));//0
		
		System.out.println(str.indexOf('i'));//1 - 1st occurrence of i
		
		//2nd occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//5
		
		//3rd occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));//8
		
		System.out.println(str.indexOf("java"));
		
		System.out.println(str.indexOf("naveen"));//-1
		
		String mesg = "welcome admin";
		if(mesg.indexOf("admin") == 8) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//trim:
		String tr = "       testing       ";
		System.out.println(tr.trim());
		
		//replace:
		String dob = "09-10-1990"; //09/10/1990
		System.out.println(dob.replace("-", "/"));
		
		String ty = "   test ing  ";
		System.out.println(ty.replace(" ", ""));

		//
		String pop = "abcd";
		System.out.println(pop.toUpperCase());
		System.out.println(pop.toLowerCase());
		
		//contains:
		String test = "product name is MacbookPro";
		System.out.println(test.contains("MacbookPro"));//true
		
		//split:
		String lang = "java_python_javascript_ruby";
		
		
		String lg[] = lang.split("_");
		System.out.println(lg[0]);
		
		
		String data = "xXseleniumXxXTestingXXxXAutomationX";
		
		String dt[] = data.split("xX");
		
		System.out.println(dt[0]);//blank - nothing -- length=0
		System.out.println(dt[1]);
		System.out.println(dt[2]);
		System.out.println(dt[3]);
		//System.out.println(dt[4]);//AIOB
		
		
		System.out.println("-----------------");
		
		String myData = "Tom||SDET||IBM|Bangalore||24.55";
		String value[] = myData.split("\\|\\|");
		System.out.println(value[0]);
		

		System.out.println("-----------------");
		String newData = "Tom.SDET.IBM.Bangalore.24.55";
		String er[] = newData.split("\\.");
		System.out.println(er[0]);
		
		String loop = "I love \"java\" coding"; //I love "java" coding
		System.out.println(loop);
		
		String wq = "I love 'java' coding"; //I love 'java' coding
		System.out.println(wq);

	}

}
