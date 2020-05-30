package Assignment_2_Student;

import java.util.Scanner;

public class Main_Student {
	private static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		
		while(true) {
			System.out.println("+--------------Menu----------------+");
			System.out.println("1. hien thi danh sach");
			System.out.println("2. Tim kiem theo ten");
			System.out.println("3. Them vao danh sach");
			System.out.println("4. Xoa theo rollNumber");
			System.out.println("5. Update thong tin");
			System.out.println("+---------------------------------+");
			choose = nhapInt();
			switch(choose) {
				case 1 : StudentDAO.findAll();break;
				case 2:
					System.out.println("Nhap ten sinh vien muon tim: ");
					String name = src.nextLine();
					StudentDAO.findByName(name);
					break;
				case 3: 
					Student std = new Student();
					std.input();
					Student u = new Student(std.getRollNo(), std.getFullName(), std.getClassName(), std.getDiemToan(), std.getDiemLy(),std.getDiemHoa(), std.getDiemVan(), std.getDiemAnh());
					if(StudentDAO.AddNewStd(u)==true) {
						System.out.println("Thanh cong!");
					}else {
						System.out.println("That bai!");
					}
					break;
				case 4:
					System.out.println("Nhap roll Number muon xoa: ");
					String rollNo = src.nextLine();
					if(StudentDAO.DeleteStd(rollNo)==true) {
						System.out.println("Xoa thanh cong!");
					}else {
						System.out.println("giao dich that bai");
					}
					break;
				case 5:
					System.out.println("Nhap rollNo muon update:");
					String roll = src.nextLine();
					StudentDAO.UpdateStd(roll);
					break;
				default:System.out.println("Nhap lai yeu cau!");break;
			}
		}
	}
	public static int nhapInt() {
		while(true) {
			try {
				return Integer.parseInt(src.nextLine());
			}catch(Exception ex) {
				System.out.println("Sai dinh dang!!!\nNhap lai yeu cau: ");
			}
		}
	}
}
