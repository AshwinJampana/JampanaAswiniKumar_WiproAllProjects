package Enum;

import java.util.Scanner;

import Enum.Enum3.Day;

public class Enum4 {
	enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
	public static void main(String[] args) throws IllegalArgumentException {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Day d=Day.valueOf(s);
		
		System.out.println((d==Day.Saturday || d==Day.Sunday)? "WEEKEND":"WEEKDAY");
		switch(d)
		{
		case Monday:System.out.println("Monday");
		break;
		case Tuesday:System.out.println("Tuesday");
		break;
		case Wednesday:System.out.println("Wednesday");
		break;
		case Thursday:System.out.println("Thursday");
		break;
		case Friday:System.out.println("Friday");
		break;
		case Saturday:System.out.println("Saturday");
		break;
		case Sunday:System.out.println("Sunday");
		break;
	}

	}

}
