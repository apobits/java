package ortiz.perez.albin.bytes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {

    public static void main(String[] args) throws IOException {
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	baos.write("Hellooooooo".getBytes());
	baos.writeTo(System.out);
	baos.flush();
	baos.close();

    }

}
