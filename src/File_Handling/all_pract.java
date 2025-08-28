package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class all_pract {

    public static void main(String[] args) throws IOException {
    	File f=new File("sample1.txt");
    	System.out.println(f.getName());
    	System.out.println(f.length());
    	System.out.println(f.getAbsolutePath());
    	System.out.println(f.canRead());
    	System.out.println(f.canWrite());
    	
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter("sample1.txt"));
            w.write("Hello");
            w.newLine();
            w.write("Welcome to Java Learning Sessions");
            w.close();
            System.out.println("\nWriting Completed");
        } catch (Exception e) {
            System.out.println(e);
        }

       
        try {
            List<String> l = new ArrayList<String>();
            BufferedReader r = new BufferedReader(new FileReader("sample1.txt"));
            String line;
            System.out.println("\nReading File");
            while ((line = r.readLine()) != null) {
                l.add(line);
            }
            for (String k : l) {
                System.out.println(k);
            }
            r.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        
        try {
            PrintWriter p = new PrintWriter(new FileWriter("sample1.txt"));
            p.println("Hello world");
            p.print("Using PrintWriter");
            p.close();
            System.out.println("\nWriting Completed");
        } catch (Exception e) {
            System.out.println(e);
        }

        
        try {
            List<String> l = new ArrayList<String>();
            BufferedReader r = new BufferedReader(new FileReader("sample1.txt"));
            String line;
            System.out.println("\nReading file ");
            while ((line = r.readLine()) != null) {
                l.add(line);
            }
            for (String k : l) {
                System.out.println(k);
            }
            r.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}