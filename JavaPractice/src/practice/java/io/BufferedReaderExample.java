/**
 * 
 */
package practice.java.io;

import java.io.BufferedReader;
import java.io.CharArrayReader;

/**
 * @author apobits@gmail.com
 *
 */
public class BufferedReaderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String hello = "Hello there";
		try (BufferedReader br = new BufferedReader(new CharArrayReader(hello.toCharArray()))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
