package Assignment_Day7;

class StoppableThread extends Thread {
    private boolean stop = false;
    
    public void run() {
        while(!stop) {
            System.out.println("Running...");
        }
    }
    
    public void stopThread() { stop = true; }
    
    public static void main(String[] args) throws InterruptedException {
        StoppableThread t = new StoppableThread();
        t.start();
        Thread.sleep(100);
        t.stopThread();
    }
}