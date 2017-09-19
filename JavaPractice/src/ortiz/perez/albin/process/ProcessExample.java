/**
 * 
 */
package ortiz.perez.albin.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * @author Administrador
 *
 */
public class ProcessExample {

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		ProcessBuilder pb = new ProcessBuilder("C:/Program Files/Notepad++/notepad++.exe");
		// ProcessBuilder pb = new ProcessBuilder("C:/Program
		// Files/Git/git-cmd.exe");

		Process p = pb.start();
		// BufferedWriter out = new BufferedWriter(new
		// OutputStreamWriter(p.getOutputStream()));
		OutputStream out = p.getOutputStream();
		out.write("File".getBytes());

		out.flush();
		p.waitFor();
		BufferedReader brerr = new BufferedReader(new InputStreamReader(p.getErrorStream()));
		BufferedReader brout = new BufferedReader(new InputStreamReader(p.getInputStream()));

		String line = null;
		while ((line = brerr.readLine()) != null) {
			System.out.println(line);
		}

		while ((line = brout.readLine()) != null) {
			System.out.println(line);
		}

		out.close();
		brerr.close();
		brout.close();
	}
}
