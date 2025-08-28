package Polymorphism;

public class Student {
	void details(int rollno) {
		System.out.println("Roll no="+rollno);
	}
	void details(int rollno,String name) {
		System.out.println("Rollno="+rollno);
		System.out.println("Name="+name);
	}
	void details(String name,int rollno) {
		
		System.out.println("Name="+name);
		System.out.println("Rollno="+rollno);
	}
	void details(int rollno,String name,float per) {
		System.out.println("Rollno="+rollno);
		System.out.println("Name="+name);
		System.out.println("Percaentage="+per);
	}
	public static void main(String[] args) {
	
		Student s=new Student();
		System.out.println("********Details method with rollno********");
		s.details(101);
		System.out.println("********Details method with rollno and name********");
		s.details(102,"sharma");
		System.out.println("********Details method with name and rollno********");
		s.details("shiva", 103);
		System.out.println("********Details method with rollno ,name and percentage********");
		s.details(104, "Varma", 85.6f);
	}

}
