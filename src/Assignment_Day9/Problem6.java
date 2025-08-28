package Assignment_Day9;

import java.util.*;

class Student {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{rollNo=" + rollNo + ", name='" + name + "', marks=" + marks + "}";
    }
}

public class Problem6 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Hari", 85.5));
        students.add(new Student(2, "Eswar", 90.0));
        students.add(new Student(3, "Kumar", 75.5));

        System.out.println("Before sorting:");
        students.forEach(System.out::println);

      
        Comparator<Student> marksComparator = (s1, s2) -> Double.compare(s2.marks, s1.marks);
        Collections.sort(students, marksComparator);

        System.out.println("After sorting by marks in descending order");
        students.forEach(System.out::println);
    }
}