/**
 * 
 */
package practice.java.io;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 * @author Administrador
 *
 */
public class PushbackInputStreamExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

	try (PushbackInputStream pbis = new PushbackInputStream(new ByteArrayInputStream("Hello".getBytes()))) {
	    pbis.unread(45);
	    int i = -1;
	    while ((i = pbis.read()) != -1) {
		System.out.print((char) i);
	    }

	} catch (Exception e) {
	    System.out.println(e);
	}

    }

}
