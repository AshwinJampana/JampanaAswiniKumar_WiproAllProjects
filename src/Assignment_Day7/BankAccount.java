package Assignment_Day7;

class BankAccount {
    private int balance = 1000;
    
    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", new balance: " + balance);
    }
    
    synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", new balance: " + balance);
        }
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        new Thread(() -> account.deposit(500)).start();
        new Thread(() -> account.withdraw(200)).start();
    }
}
