/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Paths;

/**
 * @author aposo
 *
 */
public class MemmoryMappedFiles {

	public static void main(String args[]) {

		try (FileChannel fileChannel = FileChannel.open(Paths.get("C:\\Users\\aposo\\Desktop\\x.txt"))) {
			var buffer = fileChannel.map(MapMode.READ_ONLY, 0, fileChannel.size() - 1);
			while (buffer.hasRemaining()) {
				var character = (char) buffer.get();
				if (character == ' ') {
					break;
				} else {
					System.out.print(character);
				}
			}
			buffer.flip();
			buffer.rewind();
			while (buffer.hasRemaining()) {
				var character = (char) buffer.get();
				System.out.print(character);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
