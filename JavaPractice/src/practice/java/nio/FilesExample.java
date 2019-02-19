/**
 * 
 */
package practice.java.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.DirectoryStream;
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

	public static void tempFile() {
		Path path = Paths.get("C:\\Users\\Administrador\\Desktop\\");
		try {
			path = Files.createTempFile(path, "prefix", "sufix");
		} catch (IOException e) {
			System.out.println(e);
		}

		try (BufferedWriter br = Files.newBufferedWriter(path, StandardOpenOption.WRITE)) {
			br.write("Hellooooooooooooooooooooooooooo");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void createDirectory() {
		try {
			Files.createDirectories(Paths.get("C:\\Users\\Administrador\\Desktop\\test\\test\\test"));
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void createTempDirectory() {
		try {
			Files.createTempDirectory(Paths.get("C:\\Users\\Administrador\\Desktop\\test\\"), "temp");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void listDirectoryContents() {

		try (DirectoryStream<Path> paths = Files
				.newDirectoryStream(Paths.get("C:\\Users\\Administrador\\Desktop\\test"))) {
			for (Path path : paths) {
				System.out.println(path);
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void listDirectoryContents(String glob) {

		try (DirectoryStream<Path> paths = Files
				.newDirectoryStream(Paths.get("C:\\Users\\Administrador\\Desktop\\test"), glob)) {
			for (Path path : paths) {
				System.out.println(path);
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void directoryStreamFilter() {
		DirectoryStream.Filter<Path> filter = (t) -> Files.isDirectory(t);

		try (DirectoryStream<Path> paths = Files
				.newDirectoryStream(Paths.get("C:\\Users\\Administrador\\Desktop\\test"), filter)) {
			for (Path path : paths) {
				System.out.println(path);
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void createSymbolicLink() {
		Path target = Paths.get("C:\\Users\\Administrador\\Desktop\\test");
		Path symbolicLink = Paths.get("C:\\Users\\Administrador\\Desktop\\pointToTest");
		Path result = null;
		try {
			result = Files.createSymbolicLink(symbolicLink, target);
			System.out.println(result + " is symbolicLink " + Files.isSymbolicLink(result));
			System.out.println("Resolve " + symbolicLink + " " + Files.readSymbolicLink(result));
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void createHardLink() {
		Path target = Paths.get("C:\\Users\\Administrador\\Desktop\\test");
		Path symbolicLink = Paths.get("C:\\Users\\Administrador\\Desktop\\pointToTest");
		Path result = null;
		try {
			result = Files.createLink(symbolicLink, target);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {

		// createHardLink();

		createSymbolicLink();

		System.exit(1);

		directoryStreamFilter();

		listDirectoryContents("*.java");

		listDirectoryContents();

		createTempDirectory();

		createDirectory();

		tempFile();

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

		// getting the content type of a file, this method is not infallible
		System.out.println(Files.probeContentType(path));

		File file1 = new File("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");
		
		// from io file to nio path
		Path file1Path = file1.toPath();

		// from nio path to io file
		File file2 = file1Path.toFile();

	}

}
