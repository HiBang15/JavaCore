package Read_Write_Object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class test_Read_Object {
	public static void main(String[] args) {
		ObjectInputStream in=null; 
		try {
			in = new ObjectInputStream(new FileInputStream("Bookk.bat"));
			List<Book> b = (List<Book>) in.readObject();
			b.stream().forEach(a ->System.out.println(a));
//			System.out.println("ID: "+b.getId() + "  |  Name: "+b.getName() + 
//					"  |  Quantity: "+b.getQuantity()+"  |  Price: "+b.getPrice());
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
}
