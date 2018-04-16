/**
 * 
 */
package practice.java.io;

import java.io.FileWriter;

/**
 * @author Administrador
 *
 */
public class FileWriterExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

	try (FileWriter fw = new FileWriter("C:\\Users\\Administrador\\Desktop\\test.txt", true)) {
	    // if append true data will be written at the end of the file,
	    // otherwise data will be written at the begging erasing all the
	    // data that existed
	    fw.append("\n Marked by FileWriterExample");
	} catch (Exception e) {
	    System.out.println(e);
	}

    }

}
