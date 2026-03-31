package javasessions2025;

public class IncrementDecrementOperators {

	public static void main(String[] args) {

		//++ --
		
		//1. post(later) increment: ++
		int a = 1;
		int b = a++;
		
		System.out.println(a);//2
		System.out.println(b);//1
		
		int x = 100;
		int y = x++;
		
		System.out.println(x);//101
		System.out.println(y);//100
		
		int c = -99;
		int d = c++;
		
		System.out.println(c);
		System.out.println(d);
		
		int p = 10;
		System.out.println(p++);//10
		System.out.println(p);//11
		
		
		
		//2. pre (first) increment: ++
		int m = 1;
		int n = ++m;
		
		System.out.println(m);//2
		System.out.println(n);//2
		
		
		int u = -999;
		int w = ++u;
		
		System.out.println(u);//-998
		System.out.println(w);//-998
		
		int t = 10;
		System.out.println(++t);//11
		System.out.println(t);//11
				
		
	}

}