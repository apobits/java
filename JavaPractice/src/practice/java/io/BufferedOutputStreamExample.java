/**
 * 
 */
package practice.java.io;

import java.io.BufferedOutputStream;

/**
 * @author Administrador
 *
 */
public class BufferedOutputStreamExample {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) {

	try (BufferedOutputStream bos = new BufferedOutputStream(System.out)) {
	    bos.write("Be strong".getBytes());
	    bos.flush();
	} catch (Exception e) {
	    e.printStackTrace(System.out);
	}

    }

}
