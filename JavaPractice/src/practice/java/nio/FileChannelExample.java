/**
 * 
 */
package practice.java.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author apobits@gmail.com
 *
 */
public class FileChannelExample {

	private static Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");

	public static void fromFiles() {
		try (FileChannel fc = (FileChannel) Files.newByteChannel(path, StandardOpenOption.WRITE)) {
			fc.truncate(0);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void fileChannel() {
		try (FileChannel fc = FileChannel.open(path, StandardOpenOption.READ, StandardOpenOption.WRITE)) {
			ByteBuffer bf = ByteBuffer.allocate((int) fc.size());
			ByteBuffer mark = ByteBuffer.wrap("\n::::::::::::Modified::::::::::::\n".getBytes());
			fc.read(bf);
			fc.position(0);
			fc.truncate(0);
			mark.rewind();
			fc.write(mark);
			bf.rewind();
			fc.write(bf);
			mark.rewind();
			fc.write(mark);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		fileChannel();

		System.exit(1);

		fromFiles();

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
