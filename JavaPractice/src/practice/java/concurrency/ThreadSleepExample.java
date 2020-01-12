package practice.java.concurrency;

public class ThreadSleepExample {

    public static void main(String[] args) {

	try {
	    //sleeping current thread for 1000 milliseconds
	    Thread.sleep(1000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

	try {
	    //sleeping current thread for 2000 milliseconds
	    Thread.sleep(1000, 1000000000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

    }

}
