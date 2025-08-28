package Assignment_Day8;

import java.util.ArrayList;

public class Problem10 {
    public static void main(String[] args) {

        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Mango");
        
        System.out.println("Original ArrayList: " + originalList);

        ArrayList<String> copiedList = new ArrayList<>();

        copiedList.addAll(originalList);
        
        System.out.println("Copied ArrayList: " + copiedList);

        System.out.println("Original list size: " + originalList.size());
        System.out.println("Copied list size: " + copiedList.size());
        
    }
}
