package file1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class read1 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\surekha_folder\\suri.txt");
		FileReader fr=new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\surekha_folder\\suri.txt");
		char[] arr=new char[(int)f.length()];
		fr.read(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		
	}

}

