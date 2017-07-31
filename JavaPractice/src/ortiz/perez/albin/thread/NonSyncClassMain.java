/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class NonSyncClassMain {

    /**
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
	NonSyncClass obj = new NonSyncClass();
	Thread t1 = new Thread(() -> {
	    try {
		synchronized (obj) {// making a synchronized call
		    obj.doSomething();
		}
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}, "t1");

	Thread t2 = new Thread(() -> {
	    try {
		obj.doSomething();// not making a synchronized call but the object is already in a synchronized state by the call from t1
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}, "t2");

	t1.start();
	t2.start();
	t1.join();
	t2.join();
    }

}
