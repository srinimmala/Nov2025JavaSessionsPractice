package javasessions2025;

public class TypeCasting {

	public static void main(String[] args) {
		
		byte b = 10;
		short s = b;
		System.out.println(s);
		int i = b;
		System.out.println(i);
		long l = b;
		System.out.println(l);
		
		int t = 200;
		byte g = (byte) t;
		//-128 to 127
		System.out.println(g);
		
		short r = (short)t;//200
		//-32768 to 32767
		System.out.println(r);//200
		
		
		int u = 50000;
		short p = (short)u; //50000
		System.out.println(p);
		
		long k = 909090900L;
		byte a = (byte)k;
		System.out.println(a);
		
		
		int total = 100;
		byte total1 = (byte)total;
		System.out.println(total1);
		
		
		int price = 9000;
		float pr = price;
		System.out.println(pr);
		
		
		byte e = 10;
		double d = e;
		System.out.println(d);
		
		
		double s1 = 12.33;
		byte b1 = (byte)s1; //12.33 --> 12
		System.out.println(b1);//12
		
		double s2 = 300.44;
		byte b2 = (byte)s2;//300.44 --> 300
		System.out.println(b2);
		
		
		long bill = 40000;
		float bg = bill;
		System.out.println(bg);//40000.0

		//-128 to 127
		byte x1 = 100;
		byte x2 = 120;
		
		int x3 = x1+x2; //220
		System.out.println(x3);
		System.out.println(x1+x2);
		
		short c1 = 10;
		short c2 = 200;
		int c3 = c1+c2;
		long c4 = c1+c2;
		float c5 = c1+c2;
		double c6 = c1+c2;
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

		
		System.out.println(10+20);

		
		char ch = 'a';
		int ci = ch;//97
		System.out.println(ci);
		
		byte bh = (byte)ch; //'a' --> 97
		System.out.println(bh);
		
		short sh = (short)ch; //'a' --> 97
		System.out.println(sh);
		
		
		byte vc = 65;
		char cv = (char) vc; //A
		System.out.println(cv);//A
		
		
		
		

	}

}