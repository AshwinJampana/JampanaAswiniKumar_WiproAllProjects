package Assignment_Day6;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        System.out.print("temperature in Celsius: ");
	        double celsius = sc.nextDouble();
	        double fahrenheit = celsius * 9.0/5 + 32;
	        int fahrenheitTruncated = (int)fahrenheit;
	        System.out.printf(" Fahrenheit in double : %.2fF\n", fahrenheit);
	        System.out.println("Fahrenheit in int: " + fahrenheitTruncated + "F");
	        
	       
	}

}
