/**
 * 
 */
package practice.java.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {
		
		System.out.println(System.getProperty("user.dir"));
		File file = new File("C:\\Users\\Administrador\\Desktop\\dam.txt");

		try (FileOutputStream fos = new FileOutputStream(file)) {
			fos.write("Works!!! ".getBytes());
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
