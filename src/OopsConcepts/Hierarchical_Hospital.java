package OopsConcepts;
class Hospital{
	void name(String name) {
		System.out.println("Hospital Name:"+name);
	}
}

class Doctor extends Hospital{
	void role_type(String role) {
		System.out.println("job role:"+role);
	}
	
}
class Gynac extends Doctor{
	void specialization(String sp) {
		System.out.println("Specialization :"+sp);
	}
}

class Cesarean extends Gynac{
	void operation_type(String op) {
		System.out.println("Opeartion Type:"+op);
	}
}
class OPD extends Gynac{
	void operation_type(String op) {
		System.out.println("Opeartion Type:"+op);
	}
}

class Endo extends Doctor{
	void specialization(String sp) {
		System.out.println("Specialization :"+sp);
	}
}

class Cardiac extends Doctor{
	void specialization(String sp) {
		System.out.println("Specialization :"+sp);
	}
}

class coperation extends Cardiac{
	void operation_type(String op) {
		System.out.println("Opeartion Type:"+op);
	}
	
}
class COPD extends Cardiac{
	void operation_type(String op) {
		System.out.println("Opeartion Type:"+op);
	}
	
}

class Nurse extends Hospital{
	void role_type(String role) {
		System.out.println("job role:"+role);
	}
}

class Accountant extends Hospital{
	void role_type(String role) {
		System.out.println("job role:"+role);
	}
}
class payments extends Accountant{
	void payment_method(String pm) {
		System.out.println("Payment Methosd"+pm);
	}
}
class Documentation extends Accountant{
	void documentation(String doc) {
		System.out.println("Documentation"+doc);
	}
}
public class Hierarchical_Hospital {
	public static void main(String args[]) {
		System.out.println("******Cesarean******");
		Cesarean cs=new Cesarean();
		cs.name("Govenment Hospital");
		cs.role_type("Doctor");
		cs.specialization("Gynac");
		cs.operation_type("Surgery");
		System.out.println("******OPD******");
		OPD opd=new OPD();
		opd.name("Medicover");
		opd.role_type("Doctor");
		opd.specialization("Gynac");
		opd.operation_type("OPD");
		System.out.println("******Endo******");
		opd.name("Appolo");
		opd.role_type("Doctor");
		opd.specialization("Endo");
		System.out.println("******Coperation******");
		coperation copr=new coperation();
		copr.name("Medicover2");
		copr.role_type("Doctor");
		copr.specialization("Cardiac");
		copr.operation_type("Cardiac Operation");
		System.out.println("******COPD******");
		COPD copd=new COPD();
		copd.name("Medicover1");
		copd.role_type("Doctor");
		copd.specialization("Cardiac");
		copd.operation_type("OPD");
		System.out.println("******Nurse******");
		Nurse nr=new Nurse();
		nr.name("Medicover5");
		nr.role_type("Nurse");
		System.out.println("******Payments******");
		payments p=new payments();
		p.name("Yashoda");
		p.role_type("Accountation");
		p.payment_method("CASH");
		System.out.println("******Documentation******");
		Documentation d=new Documentation();
		d.name("AIG");
		d.role_type("Accountant");
		d.documentation("Done");
		
		
		
		
	}
}
