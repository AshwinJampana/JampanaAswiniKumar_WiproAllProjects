
package protect;

import Encapsulation.Protected;

public class Demo extends Protected {  
    public void showMessage() {
        System.out.println("Accessing protected field: " + message);  
        display(); 
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.showMessage(); 
    }
}