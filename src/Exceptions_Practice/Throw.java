package Exceptions_Practice;

public class Throw {
	void add(int a,int b) {
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	void div(int a,int b) throws ArithmeticException
	{
		int div=a/b;
		System.out.println("Division  is "+div);
	}
	public static void main(String[] args) {
		Throw t=new Throw();
		t.add(10, 20);
		t.div(100, 20);
	}

}
