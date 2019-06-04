/**
 * 
 */
package practice.java.nio;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) throws InterruptedException {

		var thread = new Thread(() -> System.out.println("Thread executed"), "MyThread");

		thread.start();

		thread.join();

		System.out.println(thread.getState());
	}
}
