/**
 * 
 */
package practice.java.thread;

/**
 * @author apobits@gmail.com
 *
 */
public class ThreadExample1 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new ThreadGroup("1"), () -> {
			System.out.println("ThreadOneExecuted");
			System.out
					.println("active count of thread in the group " + Thread.currentThread().getThreadGroup().getName()
							+ " are " + Thread.currentThread().getThreadGroup().activeCount());
			Thread[] threads = new Thread[10];
			Thread.currentThread().getThreadGroup().enumerate(threads, false);
			Thread.currentThread().checkAccess();
			for (Thread x : threads) {
				System.out.print(x + " ");
			}
			System.out.println();
		}, "ThreadOne");
		System.out.println("Thread name = " + t.getName());
		t.start();
		System.out.println("max priority " + Thread.MAX_PRIORITY);
		System.out.println("min priority " + Thread.MIN_PRIORITY);
		System.out.println("normal priority " + Thread.NORM_PRIORITY);
		System.out.println("active count of thread in the group " + Thread.currentThread().getThreadGroup().getName()
				+ " are " + Thread.currentThread().getThreadGroup().activeCount());
		Thread[] threads = new Thread[10];
		Thread.currentThread().getThreadGroup().enumerate(threads, false);
		for (Thread x : threads) {
			System.out.print(x + " ");
		}

	}

}
