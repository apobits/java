
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
 *                   &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="idTransaction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dui" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="codSecuencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="codOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "RevertPayRequest", namespace = "http://xmlns.tigo.com/MFS/GenericPayments/RevertPayRequest/V1/schema")
public class RevertPayRequest {

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/RevertPayRequest/V1/schema", required = true)
    protected RevertPayRequest.RequestBody requestBody;

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
     *     {@link RevertPayRequest.RequestBody }
     *     
     */
    public RevertPayRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * Define el valor de la propiedad requestBody.
     * 
     * @param value
     *     allowed object is
     *     {@link RevertPayRequest.RequestBody }
     *     
     */
    public void setRequestBody(RevertPayRequest.RequestBody value) {
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
     *         &lt;element name="idTransaction" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dui" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="codSecuencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="codOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "idTransaction",
        "billerCode",
        "dui",
        "amount",
        "codSecuencia",
        "codOperacion",
        "additionalParameters"
    })
    public static class RequestBody {

        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/RevertPayRequest/V1/schema", required = true)
        protected String reference;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/RevertPayRequest/V1/schema", required = true)
        protected String idTransaction;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/RevertPayRequest/V1/schema", required = true)
        protected String billerCode;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/RevertPayRequest/V1/schema", required = true)
        protected String dui;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/RevertPayRequest/V1/schema", required = true)
        protected String amount;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/RevertPayRequest/V1/schema", required = true)
        protected String codSecuencia;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/RevertPayRequest/V1/schema", required = true)
        protected String codOperacion;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/RevertPayRequest/V1/schema")
        protected RevertPayRequest.RequestBody.AdditionalParameters additionalParameters;

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
         * Obtiene el valor de la propiedad idTransaction.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdTransaction() {
            return idTransaction;
        }

        /**
         * Define el valor de la propiedad idTransaction.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdTransaction(String value) {
            this.idTransaction = value;
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
         * Obtiene el valor de la propiedad amount.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmount() {
            return amount;
        }

        /**
         * Define el valor de la propiedad amount.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmount(String value) {
            this.amount = value;
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
         * Obtiene el valor de la propiedad additionalParameters.
         * 
         * @return
         *     possible object is
         *     {@link RevertPayRequest.RequestBody.AdditionalParameters }
         *     
         */
        public RevertPayRequest.RequestBody.AdditionalParameters getAdditionalParameters() {
            return additionalParameters;
        }

        /**
         * Define el valor de la propiedad additionalParameters.
         * 
         * @param value
         *     allowed object is
         *     {@link RevertPayRequest.RequestBody.AdditionalParameters }
         *     
         */
        public void setAdditionalParameters(RevertPayRequest.RequestBody.AdditionalParameters value) {
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
