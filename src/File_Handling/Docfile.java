package File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Docfile {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<String>();
        FileInputStream r = null;
        
        try {
            r = new FileInputStream("C:\\Users\\user\\Desktop\\DAY\\Day6.docx");
            
            // Reading a .docx file requires special handling as it's a binary format
            // This simple approach reads bytes, which isn't correct for .docx content
            // For actual .docx reading, you'd need a library like Apache POI
            
            StringBuilder currentLine = new StringBuilder();
            int content;
            while ((content = r.read()) != -1) {
                // Convert byte to char and add to current line
                currentLine.append((char) content);
                
                // If we hit a newline character, add the line to our list
                if ((char) content == '\n') {
                    lines.add(currentLine.toString());
                    currentLine = new StringBuilder();
                }
            }
            
            // Add the last line if there's any content left
            if (currentLine.length() > 0) {
                lines.add(currentLine.toString());
            }
            
            // Print all lines
            for (String l : lines) {
                System.out.println(l);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}