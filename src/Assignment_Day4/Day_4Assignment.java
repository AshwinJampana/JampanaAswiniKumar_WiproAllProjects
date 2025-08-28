package Assignment_Day4;

class Vehicle {
	String name="Vehicle";
	void start() {
			System.out.println("Starts with key/Kick");
	}
	void stop() {
		System.out.println("Stops with key or brakes");
	}
}
class Bike extends Vehicle{
	void name() {
		System.out.println("Name ="+super.name);
	}
	@Override
	void start() {
		super.start();
		System.out.println("Bike starts with kick");
	}
}

public class Day_4Assignment {

	public static void main(String[] args) {
		Bike b=new Bike();
		
		b.start();
		b.name();
		b.stop();
	}

}
