package File_Handling;

import java.io.File;
public class File2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("sample.txt");
		if(f.exists())
		{
			System.out.println("File Name     = "+f.getName());
			System.out.println("File Path     = "+f.getAbsolutePath());
			System.out.println("File Size     = "+f.length());
			System.out.println("File Readable = "+f.canRead());
			System.out.println("File Writable = "+f.canWrite());
		}
		else
		{
			System.out.println("File not Found");
		}
	}

}
