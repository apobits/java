/**
 * 
 */
package practice.java.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author apobits@gmail.com
 *
 */
public class FileChannelExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// gets the file channel of FileInputStream
	try (FileChannel fc = new FileInputStream("C:\\Users\\Administrador\\Desktop\\s.txt").getChannel();) {
	    // creates the byte buffer with the size of the file channel
	    ByteBuffer bf = ByteBuffer.allocate((int) fc.size());
	    // reads the bytes in file channel to the byte buffer passed as a parameter
	    fc.read(bf);
	    // sets the index position to 0 in the byte buffer
	    bf.rewind();
	    while (bf.hasRemaining()) {
		// prints chars representation of every byte in the byte buffer
		System.out.print((char) bf.get());
	    }
	} catch (Exception e) {
	    e.printStackTrace(System.out);
	}

    }

}
