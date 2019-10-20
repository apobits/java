/**
 * 
 */
package practice.java.varieties;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * @author apobits@gmail.com
 *
 */
public class ProcessExample {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			Process process = Runtime.getRuntime().exec("C:\\Program Files\\Notepad++\\notepad++.exe");
			os = process.getOutputStream();
			// at the time of testing this application it did not write anything to
			// notepad++, investigate further when you have more time
			os.write("Testing writing into notedpad++ from a process in java".getBytes());
			os.flush();

			InputStream is = process.getInputStream();
			int letter = -1;
			while ((letter = is.read()) != -1) {
				System.out.print((char) letter);
			}

			System.out.println();
			InputStreamReader isr = new InputStreamReader(process.getErrorStream());
			BufferedReader isError = new BufferedReader(isr);
			String line = null;
			while ((line = isError.readLine()) != null) {
				System.out.println(line);
			}

			process.destroy();

			Process process1 = new ProcessBuilder("C:\\Program Files (x86)\\Notepad++\\notepad++.exe").start();
			process1.destroyForcibly();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
