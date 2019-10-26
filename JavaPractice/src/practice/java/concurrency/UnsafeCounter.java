/**
 * 
 */
package practice.java.concurrency;

/**
 * @author aposo
 *
 */
public class UnsafeCounter {
	private static int count;

	int get() {
		return ++count;
	}

	public static void main(String args[]) throws InterruptedException {
		
		//race condition shows threads printing equals values
		UnsafeCounter d = new UnsafeCounter();
		Runnable r = () -> {
			for (int i = 0; i < 2; i++) {
				System.out.println(Thread.currentThread().getName() + " " + d.get());
			}
		};
		Runnable rr = () -> {
			for (int i = 0; i < 2; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " " + d.get());
			}
		};
		Thread t1 = new Thread(r, "ThreadOne");
		Thread t2 = new Thread(rr, "ThreadTwo");
		Thread t3 = new Thread(r, "ThreadThree");
		Thread t4 = new Thread(rr, "ThreadFour");
		Thread t5 = new Thread(r, "ThreadFive");
		Thread t6 = new Thread(rr, "ThreadSix");
		Thread t7 = new Thread(r, "ThreadSeven");
		Thread t8 = new Thread(rr, "ThreadEight");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();

		Thread.sleep(10000);
	}

}
