package Multithreading;
class Shared extends Thread{
	Synchronized void produce(int t)
	{
		if(ready) return;
		num=n;
		System.out.println("Produced: "+num);
		reday=true;
		notify();
	}
	Synchronized  consume() {
		while(!ready) {
			try {wait();}catch(Exception e) {e.printStackTrace();}
		}
	}
}
public class Wait_demo {

	public static void main(String[] args) {
		

	}

}
