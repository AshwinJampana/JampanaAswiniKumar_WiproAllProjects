package Assignment_Day9;

import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Problem5 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Hari", 25));
        people.add(new Person("Eswar", 30));
        people.add(new Person("Kumar", 20));

        System.out.println("Before sorting:");
        people.forEach(System.out::println);

        Collections.sort(people);

        System.out.println("After sorting");
        people.forEach(System.out::println);
    }
}