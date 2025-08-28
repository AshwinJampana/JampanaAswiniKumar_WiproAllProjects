package Exceptions_Practice;

public class Test {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			int[] a=new int[4];
			System.out.println(a[6]);
			System.out.println(3/0);
			String str="Hello";
			System.out.println(str.charAt(6));
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println(4);
		System.out.println(5);
	}

}
