/**
 * 
 */
package practice.java.thread;

/**
 * @author apobits@gmail.com
 *
 */
public class CheckAccessExample {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// allocates a new thread object
		Thread t = new Thread(() -> {
			Thread.currentThread().checkAccess();
			System.out.println(Thread.currentThread().getName());
			System.out.println("Thread executed");
		}, "T1");

		// causes this thread to begin execution
		t.start();

		// check if the current thread has permission to access this thread
		t.checkAccess();

		// waits until this thread to die
		t.join();

		// prints the current thread's name
		System.out.println(Thread.currentThread().getName());

		// displays the stack trace of the current thread
		Thread.dumpStack();

		// prints the thread's id
		System.out.println(Thread.currentThread().getId());

		// A hint to the scheduler that the current thread is willing to yield its
		// current use of processor
		Thread.yield();
	}

}
