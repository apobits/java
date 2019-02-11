/**
 * 
 */
package practice.java.io;

import java.io.ByteArrayInputStream;

/**
 * @author apobits@gmail.com
 *
 */
public class ByteArrayInputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 72, 69, 76, 76, 79 });
		int i = -1;
		System.out.println("bytes available in the stream: " + bais.available());
		// set the current mark position in the stream
		bais.mark(0);
		// skips n bytes from this input stream
		bais.skip(1);
		// resets buffer to the marked position
		bais.reset();

		while ((i = bais.read()) != -1) {
			System.out.print((char) i);
		}

	}

}
