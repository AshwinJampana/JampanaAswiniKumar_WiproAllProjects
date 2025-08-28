package Interfaces;


interface Doctor
{
	void operation();
	void OPD();
}
interface Nurse
{
	void dailycheck();
	void documentation();
}
interface Accountant
{
	void payment();
	void query();
}

class Patient implements Doctor,Nurse,Accountant
{
	public void operation() {
		System.out.println("Operation");
	}
	public void OPD() {
		System.out.println("OPD");
	}
	public void dailycheck() {
		System.out.println("dailycheck");
	}
	public void documentation() {
		System.out.println("documentation");
	}
	public void payment() {
		System.out.println("payment");
	}
	public void query() {
		System.out.println("query");
	}



	
}
public class Hospitaldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p=new Patient();
		p.operation();
		p.OPD();
		p.dailycheck();
		p.documentation();
		p.payment();
		p.query();

	}

}
