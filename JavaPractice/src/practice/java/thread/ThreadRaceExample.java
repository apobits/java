/**
 * 
 */
package practice.java.thread;

/**
 * @author aposo
 *
 */
public class ThreadRaceExample {

	static class Business {
		synchronized public void printObject(Object object) {
			System.out.println(object);
		}
	}

	static class BusinessConsumer implements Runnable {
		private Business business;

		public BusinessConsumer(Business business) {
			this.business = business;
		}

		@Override
		public void run() {
			while (true) {
				business.printObject(this);
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Business business = new Business();

		Thread consumer1 = new Thread(new BusinessConsumer(business), "Consumer1");
		Thread consumer2 = new Thread(new BusinessConsumer(business), "Consumer2");
		Thread consumer3 = new Thread(new BusinessConsumer(business), "Consumer3");

		consumer1.start();
		consumer2.start();
		consumer3.start();

	}

}
