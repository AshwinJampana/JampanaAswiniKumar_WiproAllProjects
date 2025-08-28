package Exceptions_Practice;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a=new int[4];
			System.out.println(a[6]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally");
		}
	}

}
