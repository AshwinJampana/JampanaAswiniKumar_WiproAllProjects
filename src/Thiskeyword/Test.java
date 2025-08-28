package Thiskeyword;

public class Test {
	
	void setname(String name) {
		System.out.println("Name of person = "+name);
	}
	void getname() {
		this.setname("venkat");
		System.out.println("Welocome to java");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.getname();
	}

}
