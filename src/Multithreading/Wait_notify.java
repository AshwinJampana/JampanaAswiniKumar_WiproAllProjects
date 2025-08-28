package Multithreading;

class Simple {
    void waitForSignal() throws InterruptedException {
        synchronized(this) {
            System.out.println("waiting");
            wait();  
            System.out.println("resume");
        }
    }
    
    void giveSignal() {
        synchronized(this) {
            notify(); 
            
        }
    }
}

public class Wait_notify {
    public static void main(String[] args) throws InterruptedException {
        Simple s = new Simple();
        
        Thread t1 = new Thread(() -> {
            try {
                s.waitForSignal();
            } catch (InterruptedException e) {
                System.out.println("Wait interrupted: " + e.getMessage());
            }
        }, "WaitingThread");
        
        Thread t2 = new Thread(() -> {
            try {
                
                Thread.sleep(1000);
                s.giveSignal();
            } catch (InterruptedException e) {
                System.out.println( e);
            }
        }, "SignalingThread");
        
        
        t1.start();
        t2.start();
        
        
        t1.join();
        t2.join();
        
        
    }
}