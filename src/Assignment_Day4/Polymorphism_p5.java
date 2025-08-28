package Assignment_Day4;

abstract class SmartDevice{
	abstract void turnon();
	abstract void turnoff();
	abstract void performsFunction();
	
}
class SmartPhone extends SmartDevice{
	void turnon() {
		System.out.println("Smartphone on");
	}
	void turnoff() {
		System.out.println("Smartphone off");
	}
	void performsFunction() {
		System.out.println("Smartphone has features calling and browsing");
	}
	
}
class SmartWatch extends SmartDevice{
	void turnon() {
		System.out.println("SmarWatch on");
	}
	void turnoff() {
		System.out.println("SmartWatch off");
	}
	void performsFunction() {
		System.out.println("Smartwatch has features tracks fitness and time");
	}
	
}
class SmartSpeaker extends SmartDevice{
	void turnon() {
		System.out.println("SmarSpeaker on");
	}
	void turnoff() {
		System.out.println("SmartSpeaker off");
	}
	void performsFunction() {
		System.out.println("SmartSpeaker has features plays music  and responds to voice commands");
	}
	
}
public class Polymorphism_p5 {

	public static void main(String[] args) {
		SmartDevice[] devices=new SmartDevice[3];
		devices[0]=new SmartPhone();
		devices[1]=new SmartWatch();
		devices[2]=new SmartSpeaker();
		for(SmartDevice d:devices) {
			d.turnon();
			d.turnoff();
			d.performsFunction();
		}
		

	}

}
