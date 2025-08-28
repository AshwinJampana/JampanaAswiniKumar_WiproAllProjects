package Assignment_Day5;

class Rectangle
{
	private int height,width;
	Rectangle(int height,int width){
		this.height=height>0 ? height:20;
		this.width=width>0?width:20;
	}
	void setheight() {
		this.height=height>0?height:20;
		System.out.println("Updated Height"+height);
	}
	void setwidth() {
		this.width=width>0?width:20;
		System.out.println("Updated Width"+width);
	}
	void getArea() {
		System.out.println("Area is"+(height*width));
	}
	void getPerimeter() {
		System.out.println("Perimeter is "+(2*(height+width)));
	}
	void displaydetails() {
		System.out.println("Height"+height);
		System.out.println("Width"+width);
		System.out.println("Area is"+(height*width));
		System.out.println("Perimeter is "+(2*(height+width)));
	}
}
public class Recatngle {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(-20,30);
		r.getArea();
		r.getPerimeter();
		r.displaydetails();
		

	}

}
