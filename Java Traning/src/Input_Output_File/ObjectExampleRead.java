package Input_Output_File;
import java.io.*;
public class ObjectExampleRead {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("fileobject.dat");
			ois = new ObjectInputStream(fis);
			Stock[] stocks1 = (Stock[]) ois.readObject();
			System.out.println("Read File: ");
			for(Stock s:stocks1) {
				System.out.println(s);
			}
			ois.close();
			fis.close();
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
