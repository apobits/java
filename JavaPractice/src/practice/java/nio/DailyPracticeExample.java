/**
 * 
 */
package practice.java.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author apobits@gmail.com
 * 
 *
 */

class DailyPracticeExample {

	public static void main(String args[]) {
		try (FileInputStream fis = new FileInputStream(new File(""))) {

		} catch (RuntimeException | IOException e) {

		}

	}
}
