package OopsConcepts;
class School{
	School(){
		System.out.println("Particular Uniform");
		System.out.println("Fixed Syllabus");
		System.out.println("Follow Timing 7 to 5");
		
	}
}
class SNBP extends School{
	SNBP(){
		super();
		System.out.println("Ptatren of Education like 70% study 30% sports");
	}
}
class DPS extends School{
	DPS(){
		super();
		System.out.println("Ptatren of Education like 60% study 40% sports");
	}
}
public class Constructors_Practice {
	public static void main(String args[]) {
		SNBP snbp=new SNBP();
		DPS dps=new DPS();
	}
}
