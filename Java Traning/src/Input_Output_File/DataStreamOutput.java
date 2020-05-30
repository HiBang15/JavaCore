package Input_Output_File;
import java.io.*;
public class DataStreamOutput {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("Filedata.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		final int Num = 5;
		for(int i=0; i<=Num; i++) {
			dos.writeInt(i);
		}
		dos.writeUTF("Hello !!");
		dos.writeDouble(100.75);
		dos.flush();
		dos.close();
	}
}
