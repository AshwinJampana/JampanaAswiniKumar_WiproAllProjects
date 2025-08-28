package Assignment_Day9;

import java.util.*;

class Employee2 {
    String name;
    double salary;
    String department;

    public Employee2(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", department='" + department + "'}";
    }
}

public class Problem10 {
    public static void main(String[] args) {
        List<Employee2> employees = new ArrayList<>();
        employees.add(new Employee2("Hari", 60000, "HR"));
        employees.add(new Employee2("Eswar", 70000, "IT"));
        employees.add(new Employee2("Kumar", 50000, "Finance"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sort by:");
        System.out.println("1. Name");
        System.out.println("2. Salary");
        System.out.println("3. Department");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(employees, Comparator.comparing(e -> e.name));
                break;
            case 2:
                Collections.sort(employees, Comparator.comparingDouble(e -> e.salary));
                break;
            case 3:
                Collections.sort(employees, Comparator.comparing(e -> e.department));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("After sorting:");
        employees.forEach(System.out::println);
    }
}