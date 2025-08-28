package Multithreading;

public class Multithreading extends Thread {
	void alphabet() throws InterruptedException
	{
		
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+" ");
			
			Thread.sleep(50);
		}
		
	}
	void numbers() throws InterruptedException
	{
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
			Thread.sleep(50);
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		Multithreading m1=new Multithreading();
		System.out.println(Thread.currentThread().getName());
		m1.alphabet();
		
		System.out.println();
		Multithreading m2=new Multithreading();
		m2.numbers();
		
	}

}
