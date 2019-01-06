/**
 * 
 */
package ortiz.perez.albin.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrador
 *
 */
public class FileOutputStreamExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\aposo\\Desktop\\test/JavaTest.java", true)) {
			fos.write("Hello there".getBytes());
			fos.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
