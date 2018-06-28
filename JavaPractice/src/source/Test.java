/**
 * 
 */
package source;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import source.ViewBillRequest.RequestBody;

/**
 * @author aportiz@stefanini.com
 *
 */
public class Test {

    public static void main(String[] args) {
	JAXBContext context = null;
	try {
	    // creates JaxB context
	    context = JAXBContext.newInstance(ViewBillResponse.class, ViewBillRequest.class, ViewBillFault.class);
	    Marshaller marshaller = context.createMarshaller();

	    GenericPayments genericPayments = new GenericPaymentsSOAPQSService().getGenericPaymentsSOAPQSPort();
	    ObjectFactory factory = new ObjectFactory();

	    ViewBillRequest request = factory.createViewBillRequest();
	    RequestBody requestBody = factory.createViewBillRequestRequestBody();
	    RequestHeader header = factory.createRequestHeader();
	    // sets header info
	    GeneralConsumerInfoType headerInfo = factory.createGeneralConsumerInfoType();
	    headerInfo.setConsumerID(factory.createGeneralConsumerInfoTypeConsumerID("ARQ.ECHACON"));
	    headerInfo.setTransactionID(factory.createGeneralConsumerInfoTypeTransactionID("201805230044"));
	    headerInfo.setCountry(factory.createGeneralConsumerInfoTypeCountry("SLV"));
	    headerInfo.setCorrelationID("1234567");
	    header.setGeneralConsumerInformation(headerInfo);
	    request.setRequestHeader(header);
	    // sets body info
	    requestBody.setBillerCode("bpds1");
	    requestBody.setTransactionId("201805230004");
	    requestBody.setReference("515335101");
	    requestBody.setIdType("1");
	    request.setRequestBody(requestBody);

	    // prints request
	    marshaller.marshal(request, System.out);

	    // consumes legacy service
	    ViewBillResponse response = genericPayments.viewBill(request);

	    // prints response
	    marshaller.marshal(response, System.out);

	} catch (ViewBillFaultMessage fault) {
	    try {
		context.createMarshaller().marshal(fault.getFaultInfo(), System.out);
	    } catch (JAXBException e) {
		e.printStackTrace();
	    }
	} catch (Exception e) {
	    System.out.println(e);
	}

    }

}
