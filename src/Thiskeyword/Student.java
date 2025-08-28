package Thiskeyword;

public class Student {
	int rollno,age;
	String name,collegename,address;
	float per;
	void getDetails(int rollno,String name,float per) 
	{
		this.rollno=rollno;
		this.name=name;
		this.per=per;
		System.out.println("Name ="+name);
		System.out.println("RollNo ="+rollno);
		System.out.println("Percentage ="+per);	
	}
	void getDetails(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
		System.out.println("RollNo ="+rollno);
		System.out.println("Name ="+name);
	}
	public static void main(String[] args) {
		
		Student s=new Student();
		s.getDetails(101,"eswar", 89.09f);
		s.getDetails(102, "hari");
	}

}
