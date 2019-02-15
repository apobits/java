/**
 * 
 */
package practice.java.nio;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author apobits@gmail.com
 *
 */
public class ByteChannelExample {

	private static Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try (SeekableByteChannel sbc = Files.newByteChannel(path, READ, WRITE)) {
			ByteBuffer bb = ByteBuffer.allocate((int) sbc.size());
			sbc.read(bb);
			bb.rewind();
			StringBuilder sb = new StringBuilder();
			while (bb.hasRemaining()) {
				sb.append((char) bb.get());
			}
			System.out.println(sb);
			sbc.write(ByteBuffer.wrap("\rModified by Apo".getBytes()));
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
