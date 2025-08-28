package Thiskeyword;

public class Test1 {
	Test1(String name){
		System.out.println(name);
	}
	Test1(){
		this("I am from Test1 Parameterized constructor");
		System.out.println("Welcome ");
	}
	public static void main(String[] args) {
		Test1 t=new Test1();

	}

}
