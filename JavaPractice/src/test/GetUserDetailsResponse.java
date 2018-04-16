
package test;

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
 *                   &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="primaryIdType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="primaryIdNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="primaryIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="primaryIdExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="countryOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="agented" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ownerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="alternateContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="profile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="commissionDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="minimumAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="maximumAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "getUserDetailsResponse", namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema")
public class GetUserDetailsResponse {

    @XmlElement(name = "ResponseHeader", namespace = "http://xmlns.tigo.com/ResponseHeader/V3", required = true)
    protected ResponseHeader responseHeader;
    @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
    protected GetUserDetailsResponse.ResponseBody responseBody;

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
     *     {@link GetUserDetailsResponse.ResponseBody }
     *     
     */
    public GetUserDetailsResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * Define el valor de la propiedad responseBody.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserDetailsResponse.ResponseBody }
     *     
     */
    public void setResponseBody(GetUserDetailsResponse.ResponseBody value) {
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
     *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="primaryIdType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="primaryIdNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="primaryIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="primaryIdExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="countryOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="agented" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ownerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="alternateContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="profile" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="commissionDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="minimumAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="maximumAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "sessionId",
        "transactionId",
        "id",
        "firstName",
        "middleName",
        "lastName",
        "primaryIdType",
        "primaryIdNumber",
        "primaryIdIssueDate",
        "primaryIdExpDate",
        "birthDate",
        "countryOfBirth",
        "nationality",
        "occupation",
        "address",
        "region",
        "msisdn",
        "username",
        "reference",
        "agented",
        "ownerId",
        "emailAddress",
        "alternateContact",
        "language",
        "iccid",
        "status",
        "profile",
        "userType",
        "groupName",
        "createdDate",
        "deletedDate",
        "commissionDetails",
        "minimumAmount",
        "maximumAmount",
        "category",
        "agentCode",
        "additionalResults"
    })
    public static class ResponseBody {

        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String sessionId;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String transactionId;
        @XmlElement(name = "Id", namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String id;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String firstName;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String middleName;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String lastName;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String primaryIdType;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String primaryIdNumber;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar primaryIdIssueDate;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar primaryIdExpDate;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar birthDate;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String countryOfBirth;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String nationality;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String occupation;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String address;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String region;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String msisdn;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String username;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String reference;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String agented;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String ownerId;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String emailAddress;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String alternateContact;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String language;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String iccid;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String status;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String profile;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String userType;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String groupName;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdDate;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar deletedDate;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String commissionDetails;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String minimumAmount;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String maximumAmount;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String category;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema", required = true)
        protected String agentCode;
        @XmlElement(namespace = "http://xmlns.tigo.com/MFS/GetUserDetailsResponse/V1/schema")
        protected GetUserDetailsResponse.ResponseBody.AdditionalResults additionalResults;

        /**
         * Obtiene el valor de la propiedad sessionId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionId() {
            return sessionId;
        }

        /**
         * Define el valor de la propiedad sessionId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionId(String value) {
            this.sessionId = value;
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
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad firstName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Define el valor de la propiedad firstName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Obtiene el valor de la propiedad middleName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiddleName() {
            return middleName;
        }

        /**
         * Define el valor de la propiedad middleName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMiddleName(String value) {
            this.middleName = value;
        }

        /**
         * Obtiene el valor de la propiedad lastName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Define el valor de la propiedad lastName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Obtiene el valor de la propiedad primaryIdType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryIdType() {
            return primaryIdType;
        }

        /**
         * Define el valor de la propiedad primaryIdType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryIdType(String value) {
            this.primaryIdType = value;
        }

        /**
         * Obtiene el valor de la propiedad primaryIdNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryIdNumber() {
            return primaryIdNumber;
        }

        /**
         * Define el valor de la propiedad primaryIdNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryIdNumber(String value) {
            this.primaryIdNumber = value;
        }

        /**
         * Obtiene el valor de la propiedad primaryIdIssueDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPrimaryIdIssueDate() {
            return primaryIdIssueDate;
        }

        /**
         * Define el valor de la propiedad primaryIdIssueDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPrimaryIdIssueDate(XMLGregorianCalendar value) {
            this.primaryIdIssueDate = value;
        }

        /**
         * Obtiene el valor de la propiedad primaryIdExpDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPrimaryIdExpDate() {
            return primaryIdExpDate;
        }

        /**
         * Define el valor de la propiedad primaryIdExpDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPrimaryIdExpDate(XMLGregorianCalendar value) {
            this.primaryIdExpDate = value;
        }

        /**
         * Obtiene el valor de la propiedad birthDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * Define el valor de la propiedad birthDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * Obtiene el valor de la propiedad countryOfBirth.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryOfBirth() {
            return countryOfBirth;
        }

        /**
         * Define el valor de la propiedad countryOfBirth.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryOfBirth(String value) {
            this.countryOfBirth = value;
        }

        /**
         * Obtiene el valor de la propiedad nationality.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationality() {
            return nationality;
        }

        /**
         * Define el valor de la propiedad nationality.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationality(String value) {
            this.nationality = value;
        }

        /**
         * Obtiene el valor de la propiedad occupation.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOccupation() {
            return occupation;
        }

        /**
         * Define el valor de la propiedad occupation.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOccupation(String value) {
            this.occupation = value;
        }

        /**
         * Obtiene el valor de la propiedad address.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * Define el valor de la propiedad address.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * Obtiene el valor de la propiedad region.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegion() {
            return region;
        }

        /**
         * Define el valor de la propiedad region.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegion(String value) {
            this.region = value;
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
         * Obtiene el valor de la propiedad username.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Define el valor de la propiedad username.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
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
         * Obtiene el valor de la propiedad agented.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgented() {
            return agented;
        }

        /**
         * Define el valor de la propiedad agented.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgented(String value) {
            this.agented = value;
        }

        /**
         * Obtiene el valor de la propiedad ownerId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerId() {
            return ownerId;
        }

        /**
         * Define el valor de la propiedad ownerId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerId(String value) {
            this.ownerId = value;
        }

        /**
         * Obtiene el valor de la propiedad emailAddress.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailAddress() {
            return emailAddress;
        }

        /**
         * Define el valor de la propiedad emailAddress.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailAddress(String value) {
            this.emailAddress = value;
        }

        /**
         * Obtiene el valor de la propiedad alternateContact.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternateContact() {
            return alternateContact;
        }

        /**
         * Define el valor de la propiedad alternateContact.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternateContact(String value) {
            this.alternateContact = value;
        }

        /**
         * Obtiene el valor de la propiedad language.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Define el valor de la propiedad language.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Obtiene el valor de la propiedad iccid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIccid() {
            return iccid;
        }

        /**
         * Define el valor de la propiedad iccid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIccid(String value) {
            this.iccid = value;
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
         * Obtiene el valor de la propiedad profile.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfile() {
            return profile;
        }

        /**
         * Define el valor de la propiedad profile.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfile(String value) {
            this.profile = value;
        }

        /**
         * Obtiene el valor de la propiedad userType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserType() {
            return userType;
        }

        /**
         * Define el valor de la propiedad userType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserType(String value) {
            this.userType = value;
        }

        /**
         * Obtiene el valor de la propiedad groupName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupName() {
            return groupName;
        }

        /**
         * Define el valor de la propiedad groupName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupName(String value) {
            this.groupName = value;
        }

        /**
         * Obtiene el valor de la propiedad createdDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedDate() {
            return createdDate;
        }

        /**
         * Define el valor de la propiedad createdDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedDate(XMLGregorianCalendar value) {
            this.createdDate = value;
        }

        /**
         * Obtiene el valor de la propiedad deletedDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDeletedDate() {
            return deletedDate;
        }

        /**
         * Define el valor de la propiedad deletedDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDeletedDate(XMLGregorianCalendar value) {
            this.deletedDate = value;
        }

        /**
         * Obtiene el valor de la propiedad commissionDetails.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommissionDetails() {
            return commissionDetails;
        }

        /**
         * Define el valor de la propiedad commissionDetails.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommissionDetails(String value) {
            this.commissionDetails = value;
        }

        /**
         * Obtiene el valor de la propiedad minimumAmount.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinimumAmount() {
            return minimumAmount;
        }

        /**
         * Define el valor de la propiedad minimumAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinimumAmount(String value) {
            this.minimumAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad maximumAmount.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaximumAmount() {
            return maximumAmount;
        }

        /**
         * Define el valor de la propiedad maximumAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaximumAmount(String value) {
            this.maximumAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad category.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * Define el valor de la propiedad category.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * Obtiene el valor de la propiedad agentCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentCode() {
            return agentCode;
        }

        /**
         * Define el valor de la propiedad agentCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentCode(String value) {
            this.agentCode = value;
        }

        /**
         * Obtiene el valor de la propiedad additionalResults.
         * 
         * @return
         *     possible object is
         *     {@link GetUserDetailsResponse.ResponseBody.AdditionalResults }
         *     
         */
        public GetUserDetailsResponse.ResponseBody.AdditionalResults getAdditionalResults() {
            return additionalResults;
        }

        /**
         * Define el valor de la propiedad additionalResults.
         * 
         * @param value
         *     allowed object is
         *     {@link GetUserDetailsResponse.ResponseBody.AdditionalResults }
         *     
         */
        public void setAdditionalResults(GetUserDetailsResponse.ResponseBody.AdditionalResults value) {
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
