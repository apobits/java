/**
 * 
 */
package practice.java.varieties;

import com.sun.javafx.runtime.SystemProperties;

/**
 * @author apobits@gmail.com
 *
 */
public class SystemExample {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		long begin = System.currentTimeMillis();
		System.out.print(begin);
		Thread.sleep(1000);
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println(end);

		System.out.println("Time spent in milliseconds is " + (end - begin));

		begin = System.nanoTime();
		System.out.print(begin);
		Thread.sleep(1000);
		System.out.println();
		end = System.nanoTime();
		System.out.println(end);

		System.out.println("Time spent in nanoseconds is " + (end - begin));

		// temporal directory property
		System.out.println(System.getProperty("java.io.tmpdir"));
		
		// user directory property
		System.out.println(System.getProperty("user.dir"));
		
		// user name property
		System.out.println(System.getProperty("user.name"));
		
		// path separator property
		System.out.println(System.getProperty("path.separator"));

	}

}
