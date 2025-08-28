package Assignment_Day7;

class TwoThreads {
    public static void main(String[] args) {
        new Thread(() -> {
            for(int i=0; i<5; i++) System.out.println("Hello");
        }).start();
        
        new Thread(() -> {
            for(int i=0; i<5; i++) System.out.println("World");
        }).start();
    }
}