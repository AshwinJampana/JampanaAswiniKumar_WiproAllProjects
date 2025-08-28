package Assignment_Day9;

import java.util.*;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

public class Problem7 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Phone", 699.99));
        products.add(new Product("Tablet", 299.99));

        
        Comparator<Product> priceAsc = Comparator.comparingDouble(p -> p.price);
        Collections.sort(products, priceAsc);
        System.out.println("Sorted by price ascending:");
        products.forEach(System.out::println);

        
        Comparator<Product> priceDesc = (p1, p2) -> Double.compare(p2.price, p1.price);
        Collections.sort(products, priceDesc);
        System.out.println("Sorted by price descending:");
        products.forEach(System.out::println);

       
        Comparator<Product> nameComparator = Comparator.comparing(p -> p.name);
        Collections.sort(products, nameComparator);
        System.out.println("Sort by name:");
        products.forEach(System.out::println);
    }
}