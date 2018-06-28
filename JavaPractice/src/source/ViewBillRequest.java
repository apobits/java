
package source;

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
 *                   &lt;element name="billerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dui" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isAgentInitiated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "ViewBillRequest", namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema")
public class ViewBillRequest {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema", required = true)
    protected ViewBillRequest.RequestBody requestBody;

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
     *     {@link ViewBillRequest.RequestBody }
     *     
     */
    public ViewBillRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * Define el valor de la propiedad requestBody.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewBillRequest.RequestBody }
     *     
     */
    public void setRequestBody(ViewBillRequest.RequestBody value) {
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
     *         &lt;element name="billerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dui" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="isAgentInitiated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "billerCode",
        "transactionId",
        "reference",
        "dui",
        "msisdn",
        "isAgentInitiated",
        "idType",
        "additionalParameters"
    })
    public static class RequestBody {

        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema", required = true)
        protected String billerCode;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema", required = true)
        protected String transactionId;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema", required = true)
        protected String reference;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema", required = true)
        protected String dui;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema")
        protected String msisdn;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema")
        protected Boolean isAgentInitiated;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema")
        protected String idType;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillRequest/V1/schema")
        protected ViewBillRequest.RequestBody.AdditionalParameters additionalParameters;

        /**
         * Obtiene el valor de la propiedad billerCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillerCode() {
            return billerCode;
        }

        /**
         * Define el valor de la propiedad billerCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillerCode(String value) {
            this.billerCode = value;
        }

        /**
         * Obtiene el valor de la propiedad transactionId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionId() {
            return transactionId;
        }

        /**
         * Define el valor de la propiedad transactionId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionId(String value) {
            this.transactionId = value;
        }

        /**
         * Obtiene el valor de la propiedad reference.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReference() {
            return reference;
        }

        /**
         * Define el valor de la propiedad reference.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReference(String value) {
            this.reference = value;
        }

        /**
         * Obtiene el valor de la propiedad dui.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDui() {
            return dui;
        }

        /**
         * Define el valor de la propiedad dui.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDui(String value) {
            this.dui = value;
        }

        /**
         * Obtiene el valor de la propiedad msisdn.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsisdn() {
            return msisdn;
        }

        /**
         * Define el valor de la propiedad msisdn.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsisdn(String value) {
            this.msisdn = value;
        }

        /**
         * Obtiene el valor de la propiedad isAgentInitiated.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsAgentInitiated() {
            return isAgentInitiated;
        }

        /**
         * Define el valor de la propiedad isAgentInitiated.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsAgentInitiated(Boolean value) {
            this.isAgentInitiated = value;
        }

        /**
         * Obtiene el valor de la propiedad idType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdType() {
            return idType;
        }

        /**
         * Define el valor de la propiedad idType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdType(String value) {
            this.idType = value;
        }

        /**
         * Obtiene el valor de la propiedad additionalParameters.
         * 
         * @return
         *     possible object is
         *     {@link ViewBillRequest.RequestBody.AdditionalParameters }
         *     
         */
        public ViewBillRequest.RequestBody.AdditionalParameters getAdditionalParameters() {
            return additionalParameters;
        }

        /**
         * Define el valor de la propiedad additionalParameters.
         * 
         * @param value
         *     allowed object is
         *     {@link ViewBillRequest.RequestBody.AdditionalParameters }
         *     
         */
        public void setAdditionalParameters(ViewBillRequest.RequestBody.AdditionalParameters value) {
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
