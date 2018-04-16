package ortiz.perez.albin.bytes;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {

    public static void main(String[] args) {

	ByteArrayInputStream bais = new ByteArrayInputStream("Hello There".getBytes());
	int index = -1;
	// iterates over the byte array of ByteArrayInputStream
	while ((index = bais.read()) != -1) {
	    System.out.print((char) index);
	}
	bais.reset();// resets the pointer to the beginning
	System.out.println();
	// iterates again
	while ((index = bais.read()) != -1) {
	    System.out.print((char) index);
	}

    }

}
