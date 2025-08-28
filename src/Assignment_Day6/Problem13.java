package Assignment_Day6;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem13 {
    public static void main(String[] args) {
        try {
            
            File file = new File("numbers.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            
            String firstLine = reader.readLine();
            int number = Integer.parseInt(firstLine);
            int result = 100 / number;
            System.out.println("100 divided by " + number + " is " + result);
            
            reader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading file");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } finally {
            System.out.println("Execution completed");
        }
    }
}