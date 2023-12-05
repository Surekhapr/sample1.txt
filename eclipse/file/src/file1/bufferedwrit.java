package file1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedwrit {

	public static void main(String[] args) throws IOException {
	FileWriter f=new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\surekha_folder\\suri.txt");
	BufferedWriter fb=new BufferedWriter(f);
	fb.write("hello surekha");
	fb.flush();
	fb.close();
	
	}

}
