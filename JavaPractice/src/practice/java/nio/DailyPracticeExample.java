/**
 * 
 */
package practice.java.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
				StringBuilder sb = new StringBuilder();
				String line = null;
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}

				Pattern pattern = Pattern.compile(".*\"access_token\"\\s*:\\s*\"([^\"]+)\".*");
				Matcher matcher = pattern.matcher(sb);
				if (matcher.matches() && matcher.groupCount() > 0) {
					System.out.println(matcher.group(1));
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {
			HttpURLConnection connection = (HttpURLConnection) new URL(
					"http://18.234.89.197:8090/ResourcesManagerServicesPayloadLog/eventRouter/payloadlog/log")
							.openConnection();
			connection.setRequestMethod("POST");
			connection.setDoOutput(true);
			try (OutputStream os = connection.getOutputStream()) {
				os.write("Helloooo".getBytes());
			}

		} catch (IOException e) {
			System.out.println(e.getMessage().contains(" 401 "));
		}

		System.exit(1);

		getAccessToken();

	}

}
