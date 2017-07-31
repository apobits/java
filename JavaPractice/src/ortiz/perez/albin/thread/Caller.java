/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class Caller implements Runnable {

	private CallMe callMe;

	private String msg;

	private Thread thread;

	public Caller(CallMe callMe, String msg) {
		this.callMe = callMe;
		this.msg = msg;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		callMe.call(msg);
	}

	public Thread getThread() {
		return thread;
	}

}
