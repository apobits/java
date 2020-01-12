package practice.java.concurrency;

public class HappensBeforeRelationshipExample {

    private int counter;

    public static void main(String args[]) throws InterruptedException {

	HappensBeforeRelationshipExample happensBeforeRelationshipExample = new HappensBeforeRelationshipExample();

	Thread thread = new Thread(happensBeforeRelationshipExample::increment);
	//any code in this thread before calling start creates a happens before relationship with the code executed in the other
	// thread(The other thread will have visibility of the code executed before the call to start)
	thread.start();

	thread.join();
	//when join returns creates a happen before relationship with the code executed in the thread that finished
	//the code executed in the thread that finished is visible to the code in the actual thread after the join statement

    }

    //exiting a synchronized method creates a happens before relationship with any other synchronized method of the same class
    public synchronized void increment() {
	counter++;
    }

    //exiting a synchronized method creates a happens before relationship with any other synchronized method of the same class
    public synchronized void decrement() {
	counter--;
    }

}
