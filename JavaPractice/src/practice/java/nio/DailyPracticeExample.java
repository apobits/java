/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	static interface Test {
		default void run(String name) {
			System.out.println("Run: " + name);
		}

		void stop(String name);
	}

	public static void main(String args[]) throws InterruptedException, IOException {

		Test t = u -> {
			System.out.println("Lambda: " + u);
		};

		List<String> names = Arrays.asList("Albin", "Danna");

		names.forEach(z -> t.stop(z));
		
		System.exit(1);
		Path target = Paths.get("C:\\Users\\Administrador\\Desktop\\practice\\b\\File.txt");
		Path source = FileSystems.getDefault().getPath("C:\\Users\\Administrador\\Desktop\\practice\\a\\File.txt");

		Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);

		Files.delete(source);

		System.out.println("source exists? " + source.toFile().exists());
		System.out.println("target exists? " + target.toFile().exists());
	}

}
