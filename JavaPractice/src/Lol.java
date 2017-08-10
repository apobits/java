import java.io.StringReader;
import java.util.StringTokenizer;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.xml.sax.InputSource;;

/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class Lol {

	public String getNumbersOnly(String str) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				stringBuilder.append(str.charAt(i));
				;
				break;
			}
		}
		return stringBuilder.toString();
	}

	public String getTagValue(String source, String tag) {
		StringTokenizer st = new StringTokenizer(source, "\n");
		String x = "";
		while (st.hasMoreTokens()) {
			x = st.nextToken();
			if (x.contains(tag))
				return removeTags(x.trim());
		}
		return null;
	}

	private String removeTags(String source) {
		int graterThanLeft = 0, lessThanRight = 0;
		for (int i = 0; i < source.length(); i++) {
			if (source.charAt(i) == '>' && i != source.length() - 1)
				graterThanLeft = i;
			if (source.charAt(i) == '<' && i != 0)
				lessThanRight = i;
		}
		return source.substring(graterThanLeft + 1, lessThanRight + 1);
	}

	public static void main(String[] args) throws Exception {
		
        String xml = "<Ticket><bookedSeats>3</bookedSeats><bpAddress>Anand Rao Circle</bpAddress><bpLandMark>ganesha temple</bpLandMark><bpLocation> Ghousia College</bpLocation><bpPhoneNo>98798679769</bpPhoneNo><bpTime>1200</bpTime><busServiceName>efdf</busServiceName><busType>Volvo A/C Semi Sleeper (2+2)</busType><commission>66.19</commission><dateOfJourney>2012-10-05</dateOfJourney><destination>Chennai</destination><fare>600.0</fare><issueTime>2012-10-04T15:46:45.073+05:30</issueTime><noOfSeats>1</noOfSeats><passengerMobile>1234567890</passengerMobile><passengerName>Test</passengerName><pnr>RATPKES44974756</pnr><seatDetails><seatDetail><commission>66.19</commission><fare>600.0</fare><gender>MALE</gender><passengerAge>0</passengerAge><passengerMobile>1234567890</passengerMobile><passengerName>Test</passengerName><prime>false</prime><seatName>3</seatName></seatDetail></seatDetails><source>Bangalore</source><status>BOOKED</status><travelsName>Rajratan Travels</travelsName></Ticket>";

		String source = "<Task><AppointmentFinish/><AppointmentStart/><CallID>MILRM0000000312</CallID><City>Pendiente</City><DueDate>2017-06-06 06:00:00</DueDate><Duration>900</Duration></Task>";

		XPathFactory xpf = XPathFactory.newInstance();
		XPath xpath = xpf.newXPath();

		InputSource inputSource = new InputSource(new StringReader(source));
		String pnr = (String) xpath.evaluate("/Task/CallID", inputSource, XPathConstants.STRING);
		System.out.println(pnr);
	}

}
