package javasessions2025;

public class TimeComplexity {
	public static void main(String[] args) {

		//TC: O(n): Big Oh
		
		//int i = 10;
		//System.out.println(i);
		//O(1)
		
		int n = 10;
		for(int j = 1; j<=n; j++) {
			System.out.println(j);
		}
		//O(n)
		//1+n+n+n => 3n+1 (Linear Equation)
		//3n+1 ==> 3n ==> O(n)
		
		
		for(int i=100; i<=105; i++) {
			for(int j=0; j<=5; j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		
		//(1+n+n+n)(1+n+n+n)=>(1+3n)(1+3n) => 1+3n+3n+9n^2
		//1+3n+3n+9n^2 ==> 9n^2+6n+1 (Quadratic equation)
		//9n^2+6n+1 ==> 9n^2+6n ==> 3n(3n+2) => 9n^2 ==>O(n^2)
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				for(int k=0; k<=5; k++) {
					System.out.print(i+""+j+k+" ");
				}
			}
			System.out.println();
		}
		
		//(n)(n)(n)
		//cubic equation: n^3+n^2+n+1 ==> O(n^3)
		
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);// ab...z
		}

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);// 0 to 9
		}

		for (char ch = '0'; ch <= '9'; ch++) {
			System.out.println(ch);// 0 to 9
		}
		
		//1+3n+1+3n+1+3n=> 9n+3 ==> 9n ==> O(n)
		
	}

}
