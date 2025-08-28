package OopsConcepts;


class Test{
	void show() {
		System.out.println("Test class method show");
	}
}
class TestData extends Test{
	void display() {
		System.out.println("Testdata class method display");
	}
}
public class Inheritance_Practice {
	
	public static void main(String args[]) {
		TestData td=new TestData();
		td.show();
		
	}

}
