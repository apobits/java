
package practice.java.ws.person.classes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web.learning.services.soap package. 
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

    private final static QName _NamingException_QNAME = new QName("http://soap.services.learning.web/", "NamingException");
    private final static QName _GetPersonResponse_QNAME = new QName("http://soap.services.learning.web/", "getPersonResponse");
    private final static QName _Person_QNAME = new QName("http://soap.services.learning.web/", "person");
    private final static QName _GetPerson_QNAME = new QName("http://soap.services.learning.web/", "getPerson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web.learning.services.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link NamingException }
     * 
     */
    public NamingException createNamingException() {
        return new NamingException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamingException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.learning.web/", name = "NamingException")
    public JAXBElement<NamingException> createNamingException(NamingException value) {
        return new JAXBElement<NamingException>(_NamingException_QNAME, NamingException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.learning.web/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<GetPersonResponse>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.learning.web/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.learning.web/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<GetPerson>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

}
