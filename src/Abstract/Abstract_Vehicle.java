package Abstract;
abstract class Vehicle{
	abstract void no_of_tyre();
	abstract void no_of_seats();
	abstract void run_on();
	void strat_stop() {
		System.out.println("Vehicle start on fuel and stop with button");
	}
}
class Car extends Vehicle{
	void no_of_tyre() {
		System.out.println("4 wheels");
	}
	void no_of_seats() {
		System.out.println("5 or 7 seats");
	}
	void run_on() {
		System.out.println("Car run on Petrol,disel or battery");
	}
}
class Scooter extends Vehicle{
	void no_of_tyre() {
		System.out.println("2 wheels");
	}
	void no_of_seats() {
		System.out.println("2 or 3 seats");
	}
	void run_on() {
		System.out.println("Scooter  run on Petrol,disel or battery");
	}
}
public class Abstract_Vehicle {
	public static void main(String[] args) {
		System.out.println("*****CAR*****");
		Car c =new Car();
		c.no_of_seats();
		c.no_of_tyre();
		c.run_on();
		System.out.println("*****Scooter*****");
		Scooter s=new Scooter();
		s.no_of_tyre();
		s.no_of_seats();
		s.run_on();
		
	}
}
