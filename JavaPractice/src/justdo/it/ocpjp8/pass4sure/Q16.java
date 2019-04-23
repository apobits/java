/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author aposo
 *
 */
public class Q16 {

	public void processFile() throws IOException, ClassNotFoundException {
		try (FileReader fr = new FileReader("logfilesrc.txt"); FileWriter fw = new FileWriter("logfiledest.txt")) {
			Class c = Class.forName("java.lang.JString");
		}
	}

	public static void main(String[] args) {
		
	}

}
