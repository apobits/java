/**
 * 
 */
package practice.java.thread;

/**
 * @author aposo
 *
 */
public class RaceConditionStarter {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		RaceConditionCallMe callMe = new RaceConditionCallMe();
		RaceConditionCallee callee1 = new RaceConditionCallee(callMe, "Callee1");
		RaceConditionCallee callee2 = new RaceConditionCallee(callMe, "Callee2");
		RaceConditionCallee callee3 = new RaceConditionCallee(callMe, "Callee3");

		callee1.thread.join();
		callee2.thread.join();
		callee3.thread.join();

	}

}
