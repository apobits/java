/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author aposo
 *
 */
public class Q6 extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println(file);
		return FileVisitResult.CONTINUE;
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Q6 q6 = new Q6();

		Files.walkFileTree(Paths.get("C:\\Users\\aposo\\Desktop\\parent"), q6);

		Files.walkFileTree(Paths.get("C:\\Users\\aposo\\Desktop\\parent"),
				new TreeSet(Arrays.asList(FileVisitOption.FOLLOW_LINKS)), 2, q6);

		// MaxDepth works this way: it will print all the files(not directories) until
		// the level specified is reached, on that level it will print directories and
		// files

	}

}
