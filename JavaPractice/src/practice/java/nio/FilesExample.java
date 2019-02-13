/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author apobits@gmail.com
 *
 */
public class FilesExample {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");

		Path path1 = Paths.get("C:\\Users\\Administrador\\Desktop\\marc\\serialized.java");

		System.out.println("File " + path + " exists " + Files.exists(path));

		System.out.println("File " + path + " not exists " + Files.notExists(path));

		System.out.println("File " + path + " is readable " + Files.isReadable(path));

		System.out.println("File " + path + " is writable " + Files.isWritable(path));

		System.out.println("File " + path + " is executable " + Files.isExecutable(path));

		// copying a file replacing it if it exists already
		Files.copy(path, path1, StandardCopyOption.REPLACE_EXISTING, LinkOption.NOFOLLOW_LINKS);

		// copying a file replacing it if it exists already and no following symbolic
		// links
		Files.copy(path, path1, StandardCopyOption.REPLACE_EXISTING, LinkOption.NOFOLLOW_LINKS);

		// copying the data in the file to an output stream
		Files.copy(path, System.out);

		// moving a file or directory and replacing it if it exists already
		Files.move(path1, path, StandardCopyOption.REPLACE_EXISTING);

		Files.copy(path, path1, StandardCopyOption.REPLACE_EXISTING, LinkOption.NOFOLLOW_LINKS);

		// moving a file or directory and replacing it if it exists already in an atomic
		// operation
		// when atomic operation is performed you can be sure that processes watching
		// the directory will access a complete file
		Files.move(path1, path, StandardCopyOption.ATOMIC_MOVE);

	}

}
