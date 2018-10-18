
package test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetUserDetailsPortType", targetNamespace = "http://xmlns.tigo.com/MFS/GetUserDetails/V1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetUserDetailsPortType {


    /**
     * 
     * @param payload
     * @return
     *     returns test.GetUserDetailsResponse
     * @throws GeneralResponseMsg
     */
    @WebMethod(action = "process")
    @WebResult(name = "getUserDetailsResponse", targetNamespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", partName = "payload")
    public GetUserDetailsResponse getUserDetails(
        @WebParam(name = "getUserDetailsRequest", targetNamespace = "http://xmlns.tigo.com/MFS/GetUserDetailsRequest/V1/schema", partName = "payload")
        GetUserDetailsRequest payload)
        throws GeneralResponseMsg
    ;

}