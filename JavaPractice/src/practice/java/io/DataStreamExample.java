/**
 * 
 */
package practice.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author apobits@gmail.com
 *
 */
public class DataStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream("C:\\Users\\Administrador\\Desktop\\test\\serialized.java")))) {
			dos.writeUTF("Hello");
			dos.writeUTF(" there");
			dos.flush();
		} catch (IOException e) {
			System.out.println(e);
		}

		try (DataInputStream dis = new DataInputStream(new BufferedInputStream(
				new FileInputStream("C:\\Users\\Administrador\\Desktop\\test\\serialized.java")))) {

			while (true) {
				System.out.println(dis.readUTF());
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
