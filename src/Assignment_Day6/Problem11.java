package Assignment_Day6;

public class Problem11 {
    public static void main(String[] args) {
      
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");
        } finally {
            System.out.println("Operation completed.");
        }

      
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Array element: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        } finally {
            System.out.println("Operation completed.");
        }
    }
}