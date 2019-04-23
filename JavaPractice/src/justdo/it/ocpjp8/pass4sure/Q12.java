/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author aposo
 *
 */
public class Q12 {

	public static void displayDetails() {
		try (BufferedReader br = new BufferedReader(new FileReader("salesreport.dat"))) {
			String record;
			while ((record = br.readLine()) != null) {
				System.out.println(record);
			}
			br.close();
//			br = new BufferedReader(new FileReader("salesreport.dat"));//resources managed by the try with resources cannot be reassigned
			while ((record = br.readLine()) != null) {
				System.out.println(record);
			}
		} catch (IOException e) {
			System.out.println(e.getClass());
		}
	}

	public static void main(String[] args) {

		displayDetails();

	}

}
