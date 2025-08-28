package OopsConcepts;
class SoftwareTesting
{
	void Syllabus() {
		System.out.println("Software testing course details");
		System.out.println("Syllabus =Manual Testing,Core Java,selenium Web Driver,Jira (Project Management)");
		System.out.println("Fee is"+50000);
	}
		
	
}

class Manual extends SoftwareTesting{
	void manual_testing() {
		super.Syllabus();
		System.out.println("If it is manual  testing only \nthen it includes Manual testing Concepts ,jira,core java,postman,mysql and the fees is 30000");
	}
}
class Automation extends SoftwareTesting{
	void automation_testing() {
		super.Syllabus();
		System.out.println("If it is Automation testing only \nthen it includes core java,selenium webdrivers");
	}
}
public class Oops_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manual mn=new Manual();
		mn.manual_testing();

	}

}
