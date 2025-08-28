package Strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Venkatsai";
//		System.out.println("String "+st);
//		System.out.println("charAt 2 "+st.charAt(2));//char at that index
//		System.out.println("codepointAt 1    "+st.codePointAt(1));//asci value for e
//		System.out.println("codePontBefore 1 "+st.codePointBefore(1));//asci value for H
//		System.out.println("CodePointCount "+st.codePointCount(0, 3));//last index is not counted
//		System.out.println("Comaprison "+st.equals("venkat"));//checks the string comparison
//		System.out.println("Case insensive comparison "+st.equalsIgnoreCase("hello"));
//		System.out.println("Blank"+st.isBlank());
//		System.out.println("Empty"+st.isEmpty());
//		System.out.println("Last index of o "+st.lastIndexOf("V"));
//		System.out.println("Length of String "+st.length());
//		System.out.println("Conatins "+st.contains("en"));
		
		//immutable to mutable
		StringBuffer sb=new StringBuffer(st);
		sb.append("kumar");
		System.out.println(sb);
		
		System.out.println("SubString "+sb.substring(0, 3));
		System.out.println("String after deleting "+sb.delete(2, 3));
		System.out.println("Reverse of a String "+sb.reverse());
		
		
		//mutable to immutable
//		StringBuffer sbb=new StringBuffer("Pune");
//		String sb1=new String(sbb);
//		sbb.append("123456789012345678901234567890");
//		System.out.println(sb1);
//		System.out.println(sbb.capacity());

	}

}
