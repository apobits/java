/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	public static void main(String args[]) throws InterruptedException, IOException {

		Stream<Path> paths = Files.find(Paths.get("C:\\Users\\aposo\\Desktop\\parent\\child1"), 3,
				(t, u) -> u.isRegularFile());

		paths.forEach(t -> System.out.println(t));

		paths.close();

	}

}
