/**
 * 
 */
package practice.java.collection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;

/**
 * @author apobits@gmail.com
 *
 */
public class PropertiesExample {

	public static void main(String[] args) {

		// properties class, it extends HashTable
		Properties properties = new Properties();
		try (FileInputStream fis = new FileInputStream("C:\\Users\\Administrador\\Desktop\\test\\Family.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr)) {
			properties.load(br);
		} catch (IOException e) {
			System.out.println(e);
		}

		// iterating over the properties
		properties.forEach((t, u) -> System.out.println(t + " " + u));

		// adding more data
		properties.put("Hasley", "8");
		properties.put("Winder", "9");
		properties.put("Robinson", "10");

		// saving properties to a file
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrador\\Desktop\\test\\Family.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw)) {
			properties.store(bw, "Saved");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
