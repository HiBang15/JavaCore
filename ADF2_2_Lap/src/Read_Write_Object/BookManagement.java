package Read_Write_Object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class BookManagement {
	private static Scanner in = new Scanner(System.in);
	private static int soluong;
	public static void main(String[] args) {
		List<Book> listB =  new ArrayList<>();
		int choose;
		while(true) {
			System.out.println("+-------------------Menu-------------------+");
			System.out.println("1. Nhap");
			System.out.println("2. Hien thi");
			System.out.println("3. Write Object");
			System.out.println("4.Read Object");
			System.out.println("+-------------------------------------------+");
			System.out.println("Lua chon: ");
			choose = nhapInt();
			switch(choose)
			{
			case 1:
				System.out.println("Nhap so luong sach:");
				soluong = nhapInt();
				for(int i=0; i<soluong; i++) {
					Book newB = CreateNewBook(listB);
					listB.add(newB);
				}
				break;
			case 2: listB.forEach(a->System.out.println(a));break;
			case 3: writeObject(listB);break;
			case 4: readObject();break;
			case 5:  
				System.out.println("Nhap vao phan tu ban muon tim");
				String sea = in.nextLine();
				objectSearch(sea);
				
				break;
			default: System.out.println("Luwa chon lai!");break;

			}
		}
		
		
		
	}

	private static void readObject()  {
		ObjectInputStream in=null; 
		try {
			in = new ObjectInputStream(new FileInputStream("Bookk.bat"));
			List<Book> b = (List<Book>) in.readObject();
			b.stream().forEach(a ->System.out.println(a));
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	private static void objectSearch(String t)  {
		ObjectInputStream in=null; 
		try {
			in = new ObjectInputStream(new FileInputStream("Bookk.bat"));
			List<Book> b = (List<Book>) in.readObject();
			long count = b.stream().filter(a->a.getName().equals(t)).count();
			if(count==0) {
				System.out.println("Not Found");
			}else {
				b.stream().forEach(a->{
					if(a.getName().equals(t)) {
						System.out.println(a);
					}
				});
			}
//			b.stream().forEach(a ->System.out.println(a));
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private static Book CreateNewBook(List<Book> listB) {
		System.out.println("ID: ");
		String id = NhapID(listB);
		
		System.out.println("Name: ");
		String name = in.nextLine();
		
		System.out.println("Quantity: ");
		int quantity = nhapInt();
		
		System.out.println("Price: ");
		int price = nhapInt();
		
		return new Book(id, name,  quantity, price);
		
	}

	private static int nhapInt() {
		while(true) {
			try {
				return Integer.parseInt(in.nextLine());
			}catch(Exception e) {
				System.out.println("Sai, nhap lai!!!");
				System.out.println("Quantity");
			}
		}
	}
	
	private static void writeObject(List<Book> listB) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("Bookk.bat"));
			out.writeObject(listB);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private static String NhapID(List<Book> listB) {
		while(true) {
			String id = in.nextLine();
			long count = listB.stream().filter(a -> a.getId().equals(id)).count();
			if(count<0) {
				System.out.println("ID da ton tai, moi nhap lai!!!");
				System.out.println("ID: ");
				continue;
			}
			return id;
		}
	}

	
}
