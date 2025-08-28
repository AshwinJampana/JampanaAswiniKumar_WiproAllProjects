package ControlStatements;

public class Conditional_Stmts {
	public static void main(String args[]) {
		int age=17;
		if(age>=18) 
		{
			System.out.println("Eligible to Vote");
		}
		else {
			System.out.println("Wait "+(18-age)+" year to Vote");
		}
		String b = age>0 ? (age>18 ? "Eligible to Vote" : "Not Eligible to Vote") : "Enter positive value for age";
		System.out.println(b);
	}

}
