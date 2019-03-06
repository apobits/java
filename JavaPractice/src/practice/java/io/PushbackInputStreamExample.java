/**
 * 
 */
package practice.java.io;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 * @author Administrador
 *
 */
public class PushbackInputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// PushbackInpuptStream has a buffer for bytes passed with the unread method,
		// the inputstream passed when instantiate the object is used by the read method
		// what this actually means is that read will read from the buffer and the
		// inputstream
		try (PushbackInputStream pbis = new PushbackInputStream(new ByteArrayInputStream("Hello".getBytes()), 20)) {
			pbis.unread(45);
			int i = -1;
			while ((i = pbis.read()) != -1) {
				System.out.print((char) i);
			}

			// PushbackInputStream does not support mark and reset
			System.out.println("\nMark supported: " + pbis.markSupported());

			pbis.unread("Hey".getBytes());
			while ((i = pbis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
