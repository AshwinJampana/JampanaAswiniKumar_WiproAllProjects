package File_Handling;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class append_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            BufferedWriter w = new BufferedWriter(new FileWriter("sample.txt",true));
            w.write("Hello");
            w.newLine();
            w.write("Welcome to Java Learning Sessions");
            w.close();
            System.out.println("\nWriting Completed");
        } catch (Exception e) {
            System.out.println(e);
        }
		
	}

}
