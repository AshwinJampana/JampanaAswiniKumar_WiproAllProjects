package Encapsulation;

public class Student {
	private String name="Navin";
	private int age=24;
	public String setname() {
		return name;
	}
	public void getname() {
		System.out.println(name);
	}
	public int setage() {
		return age;
	}
	public void getage() {
		System.out.println(age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.getname();
		s.getage();
		
	}

}
