/**
 * 
 */
package practice.java.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author apobits@gmail.com
 *
 */
public class ChannelExample {

	public static void main(String args[]) {

		// Getting a channel using methods from the channel itself
		try (FileChannel fc = FileChannel.open(Paths.get("C:\\Users\\Administrador\\Desktop\\test.txt"))) {

			ByteBuffer bf = ByteBuffer.allocate((int) fc.size());
			fc.read(bf);

		} catch (IOException e) {
			System.out.println(e);
		}

		// Getting a channel from a class that supports returning a channel
		try (FileInputStream fis = new FileInputStream("C:\\Users\\Administrador\\Desktop\\test.txt");
				FileChannel fc = fis.getChannel()) {

			fc.write(ByteBuffer.wrap("hello".getBytes()));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Getting a channel from Files class methods
		try (SeekableByteChannel sbc = Files
				.newByteChannel(FileSystems.getDefault().getPath("C:\\Users\\Administrador\\Desktop\\test.txt"))) {
			sbc.truncate(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
