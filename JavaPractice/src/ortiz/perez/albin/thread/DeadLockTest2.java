/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class DeadLockTest2 {

    synchronized public void doSomething(DeadLockTest1 d1) {
	try {
	     Thread.sleep(1000);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	d1.doSomethingElse();
    }
    
    synchronized public void doSomethingElse(){
	
    }

}
