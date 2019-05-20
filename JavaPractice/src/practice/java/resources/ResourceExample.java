/**
 * 
 */
package practice.java.resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author apobits@gmail.com
 *
 */
public class ResourceExample {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(ResourceExample.class.getResourceAsStream("Information.txt")))) {
			br.lines().forEach(t->System.out.println(t));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
