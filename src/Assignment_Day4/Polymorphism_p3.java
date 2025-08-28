package Assignment_Day4;
class Bank{
	void getInterestrate() {
		System.out.println("Interest Rates");
	}
}
class SBI extends Bank{
	void getInterestrate() {
		System.out.println("Interest Rate in SBI is 6.7%");
	}
}
class ICICI extends Bank{
	void getInterestrate() {
		System.out.println("Interest Rate in ICICI is 7.0%");
	}
}
class HDFC extends Bank{
	void getInterestrate() {
		System.out.println("Interest Rate in SBI is 7.5%");
	}
}
public class Polymorphism_p3 {

	public static void main(String[] args) {
		
			SBI s=new SBI();
			s.getInterestrate();
			
			ICICI i=new ICICI();
			i.getInterestrate();
			
			HDFC h=new HDFC();
			h.getInterestrate();
	}

}
