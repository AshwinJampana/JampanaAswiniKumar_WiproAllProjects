package passby;

public class practice2 {

	public static void changepassword(String password) {
		password="New Password";
	}
	public static void main(String[] args) {
		String password="OldPassword";
		changepassword(password);
		System.out.println("Password method="+password);

	}

}
