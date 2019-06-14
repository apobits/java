/**
 * 
 */
package practice.java.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		try (ZipOutputStream zos = new ZipOutputStream(
				new FileOutputStream(new File("C:\\Users\\Administrador\\Desktop\\myZIP.zip")));
				var fis = new FileInputStream("C:\\\\Users\\\\Administrador\\\\Desktop\\\\SP_COLLECT_EQUIPMENT.sql")) {
			var entry = new ZipEntry("SP_COLLECT_EQUIPMENT.sql");
			zos.putNextEntry(entry);
			zos.write(fis.readAllBytes());
			zos.closeEntry();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
