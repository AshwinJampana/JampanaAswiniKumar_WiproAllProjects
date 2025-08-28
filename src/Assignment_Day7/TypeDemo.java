package Assignment_Day7;

class TypeDemo {
    static void changePrimitive(int x) { x = 10; }
    static void changeObject(Student s) { s.marks = 100; }
    
    public static void main(String[] args) {
        int x = 5;
        Student s = new Student("Tom", 75);
        changePrimitive(x);
        changeObject(s);
        System.out.println(x); 
        System.out.println(s.marks); 
    }
}
