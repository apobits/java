/**
 * 
 */
package ortiz.perez.albin.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Administrador
 *
 */
public class FileExample {

    public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\Administrador\\Desktop\\mypackage\\HelloWorld.java");
	try (FileWriter fw = new FileWriter(file); FileReader fr = new FileReader(file)) {
	    fw.write("Hello there");
	    fw.flush();
	    char[] data = new char[(int) file.length()];
	    fr.read(data);
	    System.out.println(data);
	}

    }

}
