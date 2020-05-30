package baitap_basic;
import java.util.Scanner; 
public class Esc04 {
	public static void main(String[] args) {
		int n;
		Scanner src = new Scanner(System.in);
		System.out.println("Input n: ");

		n = src.nextInt();
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if( i+j == n) {
					System.out.println("Hai so can tim:(i,j) = ( " + i  + " ,"+  j + ")");
				}
			}
		}
	}
}
