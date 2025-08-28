package Assignment_Day5;

@FunctionalInterface
interface SumCalculator {
    int sum(int a, int b);
}

public class p1 {
    public static void main(String[] args) {
        SumCalculator adder = (a, b) -> a + b;
        System.out.println("Sum: " + adder.sum(5, 3));
    }
}