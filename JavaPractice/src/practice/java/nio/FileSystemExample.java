/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

	public static void main(String[] args) {
		getRootDirectories();
		getFileStores();
		System.out.println("System separator: " + FileSystems.getDefault().getSeparator());
		try {
			System.out.println("File store of " + path + " is " + Files.getFileStore(path));
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
