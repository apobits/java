/**
 * 
 */
package ortiz.perez.albin.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

/**
 * @author Administrador
 *
 */
public class PropertiesExample {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();// Properties that stores key/value
											// Strings

		prop.setProperty("A", "a");
		prop.setProperty("B", "b");
		prop.setProperty("C", "c");
		prop.setProperty("D", "d");

		Set<Object> keys = prop.keySet();
		for (Object x : keys) {
			System.out.print((String) x + " = " + prop.getProperty((String) x) + " ");
		}

		System.out.println(prop.getProperty("E", "e not found"));// obtains a
																	// property
																	// if not
																	// found the
																	// default
																	// value
																	// specified
																	// is
																	// returned
		InputStreamReader isr = new InputStreamReader(System.in);
		// prop.load(isr);// investigate
		prop.list(System.out);// send the properties to the output stream
		//saves the properties to the output stream representing the xml file
		FileOutputStream os = new FileOutputStream("C:\\Users\\Administrador\\Desktop\\prop.xml");
		prop.storeToXML(os, "prop");

	}

}
