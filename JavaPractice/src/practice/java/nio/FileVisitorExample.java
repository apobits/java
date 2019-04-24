/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author apobits@gmail.com
 *
 */
public class FileVisitorExample {

	static class CustomFileVisitor extends SimpleFileVisitor<Path> {

		private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:*.java");

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			if (pathMatcher.matches(file.getFileName())) {
				System.out.println(file);
			}
			return FileVisitResult.CONTINUE;
		}

		@Override
		public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
			if (dir.getFileName().toString().equals("bb")) {
				return FileVisitResult.SKIP_SIBLINGS;
			} else {
				return FileVisitResult.CONTINUE;
			}
		}
	}

	public static void main(String[] args) {
		try {
			Files.walkFileTree(Paths.get("C:\\Users\\Administrador\\Desktop\\practice"), new CustomFileVisitor());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
