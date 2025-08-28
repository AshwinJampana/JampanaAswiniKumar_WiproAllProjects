package Lambda;
interface Greeting
{
	void sayHello();
	
}
interface Bye{
	void saybye();
}
public class Lambda_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greet=()->System.out.println("Hello");
		Bye bye=()->System.out.println("Bye");
		greet.sayHello();
		bye.saybye();
	}

}
