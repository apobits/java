/**
 * 
 */
package practice.java.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {
		var file = new File("C:\\Users\\Administrador\\Desktop\\Data.txt");

		try (var isr = new FileReader(file); var osw = new OutputStreamWriter(System.out)) {
			isr.transferTo(osw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
