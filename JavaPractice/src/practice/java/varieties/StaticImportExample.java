/**
 * 
 */
package practice.java.varieties;

import static java.lang.Math.*;
import static java.lang.System.out;

/**
 * @author aposo
 *
 */
public class StaticImportExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// accessing PI, E, pow  directly without Class name because of static import
		out.println(pow(PI, E));

	}

}
