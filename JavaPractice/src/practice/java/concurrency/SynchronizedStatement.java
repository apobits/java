package practice.java.concurrency;

public class SynchronizedStatement {

    private final Object objectOne = new Object();
    private final Object objectTwo = new Object();
    private int counterOne;
    private int counterTwo;

    //two threads can access one of the methods simultaneously as they are guarded by different intrinsic locks

    public void incrementCounterOne() {
	synchronized (objectOne) {
	    counterOne++;
	}
    }

    public void incrementTwo() {
	synchronized (objectTwo) {
	    counterTwo++;
	}
    }

}
