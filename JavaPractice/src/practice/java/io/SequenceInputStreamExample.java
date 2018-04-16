/**
 * 
 */
package practice.java.io;

import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;

/**
 * @author Administrador
 *
 */
public class SequenceInputStreamExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

	try (ByteArrayInputStream bais1 = new ByteArrayInputStream("Hello ".getBytes());
		ByteArrayInputStream bais2 = new ByteArrayInputStream("Albin".getBytes());
		SequenceInputStream sis = new SequenceInputStream(bais1, bais2)) {
	    int index = -1;
	    while ((index = sis.read()) != -1) {
		System.out.print((char) index);
	    }
	} catch (Exception e) {
	    e.printStackTrace(System.out);
	}

    }

}
