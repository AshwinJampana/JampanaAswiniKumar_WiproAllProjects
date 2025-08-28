package OopsConcepts;

public class Oops_Practice {
	Oops_Practice(){
		System.out.println("Deafult Constructor");
	}
	Oops_Practice(int id,String name){
		System.out.println("Id    ="+id);
		System.out.println("Name  ="+name);
	}
	Oops_Practice(String name,int id){
		System.out.println("Name  ="+name);
		System.out.println("Id    ="+id);
	}
	Oops_Practice(String name,int id,float salary){
		System.out.println("Name   ="+name);
		System.out.println("Id     ="+id);
		System.out.println("Salary ="+salary);
	}
	public static void main(String[] args) {
		Oops_Practice obj=new Oops_Practice();
		System.out.println("***********************");
		Oops_Practice obj1=new Oops_Practice(101,"sai");
		System.out.println("***********************");
		Oops_Practice obj2=new Oops_Practice("sai",101);
		System.out.println("***********************");
		Oops_Practice obj3=new Oops_Practice("sai",101,50000);
	}

}
