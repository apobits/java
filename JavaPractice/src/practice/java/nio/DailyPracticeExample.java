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
import java.util.Base64;

import javax.net.ssl.HttpsURLConnection;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	public static void getAccessToken() {
		try {
			URL url = new URL(
					"https://qa.api.tigo.com/oauth/client_credential/accesstoken?grant_type=client_credentials");
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Authorization", "Basic " + Base64.getEncoder()
					.encodeToString("FMkOk7RUZaNLX6LPVGi6LjsZfBvq8UPu:ALOG1TPrz6hoPmvz".getBytes()));
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

	public static void main(String[] args) {
		try {
			HttpsURLConnection connection = (HttpsURLConnection) new URL(
					"https://qa.api.tigo.com/v1/tigo/home/work-orders/work-order/MILRM0000000038/1").openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Authorization", "Bearer CA479GNpgGcDF8VKhMRWI0Bks7Aw");

			try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
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
