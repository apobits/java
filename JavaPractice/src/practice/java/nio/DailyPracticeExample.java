/**
 * 
 */
package practice.java.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");
		System.out.println(path.getRoot());

	}

}
