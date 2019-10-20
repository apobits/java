/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author apobits@gmail.com
 *
 */
public class FileSystemExample {

	private static Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");

	public static void getRootDirectories() {
		Iterable<Path> rootDirectories = FileSystems.getDefault().getRootDirectories();
		for (Path path : rootDirectories) {
			System.out.println(path);
		}
	}

	public static void getFileStores() {
		Iterable<FileStore> fileStores = FileSystems.getDefault().getFileStores();
		for (FileStore fileStore : fileStores) {
			System.out.println(fileStore);
		}
	}

	public static void zipFileSystem() throws IOException {
		FileSystem fileSystem = FileSystems.newFileSystem(Paths.get("C:\\Users\\Administrador\\Desktop\\classes.7z"),
				ClassLoader.getPlatformClassLoader());
		Files.walkFileTree(fileSystem.getPath("/"), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				System.out.println(file);
				return FileVisitResult.CONTINUE;
			}
		});
	}

	public static void main(String[] args) throws IOException {
		zipFileSystem();
	}

}
