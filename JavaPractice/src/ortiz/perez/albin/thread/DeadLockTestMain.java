/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class DeadLockTestMain {

    public static void main(String args[]) {

	DeadLockTest1 d1 = new DeadLockTest1();
	DeadLockTest2 d2 = new DeadLockTest2();

	new Thread(() -> d1.doSomething(d2), "Thread 1").start();

	new Thread(() -> d2.doSomething(d1), "Thread 2").start();

    }

}
