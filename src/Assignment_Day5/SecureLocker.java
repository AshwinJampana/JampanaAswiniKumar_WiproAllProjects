package Assignment_Day5;

class Locker {
    private int lockerid;
    private boolean isLocked;
    private String passcode;
    
    Locker(int lockerid, String initialPasscode) {
        this.lockerid = lockerid;
        this.passcode = initialPasscode;
        this.isLocked = true; 
    }
    
    public void lock() {
        this.isLocked = true;
    }
    
    public boolean unlock(String code) {
        if (new SecurityManager().verifycode(code)) {
            this.isLocked = false;
            return true;
        }
        return false;
    }
    
    public boolean isLocked() {
        return this.isLocked;
    }
    
    private class SecurityManager {
        private boolean verifycode(String st) {
            return passcode.equals(st);
        }
    }
}

public class SecureLocker {
    public static void main(String[] args) {
        Locker l = new Locker(101, "secret123");
        System.out.println("Is locked =" + l.isLocked()); 
        
        boolean unlocked = l.unlock("wrong");
        System.out.println("Unlock success? " + unlocked); 
        System.out.println("Is locked= " + l.isLocked()); 
        
        unlocked = l.unlock("secret123");
        System.out.println("Unlock success? " + unlocked); 
        System.out.println("Is locked=" + l.isLocked()); 
        
        l.lock();
        System.out.println("Is locked=" + l.isLocked()); 
    }
}