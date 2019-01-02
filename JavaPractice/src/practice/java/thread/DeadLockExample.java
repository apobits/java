/**
 * 
 */
package practice.java.thread;

/**
 * @author aposo
 *
 */
public class DeadLockExample {

	static class A {
		synchronized public void printSomething(B b) {
			System.out.println(Thread.currentThread().getName() + " in A.printSomething");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			b.printSomethingElse();
		}

		synchronized public void printSomethingElse() {
			System.out.println("In A.printSomethingElse");
		}
	}

	static class B {
		synchronized public void printSomething(A a) {
			System.out.println(Thread.currentThread().getName() + " in B.printSomething");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a.printSomethingElse();
		}

		synchronized public void printSomethingElse() {
			System.out.println("In B.printSomethingElse");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new A();
		B b = new B();

		Thread t1 = new Thread(() -> a.printSomething(b), "Thread1");
		t1.start();
		new Thread(() -> b.printSomething(a), "Thread2").start();

		System.out.println(t1.getState());

	}

}
