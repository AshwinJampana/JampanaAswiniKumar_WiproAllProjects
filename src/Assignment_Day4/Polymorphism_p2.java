package Assignment_Day4;
class Shape{
	void area() {
		System.out.print("Area ");
	}
}
class Circle extends Shape{
	final float pi=3.14f;
	@Override
	void area() {
		System.out.println("Area of circle is pi*r*r");
	}
	void area(float r) {
		System.out.println("Ara of circle is "+(pi*r*r));
	}
}
class Rectangle extends Shape{
	@Override
	void area() {
		System.out.println("Area of Rectangle is l*b");
	}
}
public class Polymorphism_p2 {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.area();
		c.area(2.3f);
		Rectangle r=new Rectangle();
		r.area();
	}

}
