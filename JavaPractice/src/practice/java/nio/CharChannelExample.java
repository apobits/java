/**
 * 
 */
package practice.java.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

/**
 * @author apobits@gmail.com
 *
 */
public class CharChannelExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

	CharBuffer cb = CharBuffer.wrap("Hello there".toCharArray());

	try (FileChannel fc = new FileOutputStream("C:\\Users\\Administrador\\Desktop\\s.txt").getChannel()) {
	    while (cb.hasRemaining()) {
		System.out.print(cb.get());
	    }

	    fc.write(ByteBuffer.wrap("Hello there".getBytes()));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
