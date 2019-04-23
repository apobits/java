/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

/**
 * @author aposo
 *
 */
public class Q15 {

	public static void main(String[] args) {

		try {
			Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
			files.forEach(fName -> {
				try {
					Path path = fName.toAbsolutePath();
					System.out.println(
							fName + ": " + Files.readAttributes(path, BasicFileAttributes.class).creationTime());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
