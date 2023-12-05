package file1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file_write {

	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\surekha_folder\\suri.txt");
		f.write("hellojaav");
		f.flush();
		f.close();
		System.out.println("hello");
	}

}
