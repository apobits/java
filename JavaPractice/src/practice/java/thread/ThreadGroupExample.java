/**
 * 
 */
package practice.java.thread;

/**
 * @author apobits@gmail.com
 *
 */
public class ThreadGroupExample {

	static class ThreadOne extends Thread {

		public ThreadOne(ThreadGroup g, Runnable r, String name) {
			super(g, r, name);
		}

	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		ThreadGroup tGroup = new ThreadGroup("TG1");

		Runnable r = () -> {
			try {
				Thread.sleep(10000);
				System.out.println(Thread.currentThread().getName() + " executed");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(tGroup, r, "T1");
		Thread t2 = new Thread(tGroup, r, "T2");
		ThreadOne t3 = new ThreadOne(tGroup, r, "T3");
		// causes the execution of this thread to start
		t1.start();
		// causes the execution of this thread to start
		t2.start();
		// causes the execution of this thread to start
		t3.start();
		// it does not start a new thread, calls the run method of the Thread object
		// within the current thread
		t3.run();

	}

}
