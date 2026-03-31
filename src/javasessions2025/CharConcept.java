package javasessions2025;

public class CharConcept {

	public static void main(String[] args) {

		char ch1 = 'a';
		char ch2 = 'b';
		
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		
		System.out.println(ch1);
		System.out.println(ch1+ch2);//97+98=195
		System.out.println(ch2-ch1);//98-97 = 1
		
		System.out.println('A' - 'B');//65-66 = -1
		
		System.out.println(ch1 * 10);
		
		System.out.println(ch2);
		
		System.out.println(ch1);//a
		System.out.println(ch1 + 0);//97+0=97
		System.out.println((byte)ch1);//97
		
		System.out.println('a'+'b'+"hello"+100+200);//195hello100200
		
		System.out.println(100+200+'a'+'b');
		
		System.out.println((byte) '#');
		System.out.println((byte) ' ');
		
		System.out.println((char) 97);
		System.out.println((char) 36);
		
		System.out.println((char) 98765);
		
		//unicode chars: 16000 chars + ASCII values
		
		
		System.out.println('a' + 2);
		
		int p = 100;
		System.out.println((char)p);//d
		
		
		System.out.println('a' + "A");//aA
		System.out.println("A" + "B") ;//AB
		System.out.println('a' + 'a'); //194
		
		
		
		
	}

}
