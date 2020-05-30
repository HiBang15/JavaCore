package baitap_basic;
import java.util.*;
public class Esc11 {
	public static void main(String[] args) {
		int n=0;
		Scanner src = new Scanner(System.in);
		System.out.println("input n: ");
		n = src.nextInt();
		int x1=0, x2=1,x3=0;
		System.out.print(x1+" "+x2+" ");
		for(int i=0; i<n;i++) {
			if(n<2) {
				System.out.print(i+ " ");
			}
			x3=x1+x2;
			
			x1=x2;
			x2=x3;
			System.out.print(x3+" ");
		}
	}
}
