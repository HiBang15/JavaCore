package Database_lab;

import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		System.out.println("hihih");
//		Scanner in = new Scanner(System.in);
//		int choose;
//		while(true) {
//			System.out.println("+---------------MENU----------------+");
//			System.out.println("1. Hien thi tat ca du lieu trong bang user");
//			System.out.println("2. Tim kiem theo id");
//			System.out.println("3.Them moi mot doi tuong");
//			System.out.println("4. Update doi tuong");
//			System.out.println("+------------------------------------+");
//			choose = Integer.parseInt(in.nextLine());
//			switch(choose) {
//				case 1:
					List<User>  list = UserDAO.findAll();
					list.stream().forEach(a->System.out.println(a));
					
//					break;
//				case 2: System.out.println("Nhap id can tim kiem");
//						String id = in.nextLine();
//						User u = UserDAO.findById(id) ;
//						if(u != null){
//							System.out.println(u);
//						}else {
//							System.out.println("Not Found!");
//						}
//						break;
//				
//			}
//		}
		
	}
}
