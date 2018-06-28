
package source;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the source package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GeneralConsumerInfoTypeCountry_QNAME = new QName("http://xmlns.tigo.com/RequestHeader/V3", "country");
    private final static QName _GeneralConsumerInfoTypeConsumerID_QNAME = new QName("http://xmlns.tigo.com/RequestHeader/V3", "consumerID");
    private final static QName _GeneralConsumerInfoTypeTransactionID_QNAME = new QName("http://xmlns.tigo.com/RequestHeader/V3", "transactionID");
    private final static QName _GeneralResponseTypeCode_QNAME = new QName("http://xmlns.tigo.com/ResponseHeader/V3", "code");
    private final static QName _GeneralResponseTypeCodeType_QNAME = new QName("http://xmlns.tigo.com/ResponseHeader/V3", "codeType");
    private final static QName _GeneralResponseTypeCorrelationID_QNAME = new QName("http://xmlns.tigo.com/ResponseHeader/V3", "correlationID");
    private final static QName _GeneralResponseTypeDescription_QNAME = new QName("http://xmlns.tigo.com/ResponseHeader/V3", "description");
    private final static QName _GeneralResponseTypeStatus_QNAME = new QName("http://xmlns.tigo.com/ResponseHeader/V3", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: source
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayBillRequest }
     * 
     */
    public PayBillRequest createPayBillRequest() {
        return new PayBillRequest();
    }

    /**
     * Create an instance of {@link PayBillResponse }
     * 
     */
    public PayBillResponse createPayBillResponse() {
        return new PayBillResponse();
    }

    /**
     * Create an instance of {@link ViewBillRequest }
     * 
     */
    public ViewBillRequest createViewBillRequest() {
        return new ViewBillRequest();
    }

    /**
     * Create an instance of {@link ViewBillResponse }
     * 
     */
    public ViewBillResponse createViewBillResponse() {
        return new ViewBillResponse();
    }

    /**
     * Create an instance of {@link RevertPayRequest }
     * 
     */
    public RevertPayRequest createRevertPayRequest() {
        return new RevertPayRequest();
    }

    /**
     * Create an instance of {@link RevertPayResponse }
     * 
     */
    public RevertPayResponse createRevertPayResponse() {
        return new RevertPayResponse();
    }

    /**
     * Create an instance of {@link RevertPayResponse.ResponseBody }
     * 
     */
    public RevertPayResponse.ResponseBody createRevertPayResponseResponseBody() {
        return new RevertPayResponse.ResponseBody();
    }

    /**
     * Create an instance of {@link RevertPayRequest.RequestBody }
     * 
     */
    public RevertPayRequest.RequestBody createRevertPayRequestRequestBody() {
        return new RevertPayRequest.RequestBody();
    }

    /**
     * Create an instance of {@link ViewBillResponse.ResponseBody }
     * 
     */
    public ViewBillResponse.ResponseBody createViewBillResponseResponseBody() {
        return new ViewBillResponse.ResponseBody();
    }

    /**
     * Create an instance of {@link ViewBillRequest.RequestBody }
     * 
     */
    public ViewBillRequest.RequestBody createViewBillRequestRequestBody() {
        return new ViewBillRequest.RequestBody();
    }

    /**
     * Create an instance of {@link PayBillResponse.ResponseBody }
     * 
     */
    public PayBillResponse.ResponseBody createPayBillResponseResponseBody() {
        return new PayBillResponse.ResponseBody();
    }

    /**
     * Create an instance of {@link PayBillRequest.RequestBody }
     * 
     */
    public PayBillRequest.RequestBody createPayBillRequestRequestBody() {
        return new PayBillRequest.RequestBody();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link GeneralConsumerInfoType }
     * 
     */
    public GeneralConsumerInfoType createGeneralConsumerInfoType() {
        return new GeneralConsumerInfoType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link ResponseHeader }
     * 
     */
    public ResponseHeader createResponseHeader() {
        return new ResponseHeader();
    }

    /**
     * Create an instance of {@link GeneralResponseType }
     * 
     */
    public GeneralResponseType createGeneralResponseType() {
        return new GeneralResponseType();
    }

    /**
     * Create an instance of {@link PayBillFault }
     * 
     */
    public PayBillFault createPayBillFault() {
        return new PayBillFault();
    }

    /**
     * Create an instance of {@link RevertPayFault }
     * 
     */
    public RevertPayFault createRevertPayFault() {
        return new RevertPayFault();
    }

    /**
     * Create an instance of {@link ViewBillFault }
     * 
     */
    public ViewBillFault createViewBillFault() {
        return new ViewBillFault();
    }

    /**
     * Create an instance of {@link RevertPayResponse.ResponseBody.AdditionalResults }
     * 
     */
    public RevertPayResponse.ResponseBody.AdditionalResults createRevertPayResponseResponseBodyAdditionalResults() {
        return new RevertPayResponse.ResponseBody.AdditionalResults();
    }

    /**
     * Create an instance of {@link RevertPayRequest.RequestBody.AdditionalParameters }
     * 
     */
    public RevertPayRequest.RequestBody.AdditionalParameters createRevertPayRequestRequestBodyAdditionalParameters() {
        return new RevertPayRequest.RequestBody.AdditionalParameters();
    }

    /**
     * Create an instance of {@link ViewBillResponse.ResponseBody.BillsInformation }
     * 
     */
    public ViewBillResponse.ResponseBody.BillsInformation createViewBillResponseResponseBodyBillsInformation() {
        return new ViewBillResponse.ResponseBody.BillsInformation();
    }

    /**
     * Create an instance of {@link ViewBillResponse.ResponseBody.AdditionalResults }
     * 
     */
    public ViewBillResponse.ResponseBody.AdditionalResults createViewBillResponseResponseBodyAdditionalResults() {
        return new ViewBillResponse.ResponseBody.AdditionalResults();
    }

    /**
     * Create an instance of {@link ViewBillRequest.RequestBody.AdditionalParameters }
     * 
     */
    public ViewBillRequest.RequestBody.AdditionalParameters createViewBillRequestRequestBodyAdditionalParameters() {
        return new ViewBillRequest.RequestBody.AdditionalParameters();
    }

    /**
     * Create an instance of {@link PayBillResponse.ResponseBody.AdditionalResults }
     * 
     */
    public PayBillResponse.ResponseBody.AdditionalResults createPayBillResponseResponseBodyAdditionalResults() {
        return new PayBillResponse.ResponseBody.AdditionalResults();
    }

    /**
     * Create an instance of {@link PayBillRequest.RequestBody.AdditionalParameters }
     * 
     */
    public PayBillRequest.RequestBody.AdditionalParameters createPayBillRequestRequestBodyAdditionalParameters() {
        return new PayBillRequest.RequestBody.AdditionalParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/RequestHeader/V3", name = "country", scope = GeneralConsumerInfoType.class)
    public JAXBElement<String> createGeneralConsumerInfoTypeCountry(String value) {
        return new JAXBElement<String>(_GeneralConsumerInfoTypeCountry_QNAME, String.class, GeneralConsumerInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/RequestHeader/V3", name = "consumerID", scope = GeneralConsumerInfoType.class)
    public JAXBElement<String> createGeneralConsumerInfoTypeConsumerID(String value) {
        return new JAXBElement<String>(_GeneralConsumerInfoTypeConsumerID_QNAME, String.class, GeneralConsumerInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/RequestHeader/V3", name = "transactionID", scope = GeneralConsumerInfoType.class)
    public JAXBElement<String> createGeneralConsumerInfoTypeTransactionID(String value) {
        return new JAXBElement<String>(_GeneralConsumerInfoTypeTransactionID_QNAME, String.class, GeneralConsumerInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/ResponseHeader/V3", name = "code", scope = GeneralResponseType.class)
    public JAXBElement<String> createGeneralResponseTypeCode(String value) {
        return new JAXBElement<String>(_GeneralResponseTypeCode_QNAME, String.class, GeneralResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/ResponseHeader/V3", name = "codeType", scope = GeneralResponseType.class)
    public JAXBElement<String> createGeneralResponseTypeCodeType(String value) {
        return new JAXBElement<String>(_GeneralResponseTypeCodeType_QNAME, String.class, GeneralResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/ResponseHeader/V3", name = "correlationID", scope = GeneralResponseType.class)
    public JAXBElement<String> createGeneralResponseTypeCorrelationID(String value) {
        return new JAXBElement<String>(_GeneralResponseTypeCorrelationID_QNAME, String.class, GeneralResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/ResponseHeader/V3", name = "description", scope = GeneralResponseType.class)
    public JAXBElement<String> createGeneralResponseTypeDescription(String value) {
        return new JAXBElement<String>(_GeneralResponseTypeDescription_QNAME, String.class, GeneralResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/ResponseHeader/V3", name = "status", scope = GeneralResponseType.class)
    public JAXBElement<String> createGeneralResponseTypeStatus(String value) {
        return new JAXBElement<String>(_GeneralResponseTypeStatus_QNAME, String.class, GeneralResponseType.class, value);
    }

}
