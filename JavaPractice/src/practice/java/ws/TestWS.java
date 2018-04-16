/**
 * 
 */
package practice.java.ws;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import test.GeneralConsumerInfoType;
import test.GeneralResponseMsg;
import test.GetUserDetailsPortType;
import test.GetUserDetailsPortTypeSOAP12BindingQSService;
import test.GetUserDetailsRequest;
import test.GetUserDetailsRequest.RequestBody;
import test.RequestHeader;

/**
 * @author apobits@gmail.com
 *
 */
public class TestWS {

    /**
     * @param args
     * @throws JAXBException
     */
    public static void main(String[] args) throws JAXBException {

	GetUserDetailsPortType port = new GetUserDetailsPortTypeSOAP12BindingQSService()
		.getGetUserDetailsPortTypeSOAP12BindingQSPort();
	GetUserDetailsRequest request = new GetUserDetailsRequest();
	RequestBody requestBody = new RequestBody();
	RequestHeader requestHeader = new RequestHeader();
	GeneralConsumerInfoType gCIT = new GeneralConsumerInfoType();
	requestBody.setMasterAccount("string");
	requestBody.setPin("10");
	requestBody.setSubscriberAccount("99990000");
	request.setRequestBody(requestBody);
	gCIT.setCountry("HND");
	requestHeader.setGeneralConsumerInformation(gCIT);
	gCIT.setConsumerID("");
	gCIT.setCorrelationID("");
	gCIT.setTransactionID("");
	request.setRequestHeader(requestHeader);
	JAXBContext ctx = JAXBContext.newInstance(GetUserDetailsRequest.class);
	ctx.createMarshaller().marshal(request, System.out);
	try {
	    port.getUserDetails(request);
	} catch (GeneralResponseMsg e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
