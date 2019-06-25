/**
 * 
 */
package practice.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @author aposo
 *
 */
public class ZipIOStreamExample {

	public static void createZip() {
		try (var zipOS = new ZipOutputStream(new FileOutputStream("C:\\Users\\aposo\\Desktop\\MyZip.zip"))) {

			zipOS.putNextEntry(new ZipEntry("Names.txt"));
			zipOS.write("Albin\nDanna\nMarcela".getBytes());
			zipOS.closeEntry();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readZip() {
		try (var zipIS = new ZipInputStream(new FileInputStream("C:\\\\Users\\\\aposo\\\\Desktop\\\\MyZip.zip"))) {
			while (zipIS.getNextEntry() != null) {
				System.out.println(new String(zipIS.readAllBytes()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readZip1() {
		try (var zipFile = new ZipFile("C:\\Users\\aposo\\Desktop\\MyZip.zip")) {
			zipFile.stream().forEach(t -> {
				try {
					System.out.println(new String(zipFile.getInputStream(t).readAllBytes()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		readZip1();
//		readZip();
//		createZip();
	}

}
