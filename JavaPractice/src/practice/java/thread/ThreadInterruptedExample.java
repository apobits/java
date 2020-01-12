package practice.java.thread;

public class ThreadInterruptedExample implements Runnable {

    @Override
    public void run() {
	while (true) {
	    //when using Thread.interrupted() it clears the interrupt status
	    //exiting a method by throwing an interrupted exception also clears the interrupt status
	    if (Thread.interrupted()) {
		System.out.println("Thread " + Thread.currentThread().getName() + " interrupted, exiting now");
		return;
	    } else {
		System.out.println(
				"Thread " + Thread.currentThread().getName() + " has not been interrupted, keep going");
	    }
	}
    }

    public static void main(String[] args) throws InterruptedException {
	var threadInterruptedExample = new ThreadInterruptedExample();
	var thread = new Thread(threadInterruptedExample, "ThreadOne");
	thread.start();
	Thread.sleep(1);
	thread.interrupt();
	Thread.sleep(10);
	System.out.println("Thread " + thread.getName() + " interrupt status: " + thread.isInterrupted());
    }
}
