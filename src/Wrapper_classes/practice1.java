package Wrapper_classes;

public class practice1 {

	public static void main(String[] args) {
		char ch='A';
		String s="a1b2c3"; 
		System.out.println("Character is"+ch);
		System.out.println(Character.isDigit(ch)?"Digit":"Not a Digit");
		int cd=0,cc=0;
	for(char ch1:s.toCharArray()) {
		if(Character.isDigit(ch1)) 
		{
			cd++;
			System.out.println(ch1+" is Digit");
		}
		else {
			cc++;
			System.out.println(ch1+" is  Character");
		}
		
	}
	System.out.println("Char count is "+cc);
	System.out.println("Digit count is "+cd);
	}

}
