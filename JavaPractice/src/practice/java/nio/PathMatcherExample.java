/**
 * 
 */
package practice.java.nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 * @author apobits@gmail.com
 *
 */
public class PathMatcherExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PathMatcher pathMatcherRegex = FileSystems.getDefault().getPathMatcher("regex:^.*\\.java");
		PathMatcher pathMatcherGlob = FileSystems.getDefault().getPathMatcher("glob:**.java");
		Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");
		System.out.println("matching using regex " + pathMatcherRegex.matches(path));
		System.out.println("matching using glob " + pathMatcherGlob.matches(path));

		PathMatcher pathMatcherGlob1 = FileSystems.getDefault().getPathMatcher("glob:*{java,lava}");
		System.out.println(pathMatcherGlob1.matches(Paths.get("hi.lava")));

	}

}
