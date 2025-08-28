package Assignment_Day7;

class DaemonThread {
    public static void main(String[] args) {
        Thread daemon = new Thread(() -> {
            while(true) {
                System.out.println("Current time: " + System.currentTimeMillis());
                try { Thread.sleep(1000); } catch(Exception e) {}
            }
        });
        daemon.setDaemon(true);
        daemon.start();
        
        System.out.println("Main thread exiting...");
    }
}