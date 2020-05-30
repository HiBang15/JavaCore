package baitap_basic;
import java.util.Scanner;
public class Esc5 {
	public static void main(String[] args) {
		int n;
		int tong = 0;
		Scanner src = new Scanner(System.in);
		System.out.println("Input n: ");
		n = src.nextInt();
		if(n%2==0) {
			for(int i=0; i<=n; i++) {
				if(i%2==0) {
					tong +=i;
				}
			}
			System.out.println("Tong chan la: "+tong);
		}else {
			for(int i=0; i<=n; i++) {
				if(i%2 !=0) {
					tong +=i;
				}
			}
		}
	}
}
