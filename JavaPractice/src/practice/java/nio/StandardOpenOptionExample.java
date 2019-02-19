/**
 * 
 */
package practice.java.nio;

import static java.nio.file.StandardOpenOption.*;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author apobits@gmail.com
 *
 */
public class StandardOpenOptionExample {

	private static Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");

	//valid on windows
	public static void readWrite() {
		try (FileChannel fc = FileChannel.open(path, READ,APPEND)) {
			ByteBuffer bb = ByteBuffer.allocate((int) fc.size());
			fc.read(bb);
			while (bb.hasRemaining()) {
				System.out.print((char) bb.get());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		readWrite();

	}

}
