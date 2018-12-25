/**
 * 
 */
package justdo.it.ocpjp8;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author aposo
 *
 */
public class PathExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Path path2 = Paths.get("C:\\Users\\aposo\\Desktop/test");
		
		Path path3 = Paths.get("C:\\Users\\aposo\\Desktop/P.pdf");

		System.out.println(path2.relativize(path3));
		
		File file = (path2.resolve(path2.relativize(path3))).toFile();
		
		System.out.println(file.length());

	}

}
