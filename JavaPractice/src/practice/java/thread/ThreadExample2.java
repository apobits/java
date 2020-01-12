/**
 *
 */
package practice.java.thread;

/**
 * @author apobits@gmail.com
 *
 */
public class ThreadExample2 extends Thread {

    boolean flag = true;

    public ThreadExample2(ThreadGroup g, String name) {
	super(g, name);
	this.start();
    }

    public static void main(String args[]) throws InterruptedException {
	ThreadGroup g = new ThreadGroup("G");
	ThreadExample2 e = new ThreadExample2(g, "T1");
	Thread.sleep(1000);
	e.myResume();
    }

    @Override
    public void run() {

	while (flag) {
	    synchronized (this) {
		try {
		    System.out.println(Thread.currentThread().getName());
		    System.out.println("while loop of run method");
		    wait();
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	}
    }

    public synchronized void myResume() {
	System.out.println(Thread.currentThread().getName());
	System.out.println("resume method");
	flag = false;
	notify();
    }
}
