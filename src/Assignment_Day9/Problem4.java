package Assignment_Day9;

import java.util.*;

class Book implements Comparable<Book> {
    int bookId;
    String title;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(other.bookId, this.bookId);
    }

    @Override
    public String toString() {
        return "Book{bookId=" + bookId + ", title='" + title + "'}";
    }
}

public class Problem4 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Java Programming"));
        books.add(new Book(3, "Python Basics"));
        books.add(new Book(2, "C for Beginners"));

        System.out.println("Before sorting:");
        books.forEach(System.out::println);

        Collections.sort(books);

        System.out.println("\nAfter sorting by bookid in descending order");
        books.forEach(System.out::println);
    }
}