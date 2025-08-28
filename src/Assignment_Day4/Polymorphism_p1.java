package Assignment_Day4;

class Calculator{
	void  add(int a,int b) {
		System.out.println("Addition  is "+(a+b));
	}
	void  add(int a,int b,int c) {
		System.out.println("Addition is "+(a+b+c));
	}
	void  add(double a,double b) {
		System.out.println("Addition is "+(a+b));
	}
}
public class Polymorphism_p1 {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(2, 5);
		c.add(1,2,3 );
		c.add(20000, 30.67);
	}

}
