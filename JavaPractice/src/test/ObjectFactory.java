
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test package. 
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

    private final static QName _GeneralResponseTypeCode_QNAME = new QName("http://xmlns.tigo.com/ResponseHeader/V3", "code");
    private final static QName _GeneralResponseTypeCodeType_QNAME = new QName("http://xmlns.tigo.com/ResponseHeader/V3", "codeType");
    private final static QName _GeneralResponseTypeCorrelationID_QNAME = new QName("http://xmlns.tigo.com/ResponseHeader/V3", "correlationID");
    private final static QName _GeneralResponseTypeDescription_QNAME = new QName("http://xmlns.tigo.com/ResponseHeader/V3", "description");
    private final static QName _GeneralResponseTypeStatus_QNAME = new QName("http://xmlns.tigo.com/ResponseHeader/V3", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserDetailsRequest }
     * 
     */
    public GetUserDetailsRequest createGetUserDetailsRequest() {
        return new GetUserDetailsRequest();
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse }
     * 
     */
    public GetUserDetailsResponse createGetUserDetailsResponse() {
        return new GetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse.ResponseBody }
     * 
     */
    public GetUserDetailsResponse.ResponseBody createGetUserDetailsResponseResponseBody() {
        return new GetUserDetailsResponse.ResponseBody();
    }

    /**
     * Create an instance of {@link GetUserDetailsRequest.RequestBody }
     * 
     */
    public GetUserDetailsRequest.RequestBody createGetUserDetailsRequestRequestBody() {
        return new GetUserDetailsRequest.RequestBody();
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
     * Create an instance of {@link GetUserDetailsResponse.ResponseBody.AdditionalResults }
     * 
     */
    public GetUserDetailsResponse.ResponseBody.AdditionalResults createGetUserDetailsResponseResponseBodyAdditionalResults() {
        return new GetUserDetailsResponse.ResponseBody.AdditionalResults();
    }

    /**
     * Create an instance of {@link GetUserDetailsRequest.RequestBody.AdditionalParameters }
     * 
     */
    public GetUserDetailsRequest.RequestBody.AdditionalParameters createGetUserDetailsRequestRequestBodyAdditionalParameters() {
        return new GetUserDetailsRequest.RequestBody.AdditionalParameters();
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
