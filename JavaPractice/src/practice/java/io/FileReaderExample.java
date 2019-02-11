package practice.java.io;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("C:\\Users\\Administrador\\Desktop\\test\\serialized.java")) {
			int index;
			while ((index = fr.read()) != -1) {
				System.out.print((char) index);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
