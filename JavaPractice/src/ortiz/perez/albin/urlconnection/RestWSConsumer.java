/**
 * 
 */
package ortiz.perez.albin.urlconnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author aposo
 *
 */
public class RestWSConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			URLConnection urlConn = new URL(args[0]).openConnection();

			String x = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
			while ((x = br.readLine()) != null) {
				System.out.println(x);
			}
		} catch (Exception e) {

		}

	}

}
