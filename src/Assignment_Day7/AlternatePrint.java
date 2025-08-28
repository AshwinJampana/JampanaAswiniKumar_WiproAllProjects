package Assignment_Day7;

class AlternatePrint {
    boolean isLetterTurn = true;
    
    synchronized void printLetter() throws InterruptedException {
        for(char c='A'; c<='Z'; c++) {
            while(!isLetterTurn) wait();
            System.out.print(c + " ");
            isLetterTurn = false;
            notify();
        }
    }
    
    synchronized void printNumber() throws InterruptedException {
        for(int i=1; i<=26; i++) {
            while(isLetterTurn) wait();
            System.out.print(i + " ");
            isLetterTurn = true;
            notify();
        }
    }
    
    public static void main(String[] args) {
        AlternatePrint ap = new AlternatePrint();
        new Thread(() -> { try { ap.printLetter(); } catch(Exception e) {} }).start();
        new Thread(() -> { try { ap.printNumber(); } catch(Exception e) {} }).start();
    }
}
