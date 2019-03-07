package practice.java.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DataOutputStreamExample {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Administrador\\Desktop\\test.txt");
		try (OutputStream os = new FileOutputStream(f); DataOutputStream dos = new DataOutputStream(os)) {
			dos.writeChar(45);
			dos.writeBoolean(true);
			dos.writeInt(1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
