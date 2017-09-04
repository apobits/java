/**
 * 
 */
package ortiz.perez.albin.system;

import java.util.Date;

/**
 * @author Administrador
 *
 */
public class SystemExample {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start " + new Date(System.currentTimeMillis()));
//		for (int i = 0; i < 10; i++) {
//			Thread.sleep(1000);
//		}

		System.out.println("End   " + new Date(System.currentTimeMillis()));
		System.out.println(System.getProperty("java.class.version"));
		System.out.println(System.getProperty("java.version"));
		
	}

}
