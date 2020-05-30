package chap_1.basic;

public class _03_toantu {
	public static void main(String[] args) {
		int a,b; 
		a=25; 
		b=3;
		float res = a/(b*1.0f);
		System.out.println("res = "+res);
		System.out.println("Ket qua phep cong: " + (a+b));
		int c; 
		c=15;
//		c++; 
//		b = c++;
		System.out.println(c++);
		++c;
		System.out.println(c);
		//So sanh
		int d = (a>b)?1:0;
		if(d ==1 ) {
			System.out.println("a lon hon b" );
		}else {
			System.out.println("b lon hon a");
		}
	}
}
