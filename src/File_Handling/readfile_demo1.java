package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readfile_demo1 {

	public static void main(String[] args) throws IOException {
		List<String> l=new ArrayList<String>();
		BufferedReader r=new BufferedReader(new FileReader("sample.txt"));
		String line;
		while((line=r.readLine())!=null)
		{
			l.add(line);
			
		}
		for(String k:l)
		{
			System.out.println(k);
		}
		r.close();
	}

}
