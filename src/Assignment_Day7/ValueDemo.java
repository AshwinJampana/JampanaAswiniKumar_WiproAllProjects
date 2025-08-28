package Assignment_Day7;

class ValueDemo {
    static void change(int x) {
        x = 10;
    }
    
    public static void main(String[] args) {
        int x = 5;
        change(x);
        System.out.println(x); 
    }
}