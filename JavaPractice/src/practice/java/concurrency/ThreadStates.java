package practice.java.concurrency;

public class ThreadStates {

    public static void main(String[] args) throws InterruptedException {

	var threadStates = new ThreadStates();

	var threadOne = new Thread(() -> {
	    threadStates.doSomething();
	}, "ThreadOne");

	var threadTwo = new Thread(() -> {
	    threadStates.doSomethingElse();
	}, "ThreadTwo");

	var threadThree = new Thread(() -> {
	    while (true) {
		System.out.printf("%s state is  %s%n", threadTwo.getName(), threadTwo.getState());
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    }
	}, "ThreadThree");

	threadOne.start();

	threadThree.start();

	Thread.sleep(1000);

	threadTwo.start();

	Thread.sleep(1000);
	threadTwo.interrupt();

    }

    public synchronized void doSomething() {
	try {
	    wait();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    public synchronized void doSomethingElse() {
	try {
	    wait(5000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

}
