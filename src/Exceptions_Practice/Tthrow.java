package Exceptions_Practice;

public class Tthrow {

	public static void main(String[] args) {
		String name=null;
		if(name==null)
		{
			throw new NullPointerException("Name is not null");
		}
		System.out.println(name.length());
	}

}
