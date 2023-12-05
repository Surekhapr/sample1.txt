package file1;

import java.io.File;
import java.io.IOException;

public class creat_file {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\surekha_folder\\suri.txt");
		File f1=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\surekha_folder");
		long l=f.length();
		
		System.out.println(l);
		f.createNewFile();
		f1.delete();
		f1.createNewFile();
		f1.delete();
		System.out.println("done java file");
		
	}

}
