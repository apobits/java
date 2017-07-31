/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class SynchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CallMe c = new CallMe();
			Caller caller1 = new Caller(c, "Hello");
			Caller caller2 = new Caller(c, "Hello");
			Caller caller3 = new Caller(c, "Hello");

			caller1.getThread().join();
			caller2.getThread().join();
			caller3.getThread().join();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
