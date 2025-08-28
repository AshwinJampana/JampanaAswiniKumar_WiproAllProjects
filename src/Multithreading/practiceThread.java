package Multithreading;

class Thread1 extends Thread
{
	boolean flag=true;
	public void run() 
	{
		while(flag)
		{
			System.out.println("Thread is Running");
			try 
			{
                Thread.sleep(500); 
            } 
			catch (InterruptedException e) 
			{
                System.out.println(e);
                break;
            }
        }
        System.out.println("Thread stopped");
	}

public void stoprunning() {
	flag=false;
}
}
public class practiceThread {

    public static void main(String[] args) throws InterruptedException {
        
    	Thread1 t1=new Thread1();
    	t1.start();
    	Thread.sleep(2000);
    	t1.stoprunning();
    	
     
        
    }
}