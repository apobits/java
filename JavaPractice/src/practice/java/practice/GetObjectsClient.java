package practice.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class GetObjectsClient {
    private static final String ERROR = "Error consuming getObjects WS";

    public static String getObjects(String objectType, Map<String, String> properties, List<String> requestedProperties)
		    throws Exception {
	StringBuilder resultSB = new StringBuilder();
	OutputStream outputStream = null;
	BufferedReader bufferedReader = null;
	try {
	    String request = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">#header#body</soapenv:Envelope>";
	    request = request.replace("#header", createHeader("IT_FSAR", "PruebasFS.1"));
	    request = request.replace("#body", createBody(objectType, properties, requestedProperties));
	    HttpURLConnection connection = (HttpURLConnection) new URL(
			    "http://10.5.24.25:8012/ResourcesManager/FSP/GetObjects?wsdl").openConnection();
	    connection.setDoOutput(true);
	    connection.setRequestMethod("POST");
	    outputStream = connection.getOutputStream();
	    outputStream.write(request.getBytes());
	    bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	    String line = null;
	    while ((line = bufferedReader.readLine()) != null) {
		resultSB.append(line);
	    }
	    return resultSB.toString();
	} catch (Exception e) {
	    throw new Exception(e);
	} finally {
	    if (bufferedReader != null) {
		try {
		    bufferedReader.close();
		} catch (IOException e) {
		}
	    }
	    if (outputStream != null) {
		try {
		    outputStream.close();
		} catch (IOException e) {
		}
	    }
	}
    }

    private static String createHeader(String user, String password) {
	return "<soapenv:Header><wsse:Security soapenv:mustUnderstand=\"1\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">"
			+ "<wsse:UsernameToken wsu:Id=\"UsernameToken-59A16DB7EB9FEF935E15731818658221\"><wsse:Username>"
			+ user + "</wsse:Username>"
			+ "<wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">"
			+ password + "</wsse:Password>"
			+ "<wsse:Nonce EncodingType=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\">8/Z4qMd7vTslt7ANr1DNGA==</wsse:Nonce>"
			+ "<wsu:Created>2019-11-08T02:57:45.814Z</wsu:Created></wsse:UsernameToken></wsse:Security></soapenv:Header>";
    }

    private static String createBody(String objectType, Map<String, String> properties,
		    List<String> requestedProperties) {
	return "<soapenv:Body>"
			+ "<GetObjectsRequest xmlns=\"http://xmlns.tigo.com/TigoFS/FieldServiceProxy/GetObjectsRequest/V1/schema\">"
			+ "<GetObjects><ObjectType>" + objectType + "</ObjectType><Indexes>" + createIndexList(
			properties) + createRequestedProperties(requestedProperties) + "</Indexes>"
			+ "</GetObjects></GetObjectsRequest></soapenv:Body>";
    }

    private static String createIndexList(Map<String, String> properties) {
	StringBuilder indexListSB = new StringBuilder();
	String index = "<Index><LowBound><Property><Name>#name</Name><Value>#value</Value></Property></LowBound><HighBound><Property><Name>#name</Name><Value>#value</Value></Property></HighBound></Index>";
	for (Map.Entry<String, String> entry : properties.entrySet()) {
	    indexListSB.append(index.replace("#name", entry.getKey()).replace("#value", entry.getValue()));
	}
	return indexListSB.toString();
    }

    private static String createRequestedProperties(List<String> requestedProperties) {
	StringBuilder requestedPropertiesSB = new StringBuilder();
	String rp = "<RequestedProperties>#itemList</RequestedProperties>";
	String item = "<Item>#item</Item>";
	for (String string : requestedProperties) {
	    requestedPropertiesSB.append(item.replace("#item", string));
	}
	return rp.replace("#itemList", requestedPropertiesSB.toString());
    }

}
