/**
 * 
 */
package justdo.it.ocpjp8;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 * @author aposo
 *
 */
public class PathExample {

	public static void pathMatcher() {
		PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:C:**.java");
		System.out.println(pm);
		Path path = Paths.get("C:\\serialized.java");
		System.out.println(pm.matches(path));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		pathMatcher();

//		Path path2 = Paths.get("C:\\Users\\aposo\\Desktop/test");
//
//		Path path3 = Paths.get("C:\\Users\\aposo\\Desktop/P.pdf");
//
//		System.out.println(path2.relativize(path3));
//
//		File file = (path2.resolve(path2.relativize(path3))).toFile();
//
//		System.out.println(file.length());

	}

}
