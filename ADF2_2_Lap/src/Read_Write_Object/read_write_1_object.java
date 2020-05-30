package Read_Write_Object;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class read_write_1_object {



		private static Scanner in = new Scanner(System.in);
		private static int soluong;
		public static void main(String[] args) {
			List<Book> listB =  new ArrayList<>();
//			Book b = new Book();
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
					//Ghi danh sach
					soluong = nhapInt();
					for(int i=0; i<soluong; i++) {
						Book newB = CreateNewBook(listB);
						listB.add(newB);
					}
//					Book b = CreateNewBook();
//					writeObject(b);
					break;
				case 2: listB.forEach(a->System.out.println(a));;break;
				case 3: writeObject(listB);break;
				case 4: readObject();break;
				default: System.out.println("Luwa chon lai!");break;

				}
			}
			
			
			
		}

		private static void readObject()  {
			ObjectInputStream in=null; 
			try {
				in = new ObjectInputStream(new FileInputStream("Bookk.bat"));
				List<Book> listb = new ArrayList<>();
				while(true) {
					try {
						listb.add((Book) in.readObject());
						
					}catch(Exception e) {
						break;
					}
				}
				listb.forEach(a->System.out.println(a));
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
			String id = in.nextLine();
			
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
				for(int i=0; i<listB.size(); i++) {
					out.writeObject(listB.get(i));
				}
				
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
