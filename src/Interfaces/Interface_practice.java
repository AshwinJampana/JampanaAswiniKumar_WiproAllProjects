package Interfaces;
interface Animal
{
	void eat();
	void sound();
	default void show() {
		System.out.println("Hello");
	}

}
class Dog implements Animal
{
	public void eat() {
		System.out.println("Royal Canin");
	}
	public void sound() {
		System.out.println("Barking");
	}
	
}
public class Interface_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog max=new Dog();
		max.eat();
		max.sound();
		max.show();

	}

}
