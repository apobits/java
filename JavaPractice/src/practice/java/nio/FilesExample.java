/**
 * 
 */
package practice.java.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.util.Arrays;

/**
 * @author apobits@gmail.com
 *
 */
public class FilesExample {

	private static Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");

	public static void readWithBuffer() {
		try (BufferedReader br = Files.newBufferedReader(path)) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void writeWithBuffer() {
		try (BufferedWriter br = Files.newBufferedWriter(path, StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING)) {
			br.write("Helloooooooooooo");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void readStream() {
		try (InputStream isr = Files.newInputStream(path)) {
			int byt3;
			while ((byt3 = isr.read()) != -1) {
				System.out.print((char) byt3);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void writeStream() {
		try (OutputStream os = Files.newOutputStream(path)) {
			os.write("Byeeeeeeeeeeeeeeee".getBytes());
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		readWithBuffer();

		writeWithBuffer();

		readStream();

		writeStream();

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

		Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()));

		// hiding the file
		Files.setAttribute(path, "dos:hidden", false);

		// getting disk space
		FileStore fs = Files.getFileStore(path);
		System.out.println();
		System.out.println("total space in gigas: " + fs.getTotalSpace() / (1024 * 1024 * 1024));

		// creating a small file
		Path file = Paths.get("C:\\Users\\Administrador\\Desktop\\smallFile.txt");
		Files.write(file, "Hello there".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

		// appending a list of strings
		Files.write(file, Arrays.asList("\rHi", "there"), StandardOpenOption.APPEND);

	}

}
