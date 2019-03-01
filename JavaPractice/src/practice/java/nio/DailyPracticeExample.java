/**
 * 
 */
package practice.java.nio;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get(new URI("file:///C:/Users/Administrador/Desktop/test/serialized.java"));
		Path path2 = FileSystems.getDefault().getPath("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");

		try (InputStream is = Files.newInputStream(path, StandardOpenOption.READ);
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}

		System.out.println(path.getName(0));

		System.out.println(path2.startsWith("C:\\Users\\Administrador") + " " + path2.endsWith("test/serialized.java"));
	}

}
