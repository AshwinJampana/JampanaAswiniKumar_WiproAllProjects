package Assignment_Day9;

import java.io.*;
import java.util.*;

public class Problem11 {
    public static void main(String[] args) {
        String fileName = "student1234.txt";
        

        try {
            
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hari\n");
            writer.write("Kmar\n");
            writer.write("eswar\n");
            writer.write("vinay\n");
            writer.write("rao\n");
            writer.close();
            System.out.println("file created ");

      
            System.out.println("Reading from file  " + fileName);
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

           
            writer = new FileWriter(fileName, true);
            writer.write("krishna\n");
            writer.close();
            System.out.println("Data appended Successfully");

           
          

            int lineCount = 0;
            int wordCount = 0;
            reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            reader.close();
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}