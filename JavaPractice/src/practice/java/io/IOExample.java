/**
 * 
 */
package practice.java.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author apobits@gmail.com
 *
 */
public class IOExample {

	public static void readAllBytes() {
		ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 65, 76, 66, 73, 78 });
		// creating an String from an array of bytes from the input stream
		// since JDK 9
		var string = new String(bais.readAllBytes());

		System.out.println(string);
	}

	public static void transferTo() throws IOException {
		ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 65, 76, 66, 73, 78 });
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		bais.transferTo(baos);

		System.out.println(baos.toString(Charset.forName("UTF-8")));

	}

	public static void main(String[] args) throws IOException {
		transferTo();

	}

}
