package Java2_Exception;
import java.util.Scanner;
public class E1 {
	public static void main(String[] args) {
		int[] arrInt = new int[5];
		Scanner src =  new Scanner(System.in);
		System.out.println("Nhap cac phan tu trong mang: ");
		for(int i=0; i<5;i++) {
			arrInt[i] = src.nextInt();
		}
		System.out.println("Cac phan tu trong mang la: ");
		for(int i=0; i<arrInt.length;i++) {
			System.out.print(arrInt[i]+"\t");
		}
	}
}
