package baitap_basic;
import java.util.*;

public class ptbac1 {
	public static void main(String[] args) {
		int a,b;
		Scanner src = new Scanner(System.in);
		System.out.println("Input a: ");
		a = src.nextInt();
		System.out.println("Input b: ");
		b = src.nextInt();
		
		if((a==0 && b!=0) ||(a!=0&& b==0)) {
			System.out.println("Phuowng trinh vo nghiem!");
		}
		if(a==0 && b==0) {
			System.out.println("Phuong trinh vo so nghiem!");
		}
		if(a!=0 && b!=0) {
			double x;
			x = (1.0*a)/b;
			System.out.println("Nghiem cua phuong trinh la "+x);
		}
		
	}
}
