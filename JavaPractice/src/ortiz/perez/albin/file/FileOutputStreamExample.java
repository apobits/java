/**
 * 
 */
package ortiz.perez.albin.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrador
 *
 */
public class FileOutputStreamExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
	try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrador\\Desktop\\mypackage\\HelloWorld.java", true)) {
	    fos.write("Hello there".getBytes());
	    fos.flush();
	}
    }
}
