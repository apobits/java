/**
 * 
 */
package practice.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author apobits@gmail.com
 *
 */
public class ScannerExample {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in); BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\Administrador\\Desktop\\test\\serialized.java"))) {
			String line;
			while (!(line = scanner.nextLine()).equalsIgnoreCase("Exit")) {
				br.write(line);
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
