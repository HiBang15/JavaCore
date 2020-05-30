package assignment_3_DB;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class MAIN {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int choose=0; 
		while(choose !=4) {
			System.out.println("+--------------MENU--------------+");
			System.out.println("1. Them bai viet");
            System.out.println("2. xem tat ca bai viet");
            System.out.println("3. tim bai viet");
            System.out.println("4. Thoat");
            System.out.println("+---------------------------------+");
            System.out.println("Pealse choose: ");
            choose = nhapInt();
            switch(choose) {
            case 1: addNew();break; 
            case 2: findAll();break; 
            case 3: findByName();break ; 
            case 4: break;
            default:System.out.print("the value must be greater than 0 and less than 4,please enter again: ");break;
            }
		}
	}
	private static void findByName() {
		List<baiViet> list = DAO.findAll();
		System.out.println("Nhap ten ban muon tim kiem!");
		String name = input.nextLine(); 
		list.add( DAO.findByTitle(name));
		list.stream().forEach(a->System.out.println(a));
	}
	private static void findAll() {
		List<baiViet> list = DAO.findAll();
		list.stream().forEach(a->System.out.println(a));
		
	}
	private static void addNew() {
		List<danhMuc> listDM = DAO.findAllDanhMuc();
		
		System.out.println("Enter the Title: ");
		String title = input.nextLine();
		
		System.out.println("Enter the Summary: ");
		String summary = input.nextLine();
		
		System.out.println("Enter the content: ");
		String content = input.nextLine();
		
		System.out.println("Enter the date book:");
		Date created_at = enterDate();
		
		System.out.println("Nhap ten danh muc: ");
		String tenDanhMuc = input.nextLine();
		
		long count = listDM.stream().filter(a->a.getTen_danh_muc().equals(tenDanhMuc)).count();
		int idDM = 0;
		if(count > 0) { 
			for (danhMuc danhMuc : listDM) {
                if(danhMuc.getTen_danh_muc().equals(tenDanhMuc)){
                    idDM = danhMuc.getId();
                    break;
                }
            }
		}
		DAO.themBaiViet(new baiViet(title, summary, content,  (java.sql.Date) created_at, idDM));  
		
		
	}
	private static int nhapInt() {
		while (true) {            
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("You must be enter integer, please enter again: ");
            }
        }
	}
	private static Date enterDate() {
        while (true) {            
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date date = simpleDateFormat.parse(input.nextLine());
                return date;
            } catch (Exception e) {
                System.out.println("enter date fail");
                System.out.print("enter again: ");
            }
        }
    }
}
