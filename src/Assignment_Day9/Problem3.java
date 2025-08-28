package Assignment_Day9;

import java.util.*;

class Employee implements Comparable<Employee> {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class Problem3 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Hari", 60000));
        employees.add(new Employee("Eswar", 50000));
        employees.add(new Employee("Kumar", 70000));

        System.out.println("Before sorting:");
        employees.forEach(System.out::println);

        Collections.sort(employees);

        System.out.println("After sorting");
        employees.forEach(System.out::println);
    }
}