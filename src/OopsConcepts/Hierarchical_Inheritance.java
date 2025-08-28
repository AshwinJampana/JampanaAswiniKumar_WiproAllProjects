package OopsConcepts;
class Vehicle1
{
	void start() 
	{
		System.out.println("Vehicle start with key,Kick or button");
	}
	void stop() 
	{
		System.out.println("Vehicle stop with key,button");
	}
}
class Car extends Vehicle1
{
	void type_of_car(String type) 
	{
		System.out.println("Type of car ="+type);
	}
	void no_of_seats(int seats) {
		System.out.println("Number of Seats ="+seats);
	}
}
class Baleno extends Car{
	void color(String color) {
		System.out.println("Color is "+color);
	}
}
class Ertiga extends Car{
	void color(String color) {
		System.out.println("Color is "+color);
	}
}
class Scooter extends Vehicle1{
	void type_of_scooter(String type) 
	{
		System.out.println("Type ="+type);
	}
	void no_of_seats(int seats) {
		System.out.println("Number of Seats ="+seats);
	}
}
class Activa extends Scooter{
	void speed(int speed) {
		System.out.println("Speed "+speed);	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********Baleno********");	
		Baleno baleno=new Baleno();
		baleno.start();
		baleno.stop();
		baleno.no_of_seats(5);
		baleno.type_of_car("petrol");
		baleno.color("blue");
		System.out.println("********Ertiga********");
		Ertiga ertiga=new Ertiga();
		ertiga.start();
		ertiga.stop();
		ertiga.no_of_seats(7);
		ertiga.type_of_car("Disel");
		ertiga.color("White");
		System.out.println("********Activa********");
		Activa activa=new Activa();
		activa.start();
		activa.stop();
		activa.no_of_seats(2);
		activa.speed(100);
		activa.type_of_scooter("electric");


	}

}
