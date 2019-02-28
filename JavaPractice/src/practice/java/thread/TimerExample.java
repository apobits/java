/**
 * 
 */
package practice.java.thread;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author apobits@gmail.com
 *
 */
public class TimerExample {

	static class TimerTaskImp extends TimerTask {

		@Override
		public void run() {

			System.out.println(LocalDateTime.now());

		}

	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// Creates a timer that schedules the tasks to be executed
		Timer timer = new Timer("My timer");

		// Creates a default timer
		Timer timer1 = new Timer();

		// Creates a timer with the specified name as a daemon
		Timer timer2 = new Timer("My other timer", true);

		// Schedules a task with a specified delay
		timer.schedule(new TimerTaskImp(), 0);

		// Schedules a task with a specified delay and repeat period
		timer.schedule(new TimerTaskImp(), 0, 10000);

		// Schedules a task at specified date
		timer.schedule(new TimerTaskImp(), new Date());

		// Schedules a task at specified date and repeat period
		timer.schedule(new TimerTaskImp(), new Date(), 9000);

		// Schedules a task after the specified time and repeat period
		timer.scheduleAtFixedRate(new TimerTaskImp(), 8000, 11000);

		timer.scheduleAtFixedRate(new TimerTaskImp(), new Date(), 12000);

		Thread.sleep(10000);

		// cancels the timer instance and consequently all the timers schedule
		timer.cancel();

	}

}
