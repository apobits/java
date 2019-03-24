/**
 * 
 */
package practice.java.nio;

import java.nio.CharBuffer;

/**
 * @author apobits@gmail.com
 *
 */
public class BufferExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CharBuffer cb = CharBuffer.wrap("Hello world, ...");
		System.out.println("Capacity " + cb.capacity());
		System.out.println("Limit " + cb.limit());
		System.out.println("Position " + cb.position());
		System.out.println("Is backed up by an array ? " + cb.hasArray());
		System.out.println("Char at position 1 " + cb.charAt(1));
		System.out.println("Comparing two Char buffers " + cb.compareTo(cb));
		System.out.println("Reads a char from the buffer  " + cb.get());

	}

}
