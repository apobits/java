/**
 * 
 */
package practice.java.nio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author apobits@gmail.com
 *
 */
public class BufferExample {

	public static void byteBuffer() {
		try (SeekableByteChannel bc = Files
				.newByteChannel(Paths.get("C:\\\\Users\\\\Administrador\\\\Desktop\\\\test.txt"))) {

			ByteBuffer bf = ByteBuffer.allocate(1024);
			int bytesRead = -1;

			do {
				bytesRead = bc.read(bf);
				bf.rewind();
				while (bf.hasRemaining()) {
					System.out.print((char) bf.get());
				}
			} while (bytesRead != 1);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void byteBuffer1() {

		try (FileChannel fc = (FileChannel) Files.newByteChannel(
				Paths.get("C:\\\\Users\\\\Administrador\\\\Desktop\\\\test.txt"), StandardOpenOption.READ,
				StandardOpenOption.WRITE)) {

			MappedByteBuffer mbb = fc.map(MapMode.READ_ONLY, 0, fc.size());

			while (mbb.hasRemaining()) {
				System.out.print((char) mbb.get());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void bufferedReader() {
		try (FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Administrador\\\\Desktop\\\\test.txt")) {
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		byteBuffer1();

		System.exit(1);

		bufferedReader();

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
