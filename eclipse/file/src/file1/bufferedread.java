package file1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class bufferedread {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\surekha_folder\\suri.txt");
		FileReader fw=new FileReader	("C:\\Users\\Admin\\OneDrive\\Desktop\\surekha_folder\\suri.txt");
		BufferedReader br=new BufferedReader(fw);
		String s=br.readLine();
		while(s!=null)
		{
			s=br.readLine();
		}
		System.out.println("hi");

	}

}
