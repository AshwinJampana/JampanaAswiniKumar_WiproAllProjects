package Exceptions_Practice;

public class Exceptions {

    public static void main(String[] args) {
        System.out.println("Demonstrating various exceptions in Java:");
        
       

        try {
            String nullStr = null;
            System.out.println(nullStr.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try {
            Object obj = "This is a string";
            Integer num = (Integer) obj; 
        } catch (ClassCastException e) {
            System.out.println(e);
        }

       
        try {
            Class.forName("NonExistentClass"); 
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

      
        try {
            Thread.sleep(-100); 
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            int num = Integer.parseInt("123abc"); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println(e);
        }


        try {
            java.util.List<String> immutableList = java.util.List.of("a", "b", "c");
            immutableList.add("d"); 
        } catch (UnsupportedOperationException e) {
            System.out.println( e);
        }

        
    }
}