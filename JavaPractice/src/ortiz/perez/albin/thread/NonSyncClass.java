/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class NonSyncClass {

    public void doSomething() throws InterruptedException {
	Thread.sleep(10000);
	System.out.println("hi");
    }

}
