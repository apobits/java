/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t = new Thread(new RunnableIFTest(), "Second thread");
		
		System.out.println(t.hashCode());
		t.start();

		ThreadExtendsTest tet = new ThreadExtendsTest();

		tet.test();

		try {
			System.out.println(t.isAlive());
			System.out.println(tet.isAlive());
			t.join();
			tet.join();
			System.out.println(t.isAlive());
			System.out.println(tet.isAlive());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
