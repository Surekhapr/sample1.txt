package file1;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileread {

	public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\surekha_folder\\suri");
	FileReader fr=new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\surekha_folder\\suri");
char[] ch=new char[	(int)f.length()];
fr.reader(ch);

	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);
		
	}
}
	}
	


