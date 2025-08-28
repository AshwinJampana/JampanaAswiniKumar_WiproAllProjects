package Assignment_Day5;

import java.util.function.Function;
import java.util.Arrays;
import java.util.List;

public class p4 {
    public static void main(String[] args) {
        Function<String, String> toUpper = s -> s.toUpperCase();
        Function<String, String> toLower = s -> s.toLowerCase();
        
        List<String> words = Arrays.asList("Hello", "World");
        words.stream()
             .map(toUpper)
             .forEach(System.out::println);
             
        words.stream()
             .map(toLower)
             .forEach(System.out::println); 
    }
}