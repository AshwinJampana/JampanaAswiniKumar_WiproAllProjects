package Assignment_Day4;

class Hospital{
	String doctorname="Venkat";
	void Hospital_name() {
		System.out.println("Appolo Hospitals");
	}
}
class Patient extends Hospital{
	void doctorname() {
		System.out.println("Doctor name ="+super.doctorname);
	}
	@Override
	void Hospital_name() {
		super.Hospital_name();
		
	}
}
public class Problem3 {

	public static void main(String[] args) {
		
		Patient p=new Patient();
		p.doctorname();
		p.Hospital_name();
	}

}
