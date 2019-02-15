/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author apobits@gmail.com
 *
 */
public class PathExample {

	public static void relativize() {
		Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\newTest.java");
		Path path1 = Paths.get("C:\\Users\\Administrador\\Desktop\\marc");

		Path path3 = path.relativize(path1);

		System.out.println(path.resolve(path3));

	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		relativize();

		System.exit(1);

		// creates a path using the utility class Paths
		Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");

		// creates a path using the class FileSystems
		Path path1 = FileSystems.getDefault().getPath("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");
		Path subpath = path1.subpath(1, 3);
		System.out.println("Path operations");
		System.out.println("Path: " + path);
		System.out.println("Root: " + path.getRoot());
		System.out.println("Parent: " + path.getParent());
		System.out.println("Class: " + path.getClass());
		System.out.println("Names count: " + path.getNameCount());
		System.out.println("Subpath: " + subpath);
		System.out.println("File name: " + path.getFileName());
		System.out.println("File system: " + path.getFileSystem());
		System.out.println("Name at position 0: " + path.getName(0));
		System.out.println(
				"Name at position " + (path.getNameCount() - 1) + ": " + path.getName(path.getNameCount() - 1));
		System.out.println();
		System.out.println("Subpath operations");
		System.out.println("Path: " + subpath);
		System.out.println("Root: " + subpath.getRoot());
		System.out.println("Parent: " + subpath.getParent());
		System.out.println("Class: " + subpath.getClass());
		System.out.println("Names count: " + subpath.getNameCount());
		System.out.println("File name: " + subpath.getFileName());
		System.out.println("File system: " + subpath.getFileSystem());
		System.out.println("Name at position 0: " + subpath.getName(0));
		System.out.println("Name at position " + (subpath.getNameCount() - 1) + ": "
				+ subpath.getName(subpath.getNameCount() - 1));

		// normalize thats not check at file system when it cleans up a path
		Path path2 = Paths.get("C:\\Users\\Administrador\\Desktop\\test\\test\\..\\serialized.java\\.");
		System.out.println(path2.normalize());

		// normalizes a path checking at file system when it cleans it up
		System.out.println(path2.toRealPath());

		// returns an absolute path
		System.out.println(path2.toAbsolutePath());

		Path path3 = FileSystems.getDefault().getPath("C:\\Users\\Administrador\\Desktop\\test");

		Path path4 = Paths.get("serialized.java");

		Path path5 = Paths.get("C:\\Users\\Administrador\\Desktop\\marc");

		System.out.println(path3.relativize(path5));
		System.out.println(path5.relativize(path3));

		Path path6 = path3.resolve(path4);
		System.out.println("path3 resolves path4 " + path6);

		System.out.println("path3 equals path5 = " + path3.equals(path5));

		System.out.println("path6 starts with path3 = " + path6.startsWith(path3));

		Path path7 = Paths.get("C:\\Users\\Administrador\\Desktop\\test");
		System.out.println("path3 ends with path7 = " + path3.endsWith(path7));

		System.out.println("path2 is same file as path6 = " + Files.isSameFile(path2, path6));

	}

}
