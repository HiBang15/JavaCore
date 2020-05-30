package baitap_basic;
import java.util.*;
public class Esc09 {
	Esc09(){}
	public boolean SNT(int n) {
		if(n ==1 ) return false;
		if(n==2) return true;
		for(int i=2; i<n; i++) {
			if(n%i == 0)return false;
		}
		return false;
	}
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i = 2;
        if (n == 1) {
            System.out.println(n + " = " + n);
        } else {
            System.out.print(n + " = ");
            while (n != 1) {
                if (n % i == 0) {
                    System.out.print(i + " x ");
                    n /= i;
                } else {
                    ++i;
                }
            }
            System.out.print("\b\b\b");
        }
    }
}
