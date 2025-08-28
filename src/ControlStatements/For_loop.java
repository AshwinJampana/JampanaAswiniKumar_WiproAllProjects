package ControlStatements;

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//		
//		}
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
	
//		for(int i=5;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
		
		
		
		//1. print even number from 2 to 50
				
		System.out.println("Even Numbers from 1 to 50 are");
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		
		
		//2. print square of numbers from 1 to 10
		
//		System.out.println("Square of numbers from 1 to 10 is");
//		for(int i=1;i<=10;i++) {
//			System.out.println("Square of "+i+" is "+i*i);
//		}
		
		
		
		//3. calculate sum of first 50 numbers
//		System.out.println("Sum of First 50 numbers is");
//		int sum=0;
//		for(int i=1;i<=50;i++) {
//			sum=sum+i;
//		}
//		System.out.println("Sum of First 50 numbers is "+sum);
		
		
		
		
		
		//4. print multiplication table for 17
//		System.out.println("Table 17");
//		for(int i=1;i<=10;i++) {
//			System.out.println("17 * "+i+" ="+" "+17*i);
//		}
		
		
		//5. print reverse numbers from 20 to 1
//		System.out.println("Reverse NUmbers from 20 t0 1");
//		for(int i=20;i>=1;i--) {
//			System.out.print(" "+i+" ");
//		}
		
		
		
		//6. print factorial of a number(eg. 5!=5*4*3*2*1)
//	System.out.println("Factorial of a Number");
//	int n=5;
//	int fact=1;
//	for(int i=1;i<=n;i++) {
//		fact=fact*i;
//	}
//		System.out.println("Fcatorial of a "+n+" is "+fact);
		
		
		
		//7. check if a number is prime
//		System.out.println("Checking whether the number is prime or not");
//		int num=4;
//		int count=0;
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				count=count+1;
//			}
//		}
//		if(count==2) {
//			System.out.println(num+"is Prime");
//		}
//		else {
//			System.out.println(num+" is Not a Prime");
//		}
		
		
		
		
		//8. print pyramid pattern
//		System.out.println("Pyramid Pattern");
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=2*i-1;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		//9. print diamond shape using * sign
//		System.out.println("Diamond Pattern");
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=2*i-1;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=4;i>=1;i--)
//		{
//			for(int j=1;j<=5-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=2*i-1;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		

		
		
		//11. count total digits in a number
		
//		int number=0;
//		int s=0;
//		int count=0;
//		while(number>0) 
//		{
//			number=(int)number/10;
//			count++;
//		}
//		System.out.println(count);
		
		
		
		//12. check palindrome number
		
//		int num1=121;
//		int num2=num1;
//		int sum=0;
//		int digit;
//		while (num1>0)
//		{
//			digit=num1%10;
//			sum=sum*10+digit;
//
//			num1=(int)num1/10;
//		}
//		if(num2==sum)
//		{
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not a Palindrome");
//		}

		
		//13. sum of digits of number(6785=6+7+8+5)	
		
//		int num1=56;
//		int sum=0;
//		int digit;
//		
//		while(num1>0) {
//			digit=num1%10;
//			sum=sum+digit;
//			num1=(int)num1/10;
//		}
//		System.out.println("Sum of digits is "+sum);
//		
		
		
		//10. Print Fibonacci series up to 10 terms 1 2 3 5...
		
		
		
//		int prev=0;
//		int next=1;
//		int sum;
//		int n=10;
//		System.out.print("0 "+"1 ");
//		for(int i=2;i<=n;i++) {
//			
//			sum=prev+next;
//			prev=next;
//			next=sum;
//			System.out.print(" "+sum+" ");
//		}
		
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num=sc.nextInt();
//		if(num%2==0)
//		{
//			System.out.println("Even Number");
//		}
//		else {
//			System.out.println("Odd Number");
//		}
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter Your Full Name");
//		String name=sc.nextLine();
//		System.out.println("Enter Mobile Number");
//		long number=sc.nextLong();
//		sc.nextLine();
//		System.out.println("Enter Email Number");
//		String email=sc.nextLine();
//		System.out.println("Enter UserName");
//		String username=sc.nextLine();
//		System.out.println("Enter Password");
//		String password=sc.nextLine();
//		System.out.println("Confirm Password");
//		String cpassword=sc.nextLine();
//		
//		sc.close();
//		System.out.println("Registration Details are:..");
//		System.out.println("Name:              "+name);
//		System.out.println("Mobile Number:     "+number);
//		System.out.println("Email Address:     "+email);
//		System.out.println("UserName           "+username);
//		System.out.println("Password:          "+password);
//		System.out.println("confirm Password:  "+cpassword);
//		if(password.equals(cpassword)) {
//			System.out.println("Password Matched");
//		}
//		else {
//			System.out.println("Password Not Matched");
//		}
//		
		
		
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Enter year: ");
//		int year=sc.nextInt();
//		
//		if((year%4==0 && year%100!=0) || (year%400==0)) {
//			System.out.println(year+" is  Leap Year");
//		}
//		else {
//			System.out.println(year+" is not a  Leap Year");
//		}
//		
//		
//		sc.close();
//		
		
		
		
		
		
		
	}

}
