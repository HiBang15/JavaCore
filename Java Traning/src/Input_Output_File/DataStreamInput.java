package Input_Output_File;
import java.io.*;
public class DataStreamInput {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("filedata.dat");
		DataInputStream dis = new DataInputStream(fis);
		int items = dis.readInt();
		for(int i=0; i<=items; i++) {
			int n = dis.readInt();
			System.out.print(n + "  ");
		}
		System.out.println("\n"+dis.readUTF());
		System.out.println(dis.readDouble());
		dis.close();
	}
}
