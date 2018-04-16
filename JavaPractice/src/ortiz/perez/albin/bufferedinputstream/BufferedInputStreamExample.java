package ortiz.perez.albin.bufferedinputstream;

import java.io.BufferedInputStream;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

public class BufferedInputStreamExample {

    public static void main(String[] args) {
	// use a BufferedInputStream for performance reasons
	String text = "Hello there.";
	try (BufferedInputStream bis = new BufferedInputStream(new ByteInputStream(text.getBytes(), text.length()))) {
	    int index = -1;
	    while ((index = bis.read()) != -1) {
		System.out.print((char) index);
	    }
	} catch (Exception e) {

	}

    }

}
