package javasessions2025;

public class IncrementDecrementExpressions {public static void main(String[] args) {
	
//	int i = 11;
//	int j = i++ + ++i;
//	
//	System.out.println(i);
//	System.out.println(j);
//	
//	
//	int a=11; 
//	int b=22;
//	
//	int c = a + b + a++ + b++ + ++a + ++b;
//	
//	System.out.println("a="+ a);//13
//	System.out.println("b="+ b);//24
//	System.out.println("c="+ c);//103
	
	
	int i=0;
	int j = i++ - --i + ++i - i--;
	
	System.out.println(i);
	System.out.println(j);

	
	int a=1, b=2;
	int c = --b - ++a + ++b - --a;
	
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

	
	int m = 0, n = 0;
	int p = --m * --n * n-- * m--;
	
	
	System.out.println(m);
	System.out.println(n);
	System.out.println(p);
	
	
	char ch = 'A'; //65
	System.out.println(ch++);
	System.out.println(ch);
	
	
	double d = 1.5, D = 2.5;
	
	double d2 = d++ + ++D;
	
	
	System.out.println(d);
	System.out.println(D);
	System.out.println(d2);



	
	
	
	
	

}



}
