package practice.java.io;

import java.io.RandomAccessFile;

public class RandomAccessFileExample {

    public static void main(String[] args) {
	try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Administrador\\Desktop\\test.txt", "rwd")) {
	    raf.seek(raf.length());// moves the file cursor to the specified position
	    raf.write(" !!!".getBytes());
	    raf.seek(0);// moves the file cursor to the specified position
	    int index = -1;
	    while ((index = raf.read()) != -1) {
		System.out.print((char) index);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}
