package Assignment_Day11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem3{
    public static void main(String[] args) {
        String searchWord = "Hari";
        int count = 0;
        
        try (Scanner scanner = new Scanner(new File("student1234.txt"))) {
            while (scanner.hasNext()) {
                if (scanner.next().equalsIgnoreCase(searchWord)) {
                    count++;
                }
            }
            System.out.println("count: " + count);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}