package Input_Output_File;
import java.io.*;
public class ObjextExampleWrite {
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		FileOutputStream fos = new FileOutputStream("fileobject.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Stock[] stocks = { new Stock(1001,"CD ROM",100.00,10000),
				new Stock(1002,"DRAM",75.00,30),
				new Stock(1003,"P4 Processor",103.00,321),
				new Stock(104,"Canon Jet",1000,1234)
		};
		//ghi mang doi tuong vao fileobject.dat
		oos.writeObject(stocks);
		oos.close();
		
	}
}
