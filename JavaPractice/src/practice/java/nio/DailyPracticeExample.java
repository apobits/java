/**
 * 
 */
package practice.java.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		Path path = Paths.get("c:\\one\\two.txt");
		Path path1 = Paths.get("c:\\one\\three");

		System.out.println(path.resolve(path1));

		System.out.println(path.relativize(path1));
		Path path3 = path.relativize(path1);

		System.out.println(path.resolve(path3));

	}
}
