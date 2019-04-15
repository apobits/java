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

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	public static void main(String args[]) throws InterruptedException, IOException {
		Path target = Paths.get("C:\\Users\\Administrador\\Desktop\\practice\\b\\File.txt");
		Path source = FileSystems.getDefault().getPath("C:\\Users\\Administrador\\Desktop\\practice\\a\\File.txt");

		Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);

		Files.delete(source);

		System.out.println("source exists? " + source.toFile().exists());
		System.out.println("target exists? " + target.toFile().exists());
	}

}
