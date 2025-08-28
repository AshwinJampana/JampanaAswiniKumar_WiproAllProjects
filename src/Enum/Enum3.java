package Enum;



public class Enum3 {
	enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}

	public static void main(String[] args) {
		Day d=Day.Monday;
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
