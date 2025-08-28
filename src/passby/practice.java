package passby;

public class practice {
	String name="ClassTest";
	void show(String name1) {
		name=name1;
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		practice p=new practice();
		System.out.println(p.name);
		p.show("MethodTest");
	}

}
