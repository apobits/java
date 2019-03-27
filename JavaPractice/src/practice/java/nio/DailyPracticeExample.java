/**
 * 
 */
package practice.java.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://qa.api.tigo.com/oauth/client_credential/accesstoken");
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Autorization",
					"Basic " + Base64.encode("FMkOk7RUZaNLX6LPVGi6LjsZfBvq8UPu:ALOG1TPrz6hoPmvz".getBytes()));
			connection.setRequestProperty("Accept", "application/json");
			connection.setDoOutput(true);

			try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()))) {

				bw.write("grant_type=client_credentials");
				bw.flush();

			}

			try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));) {

				String line = null;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
