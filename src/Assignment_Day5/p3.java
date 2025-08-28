package Assignment_Day5;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class p3 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .filter(isEven)
               .forEach(System.out::println); 
        
        numbers.stream()
               .filter(isOdd)
               .forEach(System.out::println); 
    }
}