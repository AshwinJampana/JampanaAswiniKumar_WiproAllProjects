package Assignment_Day5;

class Student{
	private int rollnumber;
	private String name;
	private float marks;
	Student(int rollnumber,String name,float marks)
	{
		this.rollnumber=rollnumber;
		this.name=name;
		this.marks=(marks>0 && marks<100)?marks:0;
	}
	void getRollno() {
		System.out.println("RollNumber");
	}
	void getname() {
		System.out.println("Name");
	}
	void getmarks() {
		System.out.println("Marks");
	}
	void displaydetails() {
		System.out.println("RollNumber="+rollnumber);
		System.out.println("Name=      "+name);
		System.out.println("marks=     "+marks);
	}
	
}
public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(101,"Ram",85.6f);
		s.displaydetails();
		s.getRollno();
		s.getname();
		s.getmarks();
	}

}
