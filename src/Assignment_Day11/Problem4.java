package Assignment_Day11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Problem4 {
    public static void main(String[] args) {
        try {
           
            Files.write(Paths.get("data.txt"), "Initial content\n".getBytes());
            System.out.println("Initial content written");

            
            Files.write(Paths.get("data.txt"), "Appended content\n".getBytes(), 
                       StandardOpenOption.APPEND);
            System.out.println("Content appended");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}