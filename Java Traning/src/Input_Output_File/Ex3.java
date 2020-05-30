package Input_Output_File;
import java.io.*;
public class Ex3 {
	public static void main(String[] args) throws IOException {
		File file = new File("Hello.txt");
		
		//create the files
		file.createNewFile();
		
		//create a fileWriter Object
		FileWriter writer = new FileWriter(file);
		
		//Write the content to the file 
		writer.write("This \n is \n an \n example \n");
		writer.flush();
		writer.close();
		
		//Creates a File Reader Object
		FileReader fr = new FileReader(file);
		char[] a = new char[50];
		fr.read();
		
		for(char c:a) {
			System.out.println(c);
			fr.close();
		}
		
	}
}
