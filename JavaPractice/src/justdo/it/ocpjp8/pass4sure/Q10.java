/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author aposo
 *
 */
public class Q10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try (Stream<Path> pats = Files.walk(Paths.get("C:\\Users\\aposo\\Desktop\\parent\\child1"), 2)) {
			pats.forEach(t -> System.out.println(t.getFileName()));
		} catch (IOException e) {
			e.printStackTrace();
		}

//		try (Stream<Path> pats = Files.walk(Paths.get("C:\\Users\\aposo\\Desktop\\parent\\child1\\lol.txt"))) {
//			pats.forEach(t -> System.out.println(t.getFileName()));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		try (Stream<Path> pats = Files.find(Paths.get("C:\\Users\\aposo\\Desktop\\parent\\child1"), 3,
//				(p, b) -> b.isRegularFile())) {
//			pats.forEach(t -> System.out.println(t.getFileName()));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
