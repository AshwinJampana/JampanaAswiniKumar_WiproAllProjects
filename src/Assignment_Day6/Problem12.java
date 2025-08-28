package Assignment_Day6;


class OddNumberException extends Exception {
 public OddNumberException(String message) {
     super(message);
 }
}

public class Problem12 {

 public static void checkOdd(int n) throws OddNumberException {
     if (n % 2 != 0) {
         throw new OddNumberException("Odd number: " + n);
     }
     System.out.println(n + " is even (no exception thrown)");
 }

 public static void main(String[] args) {
     int[] testNumbers = {2, 3, 4, 5, 6, 7};
     
     for (int num : testNumbers) {
         try {
             checkOdd(num);
         } catch (OddNumberException e) {
             System.out.println("Caught exception: " + e.getMessage());
         }
     }
 }
}