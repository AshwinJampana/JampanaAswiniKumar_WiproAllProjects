package Assignment_Day7;

class RefDemo {
    static void changeRef(Student s) {
        s = new Student("Alice", 95);
    }
    
    public static void main(String[] args) {
        Student s = new Student("Bob", 80);
        changeRef(s);
        System.out.println(s.name); 
    }
}
