package StringConstantPool;

public class DataConversion {
	public static void main(String[] args) {

		//1. String to int:
		String x = "100";
		System.out.println(x+20);
		
		//using Integer - parseInt
		int i = Integer.parseInt(x); //100
		System.out.println(i+20);
		
//		String y = "100A";
//		int j = Integer.parseInt(y); //NumberFormatException
//		System.out.println(j+20);
		
		String t = "100.12";
		System.out.println(t+20);
		double d = Double.parseDouble(t);//100.12
		System.out.println(d+20);
		
		String isActive = "true";
		boolean isAct = Boolean.parseBoolean(isActive); //true	
		System.out.println(isAct);
		if(isAct) {
			System.out.println("login to app");
		}
		
		//int to String:
		int p = 100;
		String p1 = p+"";
		System.out.println(p1);
		
		String p2 = String.valueOf(p);//100-->"100"
		System.out.println(p2.length());//3
		
		String p3 = String.valueOf(12.33);//12.33 --> "12.33"
		System.out.println(p3+20);
		
		//true ---> "true"
		boolean flag = true;
		String fg = String.valueOf(flag);
		System.out.println(fg+20);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
	}

}
