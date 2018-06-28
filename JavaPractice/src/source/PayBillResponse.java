
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
 *         &lt;element ref="{http://xmlns.tigo.com/ResponseHeader/V3}ResponseHeader"/>
 *         &lt;element name="responseBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="codOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="codSecuencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="codAprobacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="additionalResults" minOccurs="0">
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
    "responseHeader",
    "responseBody"
})
@XmlRootElement(name = "PayBillResponse", namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillResponse/V1/schema")
public class PayBillResponse {

    @XmlElement(name = "ResponseHeader", namespace = "http://xmlns.tigo.com/ResponseHeader/V3", required = true)
    protected ResponseHeader responseHeader;
    @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillResponse/V1/schema", required = true)
    protected PayBillResponse.ResponseBody responseBody;

    /**
     * Obtiene el valor de la propiedad responseHeader.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Define el valor de la propiedad responseHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setResponseHeader(ResponseHeader value) {
        this.responseHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad responseBody.
     * 
     * @return
     *     possible object is
     *     {@link PayBillResponse.ResponseBody }
     *     
     */
    public PayBillResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * Define el valor de la propiedad responseBody.
     * 
     * @param value
     *     allowed object is
     *     {@link PayBillResponse.ResponseBody }
     *     
     */
    public void setResponseBody(PayBillResponse.ResponseBody value) {
        this.responseBody = value;
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
     *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="codOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="codSecuencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="codAprobacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="additionalResults" minOccurs="0">
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
        "transactionID",
        "code",
        "status",
        "message",
        "codOperacion",
        "codSecuencia",
        "codAprobacion",
        "additionalResults"
    })
    public static class ResponseBody {

        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillResponse/V1/schema", required = true)
        protected String transactionID;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillResponse/V1/schema", required = true)
        protected String code;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillResponse/V1/schema", required = true)
        protected String status;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillResponse/V1/schema", required = true)
        protected String message;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillResponse/V1/schema", required = true)
        protected String codOperacion;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillResponse/V1/schema", required = true)
        protected String codSecuencia;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillResponse/V1/schema", required = true)
        protected String codAprobacion;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/PayBillResponse/V1/schema")
        protected PayBillResponse.ResponseBody.AdditionalResults additionalResults;

        /**
         * Obtiene el valor de la propiedad transactionID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionID() {
            return transactionID;
        }

        /**
         * Define el valor de la propiedad transactionID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionID(String value) {
            this.transactionID = value;
        }

        /**
         * Obtiene el valor de la propiedad code.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Define el valor de la propiedad code.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Obtiene el valor de la propiedad status.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Define el valor de la propiedad status.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Obtiene el valor de la propiedad message.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * Define el valor de la propiedad message.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
        }

        /**
         * Obtiene el valor de la propiedad codOperacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodOperacion() {
            return codOperacion;
        }

        /**
         * Define el valor de la propiedad codOperacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodOperacion(String value) {
            this.codOperacion = value;
        }

        /**
         * Obtiene el valor de la propiedad codSecuencia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodSecuencia() {
            return codSecuencia;
        }

        /**
         * Define el valor de la propiedad codSecuencia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodSecuencia(String value) {
            this.codSecuencia = value;
        }

        /**
         * Obtiene el valor de la propiedad codAprobacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodAprobacion() {
            return codAprobacion;
        }

        /**
         * Define el valor de la propiedad codAprobacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodAprobacion(String value) {
            this.codAprobacion = value;
        }

        /**
         * Obtiene el valor de la propiedad additionalResults.
         * 
         * @return
         *     possible object is
         *     {@link PayBillResponse.ResponseBody.AdditionalResults }
         *     
         */
        public PayBillResponse.ResponseBody.AdditionalResults getAdditionalResults() {
            return additionalResults;
        }

        /**
         * Define el valor de la propiedad additionalResults.
         * 
         * @param value
         *     allowed object is
         *     {@link PayBillResponse.ResponseBody.AdditionalResults }
         *     
         */
        public void setAdditionalResults(PayBillResponse.ResponseBody.AdditionalResults value) {
            this.additionalResults = value;
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
        public static class AdditionalResults {

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
