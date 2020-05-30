package T2_Ex2;
import java.util.*;
public class testComputer {
	public static void main(String[] args) {
		int choose; 
		String name;
		ComputerManagement c = new ComputerManagement();
		Scanner src = new Scanner(System.in);
		while(true) {
			System.out.println("+---------------Menu------------+");
			System.out.println("1. Nhap danh sach");
			System.out.println("2. Hien thi danh sach vua nhap");
			System.out.println("3. Tim kiem theo ten");
			System.out.println("4. Gia cao nhat");
			System.out.println("5. Gia thap nhat");
			System.out.println("+-------------------------------+");
			System.out.println("Nhap lua chon cua ban: ");
			choose = src.nextInt();
			src.nextLine();
			switch(choose){
				case 1: c.inputCpt();break;
				case 2:c.displayCpt();break;
				case 3:
					System.out.println("Nhap ten san pham ban muon tim: ");
					name = src.nextLine();
					if(c.timKiemTheoTen(name) == null) {
						System.out.println("Khong tim thay!");
					}else {
						System.out.println("Thong tin san pham ban can tim \n"+c.timKiemTheoTen(name));
					}
					break;
				case 4:
						System.out.println("san pham co gia thap nhat la: "+c.priceMin());break;
				case 5: System.out.println("san pham co gia cao nhat la: "+c.priceMax());break;
			}
		}
	}
}
