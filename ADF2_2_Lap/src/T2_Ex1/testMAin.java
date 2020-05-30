package T2_Ex1;
import java.util.*;
public class testMAin {
	public static void main(String[] args) {
		PeopleManagement p = new PeopleManagement();
		int choose; 
		Scanner src = new Scanner(System.in);
		while(true) {
			System.out.println("+----------Menu-----------+");
			System.out.println("1. Nhap danh sach");
			System.out.println("2. Hien thi danh sach vua nhap");
			System.out.println("3. Nguoi co tuoi lon nhat");
			System.out.println("4.Nguoi co tuoi be nhat");
			System.out.println("+---------------------------+");
			System.out.println("Nhap lua chon cua ban: ");
			choose = src.nextInt();
			src.nextLine();
			switch(choose) 
			{
				case 1: p.inputList();break;
				case 2: p.hienThiThongTin();break;
				case 3: p.ageMin();break;
				case 4: p.ageMax();break;
				default:System.out.println("Khong co lua chon ban nhap!\nMoi ban chon lai!");
			}
		}
	}
}
