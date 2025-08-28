package Assignment_Day7;

//class Counter {
//    static int count = 0;
//    
//    public static void main(String[] args) {
//        Runnable r = () -> {
//            for(int i=0; i<1000; i++) count++;
//        };
//        
//        new Thread(r).start();
//        new Thread(r).start();
//        
//        try { Thread.sleep(1000); } 
//        catch (InterruptedException e) {}
//        
//        System.out.println(count); 
//    }
//}
class Counter {
    int count = 0;
    final Object lock = new Object();

    void increment() {
        synchronized(lock) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.increment();
        });
        
        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.increment();
        });
        
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Count: " + c.count); // Always 2000
    }
}
