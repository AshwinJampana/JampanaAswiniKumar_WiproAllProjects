package Enum;
enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day today=Day.Saturday;
		System.out.println("Today is = "+today);
		Day todaym=Day.Monday;
		System.out.println("Day after tomorrow is="+todaym);
	}

}
