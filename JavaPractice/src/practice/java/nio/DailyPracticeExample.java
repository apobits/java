/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) throws IOException {

		Files.list(Paths.get("C:\\Users\\Administrador\\Desktop")).forEach(System.out::println);
	}
}
