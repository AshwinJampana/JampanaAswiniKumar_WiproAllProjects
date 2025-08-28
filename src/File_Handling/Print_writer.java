package File_Handling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_writer {

	public static void main(String[] args) {
		try {
			PrintWriter p=new PrintWriter(new FileWriter("sample.txt"));
			p.println("Hello world");
			p.print("Using PrintWriter");
			p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

	}

}
