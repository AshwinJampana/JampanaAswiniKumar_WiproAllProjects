package Assignment_Day7;

public class Problem1 {
    public static void main(String[] args) {
        
        char c = '7';
        boolean isDigit = Character.isDigit(c);
        System.out.println("Is '" + c + "' a digit? " + isDigit);
        
        // two Strings
        String str1 = "Hello";
        String str2 = "World";
        int comparison = str1.compareTo(str2);
        System.out.println("Comparison result: " + comparison);
        
        // valueOf
        Integer intWrapper = Integer.valueOf("123");
        System.out.println("String to Integer: " + intWrapper);
        
        // Boolean Wrapper
        Boolean boolWrapper = Boolean.valueOf("true");
        System.out.println("Boolean wrapper: " + boolWrapper);
        
        // null to wrapper
        Integer nullWrapper = null;
        System.out.println("Null wrapper: " + nullWrapper);
        
        // Pass by value 
        System.out.println("\n=== Pass by Value Examples ===");
        
        
        int num = 10;
        System.out.println("Before method call: " + num);
        tryToChange(num);
        System.out.println("After method call: " + num);
        
        // 2. Swap two integers
        int a = 5, b = 10;
        System.out.println("\nBefore swap: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b);
        
       
        int x = 100;
        System.out.println("\nBefore method: x = " + x);
        modifyPrimitive(x);
        System.out.println("After method: x = " + x);
    }
    
   
    public static void tryToChange(int value) {
        value = 20;
        System.out.println("Inside method: " + value);
    }
    
   
    public static void swap(int first, int second) {
        int temp = first;
        first = second;
        second = temp;
        System.out.println("Inside swap: first = " + first + ", second = " + second);
    }
    
 
    public static void modifyPrimitive(int num) {
        num *= 2;
        System.out.println("Inside method - modified: " + num);
    }
}