package baitap_basic;
import java.util.Scanner;

public class Esc02 {
	public static void main(String[] args) {
		int m,n;
		Scanner src = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		m = src.nextInt();
		System.out.println("Nhap chieu rong: ");
		n = src.nextInt();
		for(int i =0; i < m; i++) {
			for(int j = 0; j<m ; j++) {
				 if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
	                    System.out.print(" * ");
	                } else {
	                    System.out.print("   ");
	                }
			}
			System.out.println();
		}
	}
}
