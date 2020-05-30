package baitap_basic;
import java.util.Scanner;
public class Esc01 {
	public static void main(String[] args) {
		int m,n;
		Scanner src = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		m = src.nextInt();
		System.out.println("Nhap chieu rong: ");
		n = src.nextInt();
		
		for(int i=0; i<m;i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*\t");
			}
			System.out.println("\n");
		}
		
	}
}
