/**
 * 
 */
package practice.java.thread;

/**
 * @author aposo
 *
 */
public class ThreadExample {

	// Implementing Runnable interface
	static class ThreadOne implements Runnable {

		@Override
		public void run() {
			System.out.println("Thread one implementing Runnable interface executed");
		}

	}

	// Extending Thread class
	static class ThreadTwo extends Thread {

		public ThreadTwo() {
			super("ThreadTwo");
		}

		@Override
		public void run() {
			System.out.println("Thread two extending Thread class executed");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread threadOne = new Thread(new ThreadOne(), "ThreadOne");
		ThreadTwo threadTwo = new ThreadTwo();
		Thread threadTree = new Thread();
		threadTree.start();
		threadOne.start();
		threadTwo.run();
		threadOne.join();
		threadTwo.join();
		System.out.println(threadOne.isAlive());

	}

}
