package FPT;
import java.util.Scanner;
public class C_V extends hinhchunhat {
	public static void main(String[] args) {
		double chieudai, chieurong;
		Scanner src = new Scanner(System.in);
		hinhchunhat hcn = new hinhchunhat();
		System.out.println("Nhap chieu dai");
		chieudai = src.nextInt();
		hcn.setChieudai(chieudai);
		System.out.println("Nhap chieu rong");
		chieurong = src.nextInt();
		hcn.setChieurong(chieurong);
		
		System.out.println("chu vi cua hinh chu nhat la "+hcn.getChuVi());
		
	}
	
}
