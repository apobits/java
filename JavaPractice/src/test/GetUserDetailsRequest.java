
package test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.tigo.com/RequestHeader/V3}RequestHeader"/>
 *         &lt;element name="requestBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MasterAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SubscriberAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="additionalParameters" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://xmlns.tigo.com/ParameterType/V2}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestHeader",
    "requestBody"
})
@XmlRootElement(name = "getUserDetailsRequest", namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsRequest/V1/schema")
public class GetUserDetailsRequest {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsRequest/V1/schema", required = true)
    protected GetUserDetailsRequest.RequestBody requestBody;

    /**
     * Obtiene el valor de la propiedad requestHeader.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Define el valor de la propiedad requestHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad requestBody.
     * 
     * @return
     *     possible object is
     *     {@link GetUserDetailsRequest.RequestBody }
     *     
     */
    public GetUserDetailsRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * Define el valor de la propiedad requestBody.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserDetailsRequest.RequestBody }
     *     
     */
    public void setRequestBody(GetUserDetailsRequest.RequestBody value) {
        this.requestBody = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MasterAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SubscriberAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="additionalParameters" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://xmlns.tigo.com/ParameterType/V2}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "masterAccount",
        "pin",
        "subscriberAccount",
        "additionalParameters"
    })
    public static class RequestBody {

        @XmlElement(name = "MasterAccount", namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsRequest/V1/schema")
        protected String masterAccount;
        @XmlElement(name = "Pin", namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsRequest/V1/schema")
        protected String pin;
        @XmlElement(name = "SubscriberAccount", namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsRequest/V1/schema", required = true)
        protected String subscriberAccount;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsRequest/V1/schema")
        protected GetUserDetailsRequest.RequestBody.AdditionalParameters additionalParameters;

        /**
         * Obtiene el valor de la propiedad masterAccount.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMasterAccount() {
            return masterAccount;
        }

        /**
         * Define el valor de la propiedad masterAccount.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMasterAccount(String value) {
            this.masterAccount = value;
        }

        /**
         * Obtiene el valor de la propiedad pin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPin() {
            return pin;
        }

        /**
         * Define el valor de la propiedad pin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPin(String value) {
            this.pin = value;
        }

        /**
         * Obtiene el valor de la propiedad subscriberAccount.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubscriberAccount() {
            return subscriberAccount;
        }

        /**
         * Define el valor de la propiedad subscriberAccount.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubscriberAccount(String value) {
            this.subscriberAccount = value;
        }

        /**
         * Obtiene el valor de la propiedad additionalParameters.
         * 
         * @return
         *     possible object is
         *     {@link GetUserDetailsRequest.RequestBody.AdditionalParameters }
         *     
         */
        public GetUserDetailsRequest.RequestBody.AdditionalParameters getAdditionalParameters() {
            return additionalParameters;
        }

        /**
         * Define el valor de la propiedad additionalParameters.
         * 
         * @param value
         *     allowed object is
         *     {@link GetUserDetailsRequest.RequestBody.AdditionalParameters }
         *     
         */
        public void setAdditionalParameters(GetUserDetailsRequest.RequestBody.AdditionalParameters value) {
            this.additionalParameters = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://xmlns.tigo.com/ParameterType/V2}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "parameterType"
        })
        public static class AdditionalParameters {

            @XmlElement(name = "ParameterType", namespace = "http://xmlns.tigo.com/ParameterType/V2")
            protected List<ParameterType> parameterType;

            /**
             * Gets the value of the parameterType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parameterType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParameterType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ParameterType }
             * 
             * 
             */
            public List<ParameterType> getParameterType() {
                if (parameterType == null) {
                    parameterType = new ArrayList<ParameterType>();
                }
                return this.parameterType;
            }

        }

    }

}
