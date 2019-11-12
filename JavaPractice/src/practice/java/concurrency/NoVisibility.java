package practice.java.concurrency;

public class NoVisibility {

    private static boolean print;
    private static int number;

    static class Consumer implements Runnable {

        @Override
        public void run() {
            while (!print) {
                System.out.println("in run method");
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String args[]) throws InterruptedException {
        var t = new Thread(new Consumer());
        t.start();
        Thread.sleep(1000);
        number = 5;
        print = true;

    }

}
