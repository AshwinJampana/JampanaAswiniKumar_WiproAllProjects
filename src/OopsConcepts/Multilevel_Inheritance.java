package OopsConcepts;
class Animal1{
	void eat(String eats) {
		System.out.println("Eats  ="+eats);
	}
	void sound(String sd) {
		System.out.println("Sound ="+sd);
	}
}
class Dog extends Animal1{
	void live(String lives) {
		System.out.println("Lives in "+lives);
	}
}
class Puppy extends Dog
{
	void breed(String bd) {
		System.out.println("Breed of Dog is "+bd);
	}
}

public class Multilevel_Inheritance {
	public static void main(String args[]) {
	Puppy maxi=new Puppy();
	maxi.eat("Royal canin");
	maxi.sound("bark");
	maxi.live("city");
	maxi.breed("Lab");
	
	}
}
