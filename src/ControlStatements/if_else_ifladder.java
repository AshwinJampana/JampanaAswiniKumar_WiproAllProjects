package ControlStatements;

public class if_else_ifladder {

	public static void main(String[] args) {
//		float per=87.6f;
//		if(per>=75 && per<=100)
//		{
//			System.out.println("Distinction");
//		}
//		else if(per>=60 && per<75)
//		{
//			System.out.println("First Class");
//		}
//		else if(per>=50 && per <60)
//		{
//			System.out.println("Second Class");
//		}
//		else if(per>=40 && per<50)
//		{
//			System.out.println("Pass Class");
//		}
//		else if (per>=0 && per<40) {
//			
//			System.out.println("Fail");
//		}
//		else {
//			System.out.println("Invalid Input");
//		}
		

/* write a program to check temperature and display message like
* 40c --> "Very hot
* 30-40c-->HOt
* 20-29c-->warm
* 10-19c-->Cool
* <10c-->very cool*/
		
//		float temp=22.4f;
//		if(temp>=40) {
//			System.out.println("Very Hot");
//		}
//		else if(temp>=30 && temp<40) {
//				System.out.println("Hot");
//			
//		}
//		else if(temp>=20 && temp<30) {
//			System.out.println("Warm");
//		}
//		else if(temp>=10 && temp<200) {
//			System.out.println("Cool");
//		}
//		else if(temp<10) {
//			System.out.println("Ver Cool");
//		}
//		else {
//			System.out.println("Invalid Input");
//		}
		
		
		
/* write a program to calculate bill category based on units used
* units<100-->"Low usage"
* 100-299-->"Medium usage"
* 300-499-->"High usage"
* 500+-->"Very high usage*/	
		
//		
//		float units=450f;
//		if(units>=0 && units<100) {
//			System.out.println("Low Usage");
//		}
//		else if(units>=100 && units<300) {
//			System.out.println("Medium Usage");
//		}
//		else if(units>=300 && units<500) {
//			System.out.println("High Usage");
//		}
//		else if(units>=500) {
//			System.out.println(" Very High Usage");
//		}
//		else {
//			System.out.println("Invalid Input");
//		}
		
/* write a program to display a message based on signal color
Red=🡪stop
Yellow🡪Ready
Green 🡪GO
Any other🡪”Invalid color */		
		
//		String signal_color="RED";
//		if(signal_color=="RED") {
//			System.out.println("STOP");
//		}
//		else if(signal_color=="Yellow") {
//			System.out.println("Ready");
//		}
//		else if(signal_color=="Green") {
//			System.out.println("GO");
//		}
//		else {
//			System.out.println("Invalid color");
//		}
		
		
		
		
		boolean isreg=true;
		boolean hashallticket=true;
		if(isreg) {
			if(hashallticket) {
				System.out.println("You can Write your Exam");
			}
			else {
				System.out.println("You need a hall ticket");
			}
		}
		else {
			System.out.println("You are not Registered");
		}
		
		
		/*1.check if a user can log in
		* first check if Username is correct
		* then check if password is correct
		*
		* 2. write a program for loan approval
		* first check if salary>25000
		* then check if credit score >=700
		*
		* 3. write a program for driving license eligibility
		* age must be greater than equal to 18
		* must have passed the driving test*/
		 		
		
//		String usrname="Jayadeep";
//		String password="abc@123456";
//		if (usrname=="Jayadeep") {
//			System.out.println("Username matched");
//			if(password=="abc@123456") {
//				System.out.println("Password matched");
//				System.out.println("Login Successful");
//			}
//			else {
//				System.out.println("Password not matched");
//				System.out.println("Login Failed");
//			}
//		}
//		else {
//			System.out.println("Username not matched");
//			System.out.println("Login Failed");
//		}
		
		
		/*  2. write a program for loan approval
		* first check if salary>25000
		* then check if credit score >=700*/
//		double salary=25000;
//		int creditscore=700;
//		if(salary>25000) {
//			if(creditscore>=700) {
//				System.out.println("LOAN APPROVED");
//			}
//			else {
//				System.out.println("LOAN NOT APPROVED DUE TO CREDIT SCORE");
//			}
//		}
//		else {
//			System.out.println("Loan Rejected due to salary");
//		}
		
		
		
		
		
		
		
		
	}

}
