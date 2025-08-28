package Encapsulation;

//import java.util.Scanner;

public class User {
	String username;
	private String password;
	public String setusername(String us) {
		this.username=us;
		return username;
	}
	public String setpassword(String ps) {
		this.password=ps;
		return password;
	}
	public void getDetails() {
		System.out.println("User name is "+username);
		System.out.println("password is secure");
	}
	
	public static void main(String[] args) {
		User u=new User();
		//Scanner sc=new Scanner(System.in);
		//System.out.print("Enter Username ");
		//String usr=sc.next();
		//System.out.print("Enter Password ");
		//String pwd=sc.next();
		u.setusername("usr");
		u.setpassword("pwd");
		u.getDetails();
	}

}
