package Assignment_Day9;

import java.time.*;
import java.util.*;

class Employee1 {
    String name;
    LocalDate joiningDate;

    public Employee1(String name, LocalDate joiningDate) {
        this.name = name;
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', joiningDate=" + joiningDate + "}";
    }
}

public class Problem8 {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("Hari", LocalDate.of(2020, 5, 15)));
        employees.add(new Employee1("Eswar", LocalDate.of(2019, 3, 10)));
        employees.add(new Employee1("Kumar", LocalDate.of(2021, 1, 20)));

        System.out.println("Before sorting:");
        employees.forEach(System.out::println);

       
        Comparator<Employee1> dateComparator = Comparator.comparing(e -> e.joiningDate);
        Collections.sort(employees, dateComparator);

        System.out.println("After sorting by joining date:");
        employees.forEach(System.out::println);
    }
}