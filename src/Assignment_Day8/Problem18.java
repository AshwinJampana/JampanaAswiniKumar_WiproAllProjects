package Assignment_Day8;


import java.util.LinkedHashSet;
import java.util.Objects;

public class Problem18 {
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(5); 
        System.out.println("LinkedHashSet maintains insertion order:");
        System.out.println(numbers); 

       
        LinkedHashSet<Student> students = new LinkedHashSet<>();
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));
        
        System.out.println("\nStudents:");
        students.forEach(System.out::println);
        
       
        System.out.println("\nAttempting to add duplicate student Alice...");
        boolean added = students.add(new Student(1, "Alice"));
   

        
        LinkedHashSet<String> cities1 = new LinkedHashSet<>();
        cities1.add("New York");
        cities1.add("London");
        
        LinkedHashSet<String> cities2 = new LinkedHashSet<>();
        cities2.add("Tokyo");
        cities2.add("London");
        
        LinkedHashSet<String> merged = new LinkedHashSet<>(cities1);
        merged.addAll(cities2);
        System.out.println("\nMerged LinkedHashSet: " + merged);
    }
}

class Student {
    int id;
    String name;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}