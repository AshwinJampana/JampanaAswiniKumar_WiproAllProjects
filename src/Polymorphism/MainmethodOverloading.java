package Polymorphism;

public class MainmethodOverloading {

	public static void main(String[] args) {
		System.out.println("Original Main Method");
		
		main(10);
		main("Main Method");
	}
	public static void main(int num) {
		System.out.println("num in overloaded main is "+num);
	}
	public static void main(String st ) {
		System.out.println("string in overloaded main is "+st);
	}

}
