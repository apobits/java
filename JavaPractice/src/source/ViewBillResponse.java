
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
 *         &lt;element ref="{http://xmlns.tigo.com/ResponseHeader/V3}ResponseHeader"/>
 *         &lt;element name="responseBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="numberOfBills" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billsInformation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="energiaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="alcaldiaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="reconexionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="clientCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="amountMin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlRootElement(name = "ViewBillResponse", namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema")
public class ViewBillResponse {

    @XmlElement(name = "ResponseHeader", namespace = "http://xmlns.tigo.com/ResponseHeader/V3", required = true)
    protected ResponseHeader responseHeader;
    @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
    protected ViewBillResponse.ResponseBody responseBody;

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
     *     {@link ViewBillResponse.ResponseBody }
     *     
     */
    public ViewBillResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * Define el valor de la propiedad responseBody.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewBillResponse.ResponseBody }
     *     
     */
    public void setResponseBody(ViewBillResponse.ResponseBody value) {
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
     *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="numberOfBills" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billsInformation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="energiaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="alcaldiaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="reconexionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="clientCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="amountMin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "code",
        "message",
        "numberOfBills",
        "billsInformation",
        "additionalResults"
    })
    public static class ResponseBody {

        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
        protected String code;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
        protected String message;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
        protected String numberOfBills;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema")
        protected List<ViewBillResponse.ResponseBody.BillsInformation> billsInformation;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema")
        protected ViewBillResponse.ResponseBody.AdditionalResults additionalResults;

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
         * Obtiene el valor de la propiedad numberOfBills.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfBills() {
            return numberOfBills;
        }

        /**
         * Define el valor de la propiedad numberOfBills.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfBills(String value) {
            this.numberOfBills = value;
        }

        /**
         * Gets the value of the billsInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the billsInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBillsInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ViewBillResponse.ResponseBody.BillsInformation }
         * 
         * 
         */
        public List<ViewBillResponse.ResponseBody.BillsInformation> getBillsInformation() {
            if (billsInformation == null) {
                billsInformation = new ArrayList<ViewBillResponse.ResponseBody.BillsInformation>();
            }
            return this.billsInformation;
        }

        /**
         * Obtiene el valor de la propiedad additionalResults.
         * 
         * @return
         *     possible object is
         *     {@link ViewBillResponse.ResponseBody.AdditionalResults }
         *     
         */
        public ViewBillResponse.ResponseBody.AdditionalResults getAdditionalResults() {
            return additionalResults;
        }

        /**
         * Define el valor de la propiedad additionalResults.
         * 
         * @param value
         *     allowed object is
         *     {@link ViewBillResponse.ResponseBody.AdditionalResults }
         *     
         */
        public void setAdditionalResults(ViewBillResponse.ResponseBody.AdditionalResults value) {
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
         *         &lt;element name="energiaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="alcaldiaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="reconexionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="clientCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="amountMin" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "energiaAmount",
            "dueDate",
            "alcaldiaAmount",
            "reconexionAmount",
            "clientCode",
            "clientName",
            "amount",
            "amountMin",
            "reference"
        })
        public static class BillsInformation {

            @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
            protected BigDecimal energiaAmount;
            @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dueDate;
            @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
            protected BigDecimal alcaldiaAmount;
            @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
            protected BigDecimal reconexionAmount;
            @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
            protected String clientCode;
            @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
            protected String clientName;
            @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
            protected BigDecimal amount;
            @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
            protected String amountMin;
            @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GenericPayments/ViewBillResponse/V1/schema", required = true)
            protected String reference;

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
             * Obtiene el valor de la propiedad dueDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDueDate() {
                return dueDate;
            }

            /**
             * Define el valor de la propiedad dueDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDueDate(XMLGregorianCalendar value) {
                this.dueDate = value;
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
             * Obtiene el valor de la propiedad clientCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClientCode() {
                return clientCode;
            }

            /**
             * Define el valor de la propiedad clientCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClientCode(String value) {
                this.clientCode = value;
            }

            /**
             * Obtiene el valor de la propiedad clientName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClientName() {
                return clientName;
            }

            /**
             * Define el valor de la propiedad clientName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClientName(String value) {
                this.clientName = value;
            }

            /**
             * Obtiene el valor de la propiedad amount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Define el valor de la propiedad amount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Obtiene el valor de la propiedad amountMin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmountMin() {
                return amountMin;
            }

            /**
             * Define el valor de la propiedad amountMin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmountMin(String value) {
                this.amountMin = value;
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

        }

    }

}
