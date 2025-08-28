package Assignment_Day7;
class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        for(int i=1; i<=3; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
