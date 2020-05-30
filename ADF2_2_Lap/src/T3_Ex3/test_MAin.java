package T3_Ex3;
import java.util.Scanner;
public class test_MAin {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		StudentManagement c = new StudentManagement();
		int choose=0;
		while(choose !=5) {
			System.out.println("+--------------------Menu-----------------------+");
			System.out.println("1. Nhap");
			System.out.println("2. Hien thi");
			System.out.println("3. Tim kiem");
			System.out.println("4. Hoc sinh phan theo hoc luc");
			System.out.println("5. Thoat");
			System.out.println("+------------------------------------------------+");
			System.out.println("Nhap lua chon: ");
			choose = src.nextInt();
			src.nextLine();
			switch(choose)
			{
				case 1:c.inputS();break;
				case 2:c.display();break;
				case 3:c.timKiem();break;
				case 4:c.xeploai();break;
				case 5:break;
			}
		}
	}
}
