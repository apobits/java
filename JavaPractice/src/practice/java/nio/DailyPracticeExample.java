/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) throws IOException {

		try (FileChannel fileChannel = FileChannel
				.open(FileSystems.getDefault().getPath("C:\\Users\\aposo\\Desktop\\x.txt"))) {

			var buffer = ByteBuffer.allocate((int) fileChannel.size());
			System.out.println(fileChannel.read(buffer));
			buffer.rewind();
			while (buffer.hasRemaining()) {
				System.out.print((char) buffer.get());
			}
			buffer.rewind();
			while (buffer.hasRemaining()) {
				char temp = (char) buffer.get();
				if (temp == ' ') {
					break;
				}
			}
			System.out.println();
			buffer.compact();
			buffer.limit(buffer.position());
			buffer.rewind();
			while (buffer.hasRemaining()) {
				System.out.print((char) buffer.get());
			}
		}
	}
}
