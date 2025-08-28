package Assignment_Day9;

import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return "Student{rollNo=" + rollNo + ", name='" + name + "', marks=" + marks + "}";
    }
}

public class Problem1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "hari", 85.5));
        students.add(new Student(1, "eswar", 90.0));
        students.add(new Student(2, "kumar", 75.5));

        System.out.println("Before sorting:");
        students.forEach(System.out::println);

        Collections.sort(students);

        System.out.println("After sorting");
        students.forEach(System.out::println);
    }
}