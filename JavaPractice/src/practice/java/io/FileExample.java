/**
 * 
 */
package practice.java.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author apobits@gmail.com
 *
 */
public class FileExample {

	public static void main(String[] args) throws URISyntaxException, IOException {

		// Creating a file with the specified string
		File file1 = new File("C:\\Users\\Administrador\\Desktop\\test\\");

		// Creating a file with the specified strings
		File file2 = new File("C:\\Users\\Administrador\\Desktop\\test\\", "\\file.txt");

		// Creating a file with the specified URI
		File file3 = new File(new URI("file:///C:/Users/Administrador/Desktop/test/"));

		// Creating a file with the specified file and string
		File file4 = new File(new File("C:\\Users\\Administrador\\Desktop\\test\\"), "\\file.txt");

		System.out.println(file1 + " exists " + file1.exists());
		System.out.println(file1 + " absolute path " + file1.getAbsolutePath());
		System.out.println(file1 + " path " + file1.getPath());
		System.out.println(file1 + " name " + file1.getName());
		System.out.println(file1 + " parent " + file1.getParent());
		System.out.println(file1 + " lenght " + file1.length());
		System.out.println(file1 + " canonical path " + file1.getCanonicalPath());
		System.out.println(file1 + " absolute path " + file1.getAbsolutePath());
		System.out.println(file1 + " free space " + file1.getFreeSpace());
		System.out.println(file1 + " total space " + file1.getTotalSpace());
		System.out.println(file1 + " usable space " + file1.getUsableSpace());
		System.out.println(file1 + " is absolute " + file1.isAbsolute());
		System.out.println(file1 + " is file " + file1.isFile());
		System.out.println(file1 + " is directory " + file1.isDirectory());
		System.out.println(file1 + " is hidden " + file1.isHidden());
		System.out.println(file1 + " can write " + file1.canWrite());
		System.out.println(file1 + " can read " + file1.canRead());

		System.out.println(file4 + " created " + file4.createNewFile());

		System.out.println(file4 + " deleted " + file4.delete());

		// returns the names of the files and directories only
		String[] files1 = file1.list();
		System.out.println(file1 + " has ");
		for (String file : files1) {
			System.out.print(file + " ");
		}

		System.out.println();
		// returns file object thus printing the absolute path
		System.out.println(file1 + " has ");
		File[] files2 = file1.listFiles();
		for (File file : files2) {
			System.out.print(file + " ");
		}

		// use mkdir when parent directories exists
		System.out.println();
		File file5 = new File(file1, "temp");
		System.out.println(file5 + " was created " + file5.mkdir());

		// use mkdirs when parent directories does not exists
		File file6 = new File(file1, "temp1/temp2/temp3");
		System.out.println(file6 + " was created " + file6.mkdirs());

		// delete works on the file or last directory only, it is not recursively
		System.out.println(file6 + " was deleted " + file6.delete());

	}

}
