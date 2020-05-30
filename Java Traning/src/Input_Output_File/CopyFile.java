package Input_Output_File;

import java.io.*;
public class CopyFile {

	public static void main(String[] args) throws Exception {
		 	FileInputStream in = null;
		 	FileOutputStream out = null;
		 	try {
		 		
		 		String fileName = "Hello.txt";
				FileInputStream file = new FileInputStream(fileName);
				byte x = (byte)file.read();
				while (x!=-1) {
					out.write(x);
				}
			}catch(IOException i) {
				i.printStackTrace();
			}
//				catch(FileNotFoundException f) {
//				f.printStackTrace();
//			}
		 	finally {
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
			}	
		 	
	}
}
