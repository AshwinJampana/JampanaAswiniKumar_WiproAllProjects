package Assignment_Day11;

import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Student student = new Student("Hari", 101);
        String filename = "student.ser";

        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(student);
            System.out.println("Student object serialized");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Deserialized Student: " + deserializedStudent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}