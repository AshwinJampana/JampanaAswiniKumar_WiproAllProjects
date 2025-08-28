package Multithreading;

public class Practice3 implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		System.out.println("Current thread name="+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Practice3 t1=new Practice3();
		Thread t=new Thread(t1);
		t.start();
		
	}

}
