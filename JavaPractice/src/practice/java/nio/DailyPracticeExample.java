/**
 * 
 */
package practice.java.nio;

import java.io.PrintWriter;
import java.nio.charset.Charset;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		try (PrintWriter printWriter = new PrintWriter(System.out, false, Charset.forName("UTF-8"))) {
			printWriter.write('a');
			printWriter.append("Lolol");
			printWriter.printf("testing %d", 1);
		}
	}
}
