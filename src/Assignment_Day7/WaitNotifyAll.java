package Assignment_Day7;

class WaitNotifyAll {
    boolean condition = false;
    
    synchronized void waitForCondition() throws InterruptedException {
        System.out.println("Waiting for condition...");
        while(!condition) wait();
        System.out.println("Condition met!");
    }
    
    synchronized void setCondition() {
        condition = true;
        notifyAll();
    }
    
    public static void main(String[] args) {
        WaitNotifyAll wna = new WaitNotifyAll();
        for(int i=0; i<3; i++) {
            new Thread(() -> { try { wna.waitForCondition(); } catch(Exception e) {} }).start();
        }
        new Thread(() -> wna.setCondition()).start();
    }
}
