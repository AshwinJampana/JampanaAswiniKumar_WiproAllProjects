package Assignment_Day4;
class Vehicle2{
	void start() {
		System.out.println("Vehicle started");
	}
}
class car extends Vehicle2{
	void start() {
		System.out.println("Car starts with key ");
	}
}
class Bike2 extends Vehicle2{
	void start() {
		System.out.println("Bike starts with kick ");
	}
}
class Truck extends Vehicle2{
	void start() {
		System.out.println("Truck starts with keys ");
	}
}
public class Polymorphism_p6 {
	public static void vehstaart(Vehicle2 vehicle) {
		vehicle.start();
	}
	public static void main(String[] args) {
		
		Vehicle2 car=new car();
		Vehicle2 bike=new Bike2();
		Vehicle2 truck=new Truck();
		
		vehstaart(car);
		vehstaart(bike);
		vehstaart(truck);
		
	}

}
