package StringConstantPool;

import java.util.Arrays;

public class CharSequenceConcept {
public static void sendKeys(CharSequence... data) {
		
		System.out.println(Arrays.toString(data));
				
	}
		
	

	public static void main(String[] args) {
		
		
		String data = "Naveen";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sbf = new StringBuffer("Labs");

		sendKeys(data, sb, sbf);
		
		
		
		

	}

}
