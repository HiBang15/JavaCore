package baitap_basic;
import java.util.Scanner;
public class Esc6 {
	public static void main(String[] args) {
		int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        double sum = 0;
        for(int i = 1; i<= n; i++){
            sum+= (double)1/i;// chu y ep kieu cho chinh xac
        }

        System.out.printf("RESULT= %8.3f",sum);
	}
}
