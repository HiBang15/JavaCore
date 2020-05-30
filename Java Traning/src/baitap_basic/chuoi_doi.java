package baitap_basic;
import java.util.Scanner;
public class chuoi_doi {
	public static void main(String[] args) {
		int n;
		Scanner src = new Scanner(System.in);
		int[] arr;
		System.out.println("Nhap so phan tu cua mang :");
		n = src.nextInt();
		arr = new int[n];
		System.out.println("Nhap cac phan tu cua mang: ");
		for(int i=0; i<n; i++) {
			arr[i]=src.nextInt();
		}
		boolean ok = true;
		int mid=n/2;
		for(int i=0; i<mid; i++) {
			int x = n-1-i;
			if(arr[i]!=arr[x]) {
				ok = false;
				break;
			}
		}
		if(ok == true) {
			System.out.println("Mang doi xung!");
		}else {
			System.out.println("MAng khong doi xung!");
		}
	}
}
