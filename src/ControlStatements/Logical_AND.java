package ControlStatements;

public class Logical_AND {

	public static void main(String[] args) {
		
		//Logical AND (&&)
		
		
//		int age=17;
//		int wt=40;
//		if(age>=18 && wt>=30) 
//		{
//			System.out.println("Eligible for Blood Donation");
//		}
//		else {
//			System.out.println("Not Eligible for Blood Donation");
//		}
//		int money=10000;
//		boolean has_Leave=true;
//		if (money>5000 && has_Leave) {
//			System.out.println("You can go for a trip");
//		}
//		else {
//			System.out.println("You cannot go for a trip");	
//		}
		
		
		//Logical OR (||)
		
//		char ch='a';
//		if (ch=='A' || ch=='a' ||ch=='E' || ch=='e' ||ch=='I' || ch=='i' ||ch=='O' || ch=='o' ||ch=='U' || ch=='u') {
//			System.out.println(ch +" is Vowel");
//		}
//		else {
//			System.out.println(ch+" is Consonant");
//		}
		
		
		
/* Write a java prog using if else stmt that checks a person's eligibility for entry an discount based on the following conditions
 		1.the person must be 18 years or older and must have an id card to be allowed entry
 		2.the person should get a student discount if they are under 18 or if they are student
 */
		
//		int personage=16;
//		boolean has_idcard=false;
//		if (personage>=18 && has_idcard) 
//		{
//			System.out.println("Discount Allowed");
//		}
//		else if(personage<18 && has_idcard) {
//			System.out.println("Discount Allowed under Student Category");
//		}
//		else {
//			System.out.println("Not Eligible For Discounts");
//		}
		
//		int personage=20;
//		boolean has_idcard=true;
//		boolean is_student=false;
//		if(has_idcard) 
//		{
//				System.out.println("Gets Entry");
//				
//
//		}
//		else {
//			System.out.println("No  Entry");
//		}
//		if( personage<18 ||is_student) {
//			System.out.println("Gets student Discount");
//		}
//		else {
//			System.out.println("Gets discount");
//		}
		
		
		/*print weekdays if it is mon, tue, wed, thu, fri
		 else print weekend*/
//		
//		String day="sunday";
//		if (day=="saturday" || day=="sunday") 
//		{
//			System.out.println("Weekend");
//		}
//		else {
//			System.out.println("WeekDays");
//		}
		

		
		/*check if a student is eligible for a scholarship
		* 1. a student must have score above 80 or must be from reserved category
		*
		* output=Scholarship granted or
		* not eligible for the scholarship*/
		
//		int score=8;
//		boolean is_reserved_category=true;
//		if (score>80 ||is_reserved_category)
//		{
//			System.out.println("Scholarship Granted");
//		}
//		else {
//			System.out.println("Not Eligible for Scholarship");
//		}
	
		
//		int a=5,b=10;
//		System.out.println("Addition is "+(a+b));
//		System.out.println("a>b  "+(a>b));
//		System.out.println("Logical "+(a&b));
		
//		Object obj = "Hello";   
//		if (obj instanceof String) {   
//		    System.out.println("obj is a String");   
//		} 
		
		
		int a = 10, b = 20;  
		String res = (a > b) ? "a is larger" : "b is larger";  
		System.out.println(res);  
	}

}
