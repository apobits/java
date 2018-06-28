import java.text.Normalizer;

public class Demo {

    public static void main(String[] args) throws Exception {
	// String xml = "<?xml version='1.0'
	// encoding='UTF-8'?><Ticket><bookedSeats>3</bookedSeats><bpAddress>Anand Rao
	// Circle</bpAddress><bpLandMark>ganesha temple</bpLandMark><bpLocation> Ghousia
	// College</bpLocation><bpPhoneNo>98798679769</bpPhoneNo><bpTime>1200</bpTime><busServiceName>efdf</busServiceName><busType>Volvo
	// A/C Semi Sleeper
	// (2+2)</busType><commission>66.19</commission><dateOfJourney>2012-10-05</dateOfJourney><destination>Chennai</destination><fare>600.0</fare><issueTime>2012-10-04T15:46:45.073+05:30</issueTime><noOfSeats>1</noOfSeats><passengerMobile>1234567890</passengerMobile><passengerName>Test</passengerName><pnr>RATPKES44974756</pnr><seatDetails><seatDetail><commission>66.19</commission><fare>600.0</fare><gender>MALE</gender><passengerAge>0</passengerAge><passengerMobile>1234567890</passengerMobile><passengerName>Test</passengerName><prime>false</prime><seatName>3</seatName></seatDetail></seatDetails><source>Bangalore</source><status>BOOKED</status><travelsName>Rajratan
	// Travels</travelsName></Ticket>";
	//
	// XPathFactory xpf = XPathFactory.newInstance();
	// XPath xpath = xpf.newXPath();
	//
	// InputSource inputSource = new InputSource(new StringReader(xml));
	// String pnr = (String) xpath.evaluate("/Ticket/pnr", inputSource,
	// XPathConstants.STRING);
	// System.out.println(pnr);

	String s = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><env:Header xmlns:wsa=\"http://www.w3.org/2005/08/addressing\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"><wsa:MessageID>urn:4D8DDB10549611E8AF7DB77931FC2A94</wsa:MessageID><wsa:ReplyTo><wsa:Address>http://www.w3.org/2005/08/addressing/anonymous</wsa:Address></wsa:ReplyTo></env:Header><env:Body xmlns:wsa=\"http://www.w3.org/2005/08/addressing\" xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"><sch:generalPortabilityResponse xmlns:sch=\"http://xmlns.tigo.com/GeneralActivatorProcess/GeneralActivatorResponse/V1/schema\"><v3:ResponseHeader xmlns:v3=\"http://xmlns.tigo.com/ResponseHeader/V3\"><v3:GeneralResponse><v3:correlationID>1525986368851</v3:correlationID><v3:status>ERROR</v3:status><v3:code>1603</v3:code><v3:codeType>NEG</v3:codeType><v3:description>Serie ICCID está asociada a una cuenta Activa                                                                                                                                                                                                                   </v3:description></v3:GeneralResponse></v3:ResponseHeader><sch:responseBody><sch:additionalResults><v2:ParameterType xmlns:v2=\"http://xmlns.tigo.com/ParameterType/V2\"><v2:parameterName>TRANSACTION_ID</v2:parameterName><v2:parameterValue>10306</v2:parameterValue></v2:ParameterType><v2:ParameterType xmlns:v2=\"http://xmlns.tigo.com/ParameterType/V2\"><v2:parameterName>REQUEST_ID</v2:parameterName><v2:parameterValue/></v2:ParameterType><v2:ParameterType xmlns:v2=\"http://xmlns.tigo.com/ParameterType/V2\"><v2:parameterName/><v2:parameterValue/></v2:ParameterType></sch:additionalResults></sch:responseBody></sch:generalPortabilityResponse></env:Body></soapenv:Envelope>\r\n";

	String xml11pattern = "[^" + "\u0001-\uD7FF" + "\uE000-\uFFFD" + "\ud800\udc00-\udbff\udfff" + "]+";

	String xml10pattern = "[^" + "\u0009\r\n" + "\u0020-\uD7FF" + "\uE000-\uFFFD" + "\ud800\udc00-\udbff\udfff"
		+ "]";

	s = Normalizer.normalize(s, Normalizer.Form.NFD);
	s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

	System.out.println(s);

    }

}