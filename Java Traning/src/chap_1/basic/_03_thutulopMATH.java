package chap_1.basic;

public class _03_thutulopMATH {
	public static void main(String[] args) {
		int x;
		x=90;
		double xIr = Math.toRadians(x);
		double a   = Math.sin(xIr);
		System.out.println("sin(90) = " +a);
		double res = Math.sin(90*1.0/180);
		
		System.out.println(res);
		System.out.println("E = "+Math.E);
		System.out.println("Pi = "+Math.PI);
	}
}
