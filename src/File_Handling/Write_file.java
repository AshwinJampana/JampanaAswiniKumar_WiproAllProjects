package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Write_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			FileWriter w=new FileWriter("sample.txt");
//			w.write("Hello");
//			w.write("Welcomed to Java Learning Sessions");
//			w.close();
//			System.out.println("Write File Done Successfully");
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		try {
	BufferedWriter w=new BufferedWriter(new FileWriter("sample.txt"));
		w.write("Hello");
		w.newLine();
		w.write("Welcomed to Java Learning Sessions");
		w.close();
		
		System.out.println("Write File Done Successfully");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		

	}

}
