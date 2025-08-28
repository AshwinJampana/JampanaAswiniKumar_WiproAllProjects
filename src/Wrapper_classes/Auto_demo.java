package Wrapper_classes;

public class Auto_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Autoboxing
		int num=10;
		System.out.println("Primitive type of data ="+num);
		Integer num1=num;
		System.out.println("Wrapper class data ="+num1);
		
		//Unboxing
		Integer i=20;
		System.out.println("data for object  ="+i);
		int a=i;
		System.out.println("Primitive type of data ="+a);

		String str="12345";
		int ab=Integer.parseInt(str);
		System.out.println(ab);
		
		String n=Integer.toString(num);
		System.out.println(n);
	}

}
