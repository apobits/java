package practice.java.io;

import java.io.CharArrayWriter;
import java.io.OutputStreamWriter;

public class CharArrayWriterExample {

	public static void main(String[] args) {
		try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
			CharArrayWriter car = new CharArrayWriter();
			car.write("Hello there");
			car.writeTo(osw);
			car.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
