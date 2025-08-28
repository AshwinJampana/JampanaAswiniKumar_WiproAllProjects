package Strings;

public class Strings_Practice {
//	int a=10;//instance variable-available for all
//	void show() {
//		System.out.println(a);//allocate memory for variable a
//	}
//	void show1() {
//		System.out.println(a);//allocate memory for variable a again
//	}
	
//	int age,rollno;
//	float per;
//	String name;
//	static String collegename="ABC";
	int empid,age;
	String empname;
	static String empcompany="ABC";
	
	
	
	void details(int empid1,int age1,String empname1) {
		empid=empid1;
		age=age1;
		empname=empname1;
		
		
		
		
		System.out.println("Employee id           ="+empid);
		System.out.println("Age                   ="+age);
		
		System.out.println("EmployeeName          ="+empname);
		System.out.println("empcompany            ="+empcompany);
		
	}
	public static void main(String[] args) {
		
		//Variables
		Strings_Practice obj=new Strings_Practice();
//		System.out.println("**************Student 1**************");
//		obj.details(101,25,"sai",85);
//		System.out.println("**************Student 2**************");
//		obj.details(102,24,"venkat",82);
		
		System.out.println("**************Employee 1**************");
		obj.details(101,25,"sai");
		System.out.println("**************Employee 2**************");
		obj.details(102,24,"Venkat");
		
	}

}
