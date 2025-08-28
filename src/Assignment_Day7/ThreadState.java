package Assignment_Day7;
class ThreadState{
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try { Thread.sleep(2000); } catch(Exception e) {}
        });
        
        System.out.println("Before start: " + t.isAlive());
        t.start();
        System.out.println("After start: " + t.isAlive());
        t.join();
        System.out.println("After join: " + t.isAlive());
    }
}