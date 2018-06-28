
package source;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *                   &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dui" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="billerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="isAgentInitiated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="energiaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="alcaldiaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="reconexionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlRootElement(name = "PayBillRequest", namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema")
public class PayBillRequest {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema", required = true)
    protected PayBillRequest.RequestBody requestBody;

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
     *     {@link PayBillRequest.RequestBody }
     *     
     */
    public PayBillRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * Define el valor de la propiedad requestBody.
     * 
     * @param value
     *     allowed object is
     *     {@link PayBillRequest.RequestBody }
     *     
     */
    public void setRequestBody(PayBillRequest.RequestBody value) {
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
     *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dui" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="billerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="isAgentInitiated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="energiaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="alcaldiaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="reconexionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "reference",
        "dui",
        "monto",
        "transactionId",
        "fechaPago",
        "msisdn",
        "billerCode",
        "isAgentInitiated",
        "energiaAmount",
        "alcaldiaAmount",
        "reconexionAmount",
        "idType",
        "additionalParameters"
    })
    public static class RequestBody {

        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema", required = true)
        protected String reference;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema", required = true)
        protected String dui;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema")
        protected BigDecimal monto;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema")
        protected String transactionId;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaPago;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema")
        protected String msisdn;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema", required = true)
        protected String billerCode;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema")
        protected Boolean isAgentInitiated;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema")
        protected BigDecimal energiaAmount;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema")
        protected BigDecimal alcaldiaAmount;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema")
        protected BigDecimal reconexionAmount;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema")
        protected String idType;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillRequest/V1/schema")
        protected PayBillRequest.RequestBody.AdditionalParameters additionalParameters;

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
         * Obtiene el valor de la propiedad monto.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMonto() {
            return monto;
        }

        /**
         * Define el valor de la propiedad monto.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMonto(BigDecimal value) {
            this.monto = value;
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
         * Obtiene el valor de la propiedad fechaPago.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaPago() {
            return fechaPago;
        }

        /**
         * Define el valor de la propiedad fechaPago.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaPago(XMLGregorianCalendar value) {
            this.fechaPago = value;
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
         * Obtiene el valor de la propiedad energiaAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEnergiaAmount() {
            return energiaAmount;
        }

        /**
         * Define el valor de la propiedad energiaAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEnergiaAmount(BigDecimal value) {
            this.energiaAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad alcaldiaAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAlcaldiaAmount() {
            return alcaldiaAmount;
        }

        /**
         * Define el valor de la propiedad alcaldiaAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAlcaldiaAmount(BigDecimal value) {
            this.alcaldiaAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad reconexionAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getReconexionAmount() {
            return reconexionAmount;
        }

        /**
         * Define el valor de la propiedad reconexionAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setReconexionAmount(BigDecimal value) {
            this.reconexionAmount = value;
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
         *     {@link PayBillRequest.RequestBody.AdditionalParameters }
         *     
         */
        public PayBillRequest.RequestBody.AdditionalParameters getAdditionalParameters() {
            return additionalParameters;
        }

        /**
         * Define el valor de la propiedad additionalParameters.
         * 
         * @param value
         *     allowed object is
         *     {@link PayBillRequest.RequestBody.AdditionalParameters }
         *     
         */
        public void setAdditionalParameters(PayBillRequest.RequestBody.AdditionalParameters value) {
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
