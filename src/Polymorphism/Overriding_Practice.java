//package Polymorphism;
//class Animal{
////	void eat() {
////		System.out.println("Eating");
////	}
//	void sound() {
//		System.out.println("Sound");
//	}
//}
//class Dog extends Animal{
////	void eat() {
////		System.out.println("Royal canin");
////	}
//	void sound() {
//		System.out.println("Sound is Barking");
//	}
//	void fetch() {
//		
//	}
//}
////class Tiger extends Animal{
////	void eat() {
////		System.out.println("Eats =Meat");
////		
////	}
////	@Override
////	void sound() {
////		System.out.println("Sound =Roar");
////	}
////}
//public class Overriding_Practice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Dog d=new Dog();
//		d.eat();
//		d.sound();
//		Tiger t=new Tiger();
//		t.eat();
//		t.sound();
//		
//	}
//
//}








package Polymorphism;

class Animal {
    void makeSound() {
        System.out.println("animal sound");
    }
}

class Dog extends Animal {
    
    void makeSound() {
        System.out.println("Woof!");
    }
    
    void fetch() {
        System.out.println("Fetching the ball...");
    }
}

public class Overriding_Practice {
    public static void main(String[] args) {
    
        Dog d = new Dog();
        Animal a = d;  
        a.makeSound();  
        
        
        
    }
}






