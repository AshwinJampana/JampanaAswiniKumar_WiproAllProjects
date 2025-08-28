package Encapsulation;

public class Protected {
    protected String message = "This is a protected message";

    protected void display() {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Protected obj = new Protected();
        obj.display();  
    }
}