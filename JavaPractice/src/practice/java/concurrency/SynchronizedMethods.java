package practice.java.concurrency;

public class SynchronizedMethods {
    private int counter;

    // only one thread at a time can access increment or decrement as both methods are guarded by the same intrinsic lock (this)
    public synchronized void increment() {
	counter++;
    }

    public synchronized void decrement() {
	counter--;
    }

}
