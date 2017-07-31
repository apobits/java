/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class ThreadExtendsTest extends Thread {

	public ThreadExtendsTest() {
		super("Third thread");
		this.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void test() {
		System.out.println("test at " + Thread.currentThread().getName());
	}

}
