package Assignment_Day9;

import java.util.*;

class Product implements Comparable<Product> {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

public class Problem2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Phone", 699.99));
        products.add(new Product("Tablet", 299.99));

        System.out.println("Before sorting:");
        products.forEach(System.out::println);

        Collections.sort(products);

        System.out.println("After sorting");
        products.forEach(System.out::println);
    }
}