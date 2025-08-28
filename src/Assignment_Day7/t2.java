package Assignment_Day7;
class t2 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        new Thread(new t2()).start();
    }
}
