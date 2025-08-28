package OopsConcepts;
class Vehicle2
{
	int speed=70;
}
class car extends Vehicle2{
	int speed=100;
	void showSpeed() {
		System.out.println("Car Normal Speed "+speed);
		System.out.println("Vehicle Normal Speed "+super.speed);
		//System.out.println(this.speed);
		
	}
}
public class Vehi_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		c.showSpeed();

	}

}
