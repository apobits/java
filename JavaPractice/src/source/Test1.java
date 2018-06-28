/**
 * 
 */
package source;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author apobits@gmail.com
 *
 */
public class Test1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try (Socket socket = new Socket("192.168.105.190", 8011)) {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Post");
	    
	    String request = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sch=\"http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema\" xmlns:v3=\"http://xmlns.tigo.com/RequestHeader/V3\" xmlns:v2=\"http://xmlns.tigo.com/ParameterType/V2\">\r\n"
		    + "	<soapenv:Header/>\r\n" + "	<soapenv:Body>\r\n"
		    + "		<ns5:ViewBillRequest xmlns=\"http://xmlns.tigo.com/ResponseHeader/V3\" xmlns:ns2=\"http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema\" xmlns:ns3=\"http://xmlns.tigo.com/ParameterType/V2\" xmlns:ns4=\"http://xmlns.tigo.com/RequestHeader/V3\" xmlns:ns5=\"http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema\" xmlns:ns6=\"http://xmlns.tigo.com/MFS/GenericPayments/RevertPayResponse/V1/schema\" xmlns:ns7=\"http://xmlns.tigo.com/MFS/GenericPayments/RevertPayRequest/V1/schema\" xmlns:ns8=\"http://xmlns.tigo.com/MFS/GenericPayments/PayBillResponse/V1/schema\" xmlns:ns9=\"http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema\" xmlns:ns10=\"http://xmlns.tigo.com/MFS/PayBillFault/V1/schema\" xmlns:ns11=\"http://xmlns.tigo.com/MFS/RevertPayFault/V1/schema\" xmlns:ns12=\"http://xmlns.tigo.com/MFS/ViewBillFault/V1/schema\">\r\n"
		    + "			<ns4:RequestHeader>\r\n"
		    + "				<ns4:GeneralConsumerInformation>\r\n"
		    + "					<ns4:consumerID>ARQ.ECHACON</ns4:consumerID>\r\n"
		    + "					<ns4:transactionID>201805230044</ns4:transactionID>\r\n"
		    + "					<ns4:country>SLV</ns4:country>\r\n"
		    + "					<ns4:correlationID>1234567</ns4:correlationID>\r\n"
		    + "				</ns4:GeneralConsumerInformation>\r\n"
		    + "			</ns4:RequestHeader>\r\n" + "			<ns5:requestBody>\r\n"
		    + "				<ns5:billerCode>bpds1</ns5:billerCode>\r\n"
		    + "				<ns5:transactionId>201805230004</ns5:transactionId>\r\n"
		    + "				<ns5:reference>515335101</ns5:reference>\r\n"
		    + "				<ns5:idType>1</ns5:idType>\r\n"
		    + "			</ns5:requestBody>\r\n" + "		</ns5:ViewBillRequest>\r\n"
		    + "	</soapenv:Body>\r\n" + "</soapenv:Envelope>";
	    PrintWriter pr = new PrintWriter(socket.getOutputStream());
	    pr.write(request);
	    pr.flush();
	    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    String line = null;
	    while ((line = br.readLine()) != null) {
		System.out.println(line);
	    }
	} catch (Exception e) {
	    System.out.println(e);
	}

    }

}
