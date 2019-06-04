/**
 * 
 */
package practice.java.thread;

/**
 * @author aposo
 *
 */
public class ThreadExample {

	static class Test {
		public synchronized void suspend() {
			try {
				wait(10000);;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

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

	public static void printThreadStates() throws InterruptedException {
		var test = new Test();
		var thread0 = new Thread(() -> test.suspend(), "Thread0");
		thread0.start();
		var thread1 = new Thread(() -> test.suspend(), "Thread1");
		System.out.println(thread1.getState());
		thread1.start();
		System.out.println(thread1.getState());
		Thread.sleep(2000);
		System.out.println(thread1.getState());
		Thread.sleep(8000);
		System.out.println(thread1.getState());
		Thread.sleep(10000);
		System.out.println(thread1.getState());
		Thread.sleep(1000);
		System.out.println(thread1.getState());

	}

	public static void main(String[] args) throws InterruptedException {
		printThreadStates();
		System.exit(0);

		Thread threadOne = new Thread(new ThreadOne(), "ThreadOne");
		ThreadTwo threadTwo = new ThreadTwo();
		Thread threadTree = new Thread();
		threadTree.start();
		threadOne.start();
		threadTwo.start();
		threadOne.join();
		threadTwo.join();
		threadTree.join();
		System.out.println(threadOne.isAlive());

	}

}
