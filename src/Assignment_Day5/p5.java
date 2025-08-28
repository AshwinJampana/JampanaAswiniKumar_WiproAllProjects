package Assignment_Day5;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class p5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        
        
        words.stream()
             .sorted(Comparator.comparingInt(String::length))
             .forEach(System.out::println);
       
        words.stream()
             .sorted()
             .forEach(System.out::println);
    }
}