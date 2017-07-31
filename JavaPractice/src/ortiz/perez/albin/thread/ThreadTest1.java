/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class ThreadTest1 {

    private String hello = "hello";

    public void doSomething() {

	try {
	    Thread.sleep(10000);;
	    System.out.println(hello);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    public void doSomethingElse() {
	try {
	    System.out.println(hello);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
