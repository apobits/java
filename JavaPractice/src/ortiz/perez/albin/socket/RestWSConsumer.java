/**
 * 
 */
package ortiz.perez.albin.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;

/**
 * @author aposo
 *
 */
public class RestWSConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL(args[0]);
			Socket socket = new Socket(url.getHost(), url.getPort());
			StringBuilder sb = new StringBuilder();
			sb.append("Get ");
			sb.append(url.getPath());
			sb.append(" HTTP/1.1\n");
			sb.append("Host: ");
			sb.append(url.getHost());
			sb.append(":");
			sb.append(url.getPort());
			sb.append("\n\n");

			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.print(sb.toString());
			pw.flush();

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			socket.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
