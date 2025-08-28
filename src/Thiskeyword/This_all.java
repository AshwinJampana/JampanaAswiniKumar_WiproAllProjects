package Thiskeyword;

public class This_all {
    String name;
    int age;
    void setName(String name) {
        this.name = name; 
    }
    
    void show() {
        System.out.println("show Method");
    }
    
    
    void display() {
        this.show(); 
        System.out.println(this.name);
    }
    
   
    This_all() {
        this("sai", 20); 
        System.out.println("Default constructor called");
    }
    
    
    This_all(String name, int age) {
        this.name = name;
        this.age = age;
        printDetails(this); 
    }
    
    void printDetails(This_all obj) {
        System.out.println("details: " + obj.name + ", " + obj.age);
    }
    
    public static void main(String[] args) {
        This_all t1 = new This_all();
        t1.display();  
        This_all t2 = new This_all("Rahul", 25);
        t2.setName("New Name");
        t2.display();
    }
}