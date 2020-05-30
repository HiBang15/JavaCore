package Input_Output_File;
import java.io.*;
public class Example_1 {
	public static void main(String[] args) throws 	IOException{
		FileOutputStream fos = new FileOutputStream("file1.dat");
		String text = "The quick brow fox jumped over the lazy dog";
		byte[] textAsBytes = text.getBytes();
		fos.write(textAsBytes);
	}
}
