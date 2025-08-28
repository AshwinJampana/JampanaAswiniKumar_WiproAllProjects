package Assignment_Day4;
class Vehicle1{
	Vehicle1(){
		System.out.println("Vehicle Created");
	}
	void start() {
		System.out.println("Vehicle started");
	}
}
class Bike1 extends Vehicle1{
	Bike1(){
		
		super();
		System.out.println("Bike Created");
		
	}
	@Override
	void start() {
		super.start();
		System.out.println("Bike Started");
	}
}
public class Polymorphism_p4 {

	public static void main(String[] args) {
		Bike1 b=new Bike1();
		b.start();

	}

}
