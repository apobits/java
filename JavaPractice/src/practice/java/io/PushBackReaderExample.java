/**
 * 
 */
package practice.java.io;

import java.io.CharArrayReader;
import java.io.PushbackReader;

/**
 * @author apobits@gmail.com
 *
 */
public class PushBackReaderExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

	try (PushbackReader psr = new PushbackReader(new CharArrayReader("Hello there".toCharArray()))) {
	    int index = -1;
	    while ((index = psr.read()) != -1) {
		System.out.print((char) index);
	    }
	    psr.unread(17);
	    System.out.println();
	    while ((index = psr.read()) != -1) {
		System.out.print((char) index);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}
