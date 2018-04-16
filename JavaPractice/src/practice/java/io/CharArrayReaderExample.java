package practice.java.io;

import java.io.CharArrayReader;

public class CharArrayReaderExample {

	public static void main(String[] args) {
		try {
			CharArrayReader car = new CharArrayReader("Hello World!!!".toCharArray());
			int pos = -1;
			while ((pos = car.read()) != -1) {
				System.out.print((char) pos);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
