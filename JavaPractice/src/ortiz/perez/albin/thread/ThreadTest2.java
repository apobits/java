/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class ThreadTest2 implements Runnable {

	ThreadTest1 t;

	public ThreadTest2(ThreadTest1 t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.doSomething();

	}

}
