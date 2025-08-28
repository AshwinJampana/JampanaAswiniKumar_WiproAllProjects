package OopsConcepts;

class Vehicle{
	void type() {
		System.out.println("Vehicle");
	}
}
class Four_Wheeler extends Vehicle{
	void type1() {
		System.out.println("FourWheeler");
	}
}
class Petrol_Four_Wheeler extends Four_Wheeler{
	void type2() {
		System.out.println("Petrol FourWheeler");
	}
}
class FiveSeater_Petrol_Four_Wheeler extends Petrol_Four_Wheeler{
	void type3() {
		System.out.println("Five Seater Petrol Four Wheeler");
	}
}
class Baleno_FiveSeater_Petrol_Four_Wheeler extends FiveSeater_Petrol_Four_Wheeler{
	void type4() {
		System.out.println("Baleno Five Seater Petrol Four Wheeler");
	}
}
public class Multiple_Inheritance_Vehicle {
	public static void main(String args[]) {
		Baleno_FiveSeater_Petrol_Four_Wheeler obj=new Baleno_FiveSeater_Petrol_Four_Wheeler();
		obj.type();
		obj.type1();
		obj.type2();
		obj.type3();
		obj.type4();
	}

}
