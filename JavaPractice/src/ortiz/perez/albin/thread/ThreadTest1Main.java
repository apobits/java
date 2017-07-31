/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class ThreadTest1Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    ThreadTest1 t = new ThreadTest1();
	    // ThreadTest2 t2 = new ThreadTest2(t);
	    //
	    Thread t1 = new Thread(() -> {synchronized (t) {
		t.doSomething();
	    }});
	    t1.start();

	    Thread t2 = new Thread(() -> {synchronized (t) {
		t.doSomethingElse();
	    }});
	    t2.start();

	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

}
