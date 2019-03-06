package ortiz.perez.albin.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		// use a BufferedInputStream for performance reasons
		String text = "Hello there.";
		try (BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(text.getBytes()))) {
			int index = -1, count = 0;
			bis.mark(5);
			while ((index = bis.read()) != -1) {
				System.out.print((char) index);

				if (((char) index) == 'o') {
					bis.reset();
					count++;
					System.out.print(" ");
				}

				if (count == 3) {
					break;
				}

			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
