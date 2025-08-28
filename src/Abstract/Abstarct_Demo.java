package Abstract;

abstract class Animal{
	 void eat() {
		 System.out.println("Eating");
	 }
	abstract void sound() ;
}
class Dog extends Animal{
	
	void sound() {
		System.out.println("Sound is Barking");
	}
}
class Tiger extends Animal{
	
	@Override
	void sound() {
		System.out.println("Sound =Roar");
	}
}
public class Abstarct_Demo {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.sound();
		Tiger t=new Tiger();
		t.eat();
		t.sound();

	}

}
