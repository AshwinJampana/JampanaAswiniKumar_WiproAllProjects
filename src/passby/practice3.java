package passby;

class user_pass{
	String username;
	String password;
}
public class practice3 {
	static void user_credentials(user_pass p)
	{
		p.username="admin123";
		p.password="pass@123";
	}
	public static void main(String[] args) {
		user_pass p=new user_pass();
		p.username="user123";
		p.password="user@123";
		user_credentials(p);
		System.out.println("Username ="+p.username);
		System.out.println("Password ="+p.password);

	}

}
