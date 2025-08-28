package Interfaces;
interface Shapes{
	void area();
}
class Rectangle implements Shapes{
	public void area() 
	{
		System.out.println("Rectanle Area is length * breadth");
	}
}
class Circle implements Shapes{
	public void area() 
	{
		System.out.println("Circle Area is PI*r*r");
	}
}
public class Shape {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.area();
		Circle c=new Circle();
		c.area();
		
	}

}
