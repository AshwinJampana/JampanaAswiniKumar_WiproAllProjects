package Assignment_Day4;
abstract class Person{
	String name;
	int age;
	Person(String name, int age) {
        this.name = name;
        this.age = age;
	}
	abstract void getRoleInfo();
}
class Student extends Person{
	String course;
    int rollNumber;
    
    Student(String name, int age, String course, int rollNumber) {
        super(name, age);
        this.course = course;
        this.rollNumber = rollNumber;
    }
    void getRoleInfo() {
        System.out.println("STUDENT: " + name + ", Age: " + age + 
                         ", Course: " + course + ", Roll No: " + rollNumber);
    }
    
}
class Professor extends Person {
    String subject;
    double salary;
    
    Professor(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }
    
    @Override
    void getRoleInfo() {
        System.out.println("PROFESSOR: " + name + ", Age: " + age + 
                         ", Subject: " + subject + ", Salary: $" + salary);
    }
}
class TeachingAssistant extends Student {
    String assistingSubject;
    
    TeachingAssistant(String name, int age, String course, int rollNumber, String assistingSubject) {
        super(name, age, course, rollNumber);
        this.assistingSubject = assistingSubject;
    }
    
    @Override
    void getRoleInfo() {
        System.out.println("TEACHING ASSISTANT: " + name + ", Age: " + age + 
                          ", Course: " + course + ", Roll No: " + rollNumber + 
                          ", Assisting in: " + assistingSubject);
    }
}
public class polymorphism_p7 {

	public static void main(String[] args) {
		
			Student student = new Student("Alice", 20, "Computer Science", 101);
	        Professor professor = new Professor("Dr. Smith", 45, "Algorithms", 85000);
	        TeachingAssistant ta = new TeachingAssistant("Bob", 25, "Data Structures", 205, "Database Systems");
	        
	        
	        student.getRoleInfo();
	        professor.getRoleInfo();
	        ta.getRoleInfo();
	}

}
