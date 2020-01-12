/**
 *
 */
package practice.java.nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author apobits@gmail.com
 *
 *
 */

public class DailyPracticeExample {

    public static void main(String[] args) {
	copyFile3();
    }

    public static void copyFile3() {
	try (var fileReader = new FileReader("C:\\Users\\aposo\\Desktop\\FileOne.txt");
			var fileWriter = new FileWriter("C:\\Users\\aposo\\Desktop\\FileOneCopy.txt")) {
	    var bytes = new char[1024];
	    var bytesRead = -1;
	    while ((bytesRead = fileReader.read(bytes)) != -1) {
		fileWriter.write(bytes, 0, bytesRead);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static void copyFile2() {
	try {
	    Files.copy(Paths.get("C:\\Users\\aposo\\Desktop\\FileOne.txt"),
			    Paths.get("C:\\Users\\aposo\\Desktop\\FileOneCopy.txt"),
			    StandardCopyOption.REPLACE_EXISTING);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static void copyFile1() {
	try (var fis = new FileInputStream("C:\\Users\\aposo\\Desktop\\FileOne.txt");
			var fos = new FileOutputStream("C:\\Users\\aposo\\Desktop\\FileOneCopy.txt")) {
	    var bytes = new byte[1024];
	    var bytesRead = -1;
	    while ((bytesRead = fis.read(bytes)) != -1) {
		fos.write(bytes, 0, bytesRead);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    static class A implements AutoCloseable {

	@Override
	public void close() throws Exception {
	    throw new Exception("E");
	}
    }

}

