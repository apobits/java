/**
 * 
 */
package practice.java.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static int test() {

		try {
			InputStream is = new FileInputStream("");
			return 1;
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {

			return 0;
		}
	}

	public static void main(String args[]) {
		System.out.println(test());
	}

}
