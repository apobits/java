/**
 * 
 */
package ortiz.perez.albin.urlconnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

/**
 * @author aposo
 *
 */
public class RestWSConsumer {

    /**
     * @param args
     * @throws IOException
     * @throws UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
	// Using urlconnection
	try {
	    URLConnection urlConn = new URL(args[0]).openConnection();

	    String x = null;
	    BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
	    while ((x = br.readLine()) != null) {
		System.out.println(x);
	    }
	} catch (Exception e) {

	}

	// using socket
	StringBuilder sb = new StringBuilder();
	sb.append("GET /LearningWeb/PersonApp/person/all HTTP/1.1\n");
	sb.append("Host: localhost:8081\n");
	sb.append("\n\n");

	Socket socket = new Socket("localhost", 8081);
	PrintWriter pw = new PrintWriter(socket.getOutputStream());
	pw.write(sb.toString());
	pw.flush();
	socket.getOutputStream().flush();
	BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	String temp = null;
	while ((temp = reader.readLine()) != null) {
	    System.out.println(temp);
	}
	socket.close();

    }

}
