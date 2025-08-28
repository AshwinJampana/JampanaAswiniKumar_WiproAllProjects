package Interfaces;
interface Parent1{
	void flat();
	void car();
}
interface Parent2{
	void flat();
	void bike();
}
class Child implements Parent1,Parent2{
	public void bike() {
		System.out.println("Sports bike");
	}
	public void flat() {
		System.out.println("2BHK Flat");
	}
	public void car() {
		System.out.println("Sports Car");
	}
}
public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.bike();
		c.car();
		c.flat();

	}

}
