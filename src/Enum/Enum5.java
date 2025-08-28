package Enum;

interface demo{
	void method1();
	void method2();
}
enum Days implements demo{
	Monday{
		public void method1() {
			System.out.println("Monday method1");
		}
		public void method2() {
			System.out.println("Monday method2");
		}
	},Tuesday{
		public void method1() {
			System.out.println("Tuesday method1");
		}
		public void method2() {
			System.out.println("Tuesday method2");
		}
	};
	
	
}
public class Enum5 {

	public static void main(String[] args) {
		Days.Monday.method1();
		Days.Monday.method2();
		Days.Tuesday.method1();
		Days.Tuesday.method2();
	}

}
