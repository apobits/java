/**
 * 
 */
package practice.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author apobits@gmail.com
 *
 */
public class FileInputStreamExample {

	public static void main(String args[]) {
		if (args.length == 0 || args[0] == null) {
			System.out.println("No file entered, program exiting...");
			return;
		}

		System.out.println("Start writing, when you want to save to the document type in -1");
		File file = new File(args[0]);

		try (InputStream is = System.in; OutputStream os = new FileOutputStream(file)) {
			int i = 0;
			StringBuilder sb = new StringBuilder();
			while ((i = is.read()) != 45) {
				sb.append((char) i);
			}
			os.write(sb.toString().getBytes());
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println("Document " + file.getAbsolutePath() + " saved");

	}

}
