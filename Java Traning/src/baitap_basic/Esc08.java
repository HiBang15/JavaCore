package baitap_basic;
import java.util.*;
public class Esc08 {
	public static void main(String[] args) {
		int x,n,tong=0; 
		Scanner src = new Scanner(System.in);
		System.out.println("Input n: ");
		n = src.nextInt();
		while(n>0) {
			x = n%10;
			tong +=x;
			n=n/10;
		}
		System.out.println("Tong cac chu so cua n la "+tong);
	}
}
