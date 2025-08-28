package Basic_module;

public class First_Script {
//	String name="Jayadeep";
//	int number=12;
//	short number2=13;
//	float number3=34.5f;
//	boolean a = true;
//	char name2='K';
//	double d=19.89d;
//	byte b=100;

	int number;
	short number2;
	float number3;
	boolean a;
	char name2;
	double d;
	byte b;
	long l;
	public static void main(String[] args) 
	{
		System.out.println("This is My First Script");
		First_Script obj=new First_Script();
//		System.out.println("String    ="+ obj.name);
		System.out.println("Int       ="+ obj.number);
		System.out.println("Short     ="+ obj.number2);
		System.out.println("Float     ="+ obj.number3);
		System.out.println("Boolean   ="+ obj.a);
		System.out.println("Character ="+(int) obj.name2);
		System.out.println("Double    ="+obj.d);
		System.out.println("Byte      ="+obj.b);
		System.out.println("Long      ="+obj.l);
	}
}
