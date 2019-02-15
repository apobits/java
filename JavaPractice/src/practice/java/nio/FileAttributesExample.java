/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author apobits@gmail.com
 *
 */
public class FileAttributesExample {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");

		BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

		System.out.println("Creation time " + basicFileAttributes.creationTime());

		System.out.println("Last access time " + basicFileAttributes.lastAccessTime());

		System.out.println("Last modified time " + basicFileAttributes.lastModifiedTime());

	}

}
