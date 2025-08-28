package Polymorphism;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
    
    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
    
    void start() {
        System.out.println("Car starts with a key");
    }
    
    
    void stop() {
        System.out.println("Car stops by applying brakes");
    }
}

class Bike extends Vehicle {
   
    void start() {
        System.out.println("Bike starts with a kick");
    }
    void stop() {
        System.out.println("Bike stops by using brakes");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();
        v.stop();
        
        Car c = new Car();
        c.start();
        c.stop();
        
        Bike b = new Bike();
        b.start();
        b.stop();
    }
}