package Assignment_Day7;

class SyncCounter {
    static int count = 0;
    
    synchronized static void increment() { count++; }
    
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) increment();
        });
        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) increment();
        });
        
        t1.start(); t2.start();
        t1.join(); t2.join();
        
        System.out.println(count); // Always 2000
    }
}
