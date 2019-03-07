package practice.java.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExample {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("C:\\Users\\Administrador\\Desktop\\test.txt");
				DataInputStream dis = new DataInputStream(fis)) {
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
