package ortiz.perez.albin.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		// use a BufferedInputStream for performance reasons
		String text = "Hello there.";
		try (BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(text.getBytes()))) {
			int index = -1;
			while ((index = bis.read()) != -1) {
				System.out.print((char) index);
			}
		} catch (Exception e) {

		}

	}

}
