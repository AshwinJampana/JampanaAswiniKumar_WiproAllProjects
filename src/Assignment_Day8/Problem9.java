package Assignment_Day8;
import java.util.ArrayList;

class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }


    public int getId() { return id; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

  
    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Marks=" + marks + "]";
    }
}

public class Problem9 {
    public static void main(String[] args) {
       
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Sai", 87.5));
        students.add(new Student(102, "Eswar", 92.0));
        students.add(new Student(103, "Kumar", 78.3));

        System.out.println("Student Details:");
        for (Student student : students) {
            System.out.println(student); 
        }
    }
}
