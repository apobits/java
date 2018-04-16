package practice.java.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExample {

    public static void main(String[] args) {

	try (FileInputStream fis = new FileInputStream("C:\\Users\\Administrador\\Desktop\\test.txt"); DataInputStream dis = new DataInputStream(fis)) {
	    int index = -1;
	    while ((index = dis.read()) != -1) {
		System.out.print((char) index);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}
