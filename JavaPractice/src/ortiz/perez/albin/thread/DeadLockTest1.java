/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class DeadLockTest1 {

    synchronized public void doSomething(DeadLockTest2 d2) {
	try {
	    Thread.sleep(1000);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	d2.doSomethingElse();
    }

    synchronized public void doSomethingElse() {

    }

}
