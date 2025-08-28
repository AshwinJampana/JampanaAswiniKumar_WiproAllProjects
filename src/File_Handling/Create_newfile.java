package File_Handling;

import java.io.File;
public class Create_newfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("Sample.txt");
		try
		{
			f.createNewFile();
			System.out.println(f.setWritable(true));
		}
		catch(Exception e)
		{
			System.out.print("File not Found");
			System.out.println(e);
		}
	}

}
