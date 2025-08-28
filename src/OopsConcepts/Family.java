package OopsConcepts;
class Mohan{
	void surname() {
		System.out.println("K");
	}
	void flat() {
		System.out.println("2BHK Flat");
	}
	void car() {
		System.out.println("Baleno");
	}
}
class Ram extends Mohan{
	void bike() {
		System.out.println("Pulsar ");
	}
	void job() {
		System.out.println("Automation Testing");
	}
}
public class Family {
	public static void main(String args[]) {
		Ram obj=new Ram();
		System.out.print("Ram ");
		obj.surname();
		obj.flat();
		obj.car();
		obj.bike();
		obj.job();
	}

}
