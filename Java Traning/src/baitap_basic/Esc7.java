package baitap_basic;
import java.util.Scanner;
public class Esc7 {
	public static void main(String[] args) {
		int n;
		int dem = 0;
		Scanner src = new Scanner(System.in);
		System.out.println("Input n: ");
		n = src.nextInt();
		System.out.print("Cac uoc cua "+n+"la: { ");
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i+" ,"+(-i)+" ,");
				dem +=2;
			}
		}
		System.out.print("}\n");
		System.out.println("so "+n+" co "+dem+" uoc!");
		
	}
}
