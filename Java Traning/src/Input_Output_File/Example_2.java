package Input_Output_File;
import java.io.*;
public class Example_2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("file1.dat");
		int c;
		while((c=fis.read()) != -1) {
			System.out.println((char)c);
		}
		fis.close();
	}
}
