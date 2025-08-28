package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readfile_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new FileReader("sample.txt"));
		String line;
		if((line=r.readLine())!=null)
		{
			System.out.println(line);
		}
		else
		{
			System.out.println("File is null");
		}
		r.close();
	}

}
