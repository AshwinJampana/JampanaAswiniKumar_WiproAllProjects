package Type_casting;

class Test{
	void show() {
		System.out.println("Show Method");
	}
}
class Test1 extends Test
{
	void display() {
		System.out.println("Welcome");
	}
}
public class Test_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test1();
		t.show();
		Test1 tt=(Test1)t;
		tt.display();
		tt.show();

	}

}
