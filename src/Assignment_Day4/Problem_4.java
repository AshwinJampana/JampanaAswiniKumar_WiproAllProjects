package Assignment_Day4;
class After_12{
	void display1() {
		System.out.println("After 12th");
	}
	
}
class Engineering extends After_12{
	void display2() {
		System.out.println("Engineering");
	}
}
class IT extends Engineering{
	void display3() {
		System.out.println("IT");
	}
}
class Mechanical extends Engineering{
	void display4() {
		System.out.println("Mechanical");
	}
}
class ComputerScience extends Engineering{
	void display5() {
		System.out.println("ComputerScience");
	}
}

class Medical extends After_12{
	void display6() {
		System.out.println("Medical");
	}
}
class MBBS extends Medical{
	void display7() {
		System.out.println("MBBS");
	}
	
}
class BDS extends Medical{
	void display8() {
		System.out.println("BDS");
	}
	
}
class other_course extends After_12{
	void display9() {
		System.out.println("Other Courses");
	}
}
class BBA extends other_course{
	void display10() {
		System.out.println("BBA");
	}
}
class BCA extends other_course{
	void display11() {
		System.out.println("BCA");
	}
}
public class Problem_4 {

	public static void main(String[] args) {
		System.out.println("*****IT Department*****");
		IT it=new IT();
		it.display1();
		it.display2();
		it.display3();
		System.out.println("*****Mechanical Department*****");
		Mechanical m=new Mechanical();
		m.display1();
		m.display2();
		m.display4();
		System.out.println("*****CS Department*****");
		ComputerScience cs=new ComputerScience();
		cs.display1();
		cs.display2();
		cs.display5();
		System.out.println("*****MBBS*****");
		MBBS mb=new MBBS();
		mb.display1();
		mb.display6();
		mb.display7();
		System.out.println("*****BDS*****");
		BDS b=new BDS();
		b.display1();
		b.display6();
		b.display8();
		System.out.println("*****BBA*****");
		BBA bba=new BBA();
		bba.display1();
		bba.display9();
		bba.display10();
		System.out.println("*****BCA*****");
		BCA bca=new BCA();
		bca.display1();
		bca.display9();
		bca.display11();

	}

}
