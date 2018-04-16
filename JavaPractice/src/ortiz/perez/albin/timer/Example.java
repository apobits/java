/**
 * 
 */
package ortiz.perez.albin.timer;

import java.util.Calendar;
import java.util.Timer;

/**
 * @author Administrador
 *
 */
public class Example {

    public static void main(String[] args) throws InterruptedException {
	Calendar c = Calendar.getInstance();
	c.add(Calendar.MINUTE, 1);

	Timer t = new Timer(true);// Timer class controls the execution
	TimerTaskImp tt = new TimerTaskImp();// TimerTask class implements logic
					     // to be executed

	t.schedule(tt, c.getTime());
	
	Thread.sleep(65000);
    }

}
