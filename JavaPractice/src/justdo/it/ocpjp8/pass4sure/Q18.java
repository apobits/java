/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author aposo
 *
 */
public class Q18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Path p1 = Paths.get("/Pics/MyPic.jpeg");
		System.out.println(p1.getNameCount() + ":" + p1.getName(1) + ":" + p1.getFileName());

	}

}
