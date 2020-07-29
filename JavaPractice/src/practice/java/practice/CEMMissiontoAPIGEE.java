
package practice.java.practice;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mission" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CustomerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HTMLBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MissionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MissionType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MissionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SendByEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="SendBySMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="SMSText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Task" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AppointmentFinish" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;pattern value="[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}"/>
 *                                   &lt;pattern value=""/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AppointmentStart" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;pattern value="[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}"/>
 *                                   &lt;pattern value=""/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Area" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AssignedEngineerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CallID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="District" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="MCBillingAccountInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MCCustomerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MCCustomerIdentityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MCWorkPackageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="Region" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Status" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TaskTypeCategory" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="WorkOrderItem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="WorkOrderItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="WorkOrderItemNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *       &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
                "mission"
})
@XmlRootElement(name = "CEMMissiontoAPIGEE", namespace = "")
public class CEMMissiontoAPIGEE {

    @XmlElement(name = "Mission")
    protected practice.java.practice.CEMMissiontoAPIGEE.Mission mission;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "CreatedBy")
    protected String createdBy;
    @XmlAttribute(name = "Action")
    protected String action;

    /**
     * Gets the value of the mission property.
     *
     * @return
     *     possible object is
     *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission }
     *
     */
    public practice.java.practice.CEMMissiontoAPIGEE.Mission getMission() {
        return mission;
    }

    /**
     * Sets the value of the mission property.
     *
     * @param value
     *     allowed object is
     *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission }
     *
     */
    public void setMission(practice.java.practice.CEMMissiontoAPIGEE.Mission value) {
        this.mission = value;
    }

    /**
     * Gets the value of the destination property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the createdBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the action property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAction(String value) {
        this.action = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CustomerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HTMLBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MissionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MissionType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MissionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SendByEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="SendBySMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="SMSText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Task" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AppointmentFinish" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;pattern value="[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}"/>
     *                         &lt;pattern value=""/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AppointmentStart" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;pattern value="[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}"/>
     *                         &lt;pattern value=""/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Area" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AssignedEngineerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CallID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="District" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="MCBillingAccountInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MCCustomerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MCCustomerIdentityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MCWorkPackageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="Region" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Status" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TaskTypeCategory" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="WorkOrderItem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="WorkOrderItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="WorkOrderItemNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                    "customerEmail",
                    "customerPhoneNumber",
                    "errorMessage",
                    "htmlBody",
                    "missionID",
                    "missionType",
                    "missionURL",
                    "sendByEmail",
                    "sendBySMS",
                    "smsText",
                    "task"
    })
    public static class Mission {

        @XmlElement(name = "CustomerEmail")
        protected String customerEmail;
        @XmlElement(name = "CustomerPhoneNumber")
        protected String customerPhoneNumber;
        @XmlElement(name = "ErrorMessage")
        protected String errorMessage;
        @XmlElement(name = "HTMLBody")
        protected String htmlBody;
        @XmlElement(name = "MissionID")
        protected String missionID;
        @XmlElement(name = "MissionType")
        protected practice.java.practice.CEMMissiontoAPIGEE.Mission.MissionType missionType;
        @XmlElement(name = "MissionURL")
        protected String missionURL;
        @XmlElement(name = "SendByEmail")
        protected Boolean sendByEmail;
        @XmlElement(name = "SendBySMS")
        protected Boolean sendBySMS;
        @XmlElement(name = "SMSText")
        protected String smsText;
        @XmlElement(name = "Task")
        protected practice.java.practice.CEMMissiontoAPIGEE.Mission.Task task;

        /**
         * Gets the value of the customerEmail property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCustomerEmail() {
            return customerEmail;
        }

        /**
         * Sets the value of the customerEmail property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCustomerEmail(String value) {
            this.customerEmail = value;
        }

        /**
         * Gets the value of the customerPhoneNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }

        /**
         * Sets the value of the customerPhoneNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCustomerPhoneNumber(String value) {
            this.customerPhoneNumber = value;
        }

        /**
         * Gets the value of the errorMessage property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getErrorMessage() {
            return errorMessage;
        }

        /**
         * Sets the value of the errorMessage property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setErrorMessage(String value) {
            this.errorMessage = value;
        }

        /**
         * Gets the value of the htmlBody property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getHTMLBody() {
            return htmlBody;
        }

        /**
         * Sets the value of the htmlBody property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setHTMLBody(String value) {
            this.htmlBody = value;
        }

        /**
         * Gets the value of the missionID property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMissionID() {
            return missionID;
        }

        /**
         * Sets the value of the missionID property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMissionID(String value) {
            this.missionID = value;
        }

        /**
         * Gets the value of the missionType property.
         *
         * @return
         *     possible object is
         *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.MissionType }
         *
         */
        public practice.java.practice.CEMMissiontoAPIGEE.Mission.MissionType getMissionType() {
            return missionType;
        }

        /**
         * Sets the value of the missionType property.
         *
         * @param value
         *     allowed object is
         *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.MissionType }
         *
         */
        public void setMissionType(practice.java.practice.CEMMissiontoAPIGEE.Mission.MissionType value) {
            this.missionType = value;
        }

        /**
         * Gets the value of the missionURL property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMissionURL() {
            return missionURL;
        }

        /**
         * Sets the value of the missionURL property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMissionURL(String value) {
            this.missionURL = value;
        }

        /**
         * Gets the value of the sendByEmail property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isSendByEmail() {
            return sendByEmail;
        }

        /**
         * Sets the value of the sendByEmail property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setSendByEmail(Boolean value) {
            this.sendByEmail = value;
        }

        /**
         * Gets the value of the sendBySMS property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isSendBySMS() {
            return sendBySMS;
        }

        /**
         * Sets the value of the sendBySMS property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setSendBySMS(Boolean value) {
            this.sendBySMS = value;
        }

        /**
         * Gets the value of the smsText property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSMSText() {
            return smsText;
        }

        /**
         * Sets the value of the smsText property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSMSText(String value) {
            this.smsText = value;
        }

        /**
         * Gets the value of the task property.
         *
         * @return
         *     possible object is
         *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task }
         *
         */
        public practice.java.practice.CEMMissiontoAPIGEE.Mission.Task getTask() {
            return task;
        }

        /**
         * Sets the value of the task property.
         *
         * @param value
         *     allowed object is
         *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task }
         *
         */
        public void setTask(practice.java.practice.CEMMissiontoAPIGEE.Mission.Task value) {
            this.task = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "name"
        })
        public static class MissionType {

            @XmlElement(name = "Name")
            protected String name;

            /**
             * Gets the value of the name property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AppointmentFinish" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;pattern value="[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}"/>
         *               &lt;pattern value=""/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AppointmentStart" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;pattern value="[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}"/>
         *               &lt;pattern value=""/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Area" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AssignedEngineerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CallID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="District" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="MCBillingAccountInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MCCustomerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MCCustomerIdentityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MCWorkPackageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="Region" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Status" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TaskTypeCategory" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="WorkOrderItem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="WorkOrderItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="WorkOrderItemNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                        "appointmentFinish",
                        "appointmentStart",
                        "area",
                        "assignedEngineerName",
                        "callID",
                        "customer",
                        "district",
                        "duration",
                        "mcBillingAccountInfo",
                        "mcCustomerCode",
                        "mcCustomerIdentityNumber",
                        "mcWorkPackageDescription",
                        "number",
                        "region",
                        "status",
                        "taskTypeCategory",
                        "workOrderItem"
        })
        public static class Task {

            @XmlElement(name = "AppointmentFinish")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String appointmentFinish;
            @XmlElement(name = "AppointmentStart")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String appointmentStart;
            @XmlElement(name = "Area")
            protected practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Area area;
            @XmlElement(name = "AssignedEngineerName")
            protected String assignedEngineerName;
            @XmlElement(name = "CallID")
            protected String callID;
            @XmlElement(name = "Customer")
            protected String customer;
            @XmlElement(name = "District")
            protected practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.District district;
            @XmlElement(name = "Duration")
            protected Integer duration;
            @XmlElement(name = "MCBillingAccountInfo")
            protected String mcBillingAccountInfo;
            @XmlElement(name = "MCCustomerCode")
            protected String mcCustomerCode;
            @XmlElement(name = "MCCustomerIdentityNumber")
            protected String mcCustomerIdentityNumber;
            @XmlElement(name = "MCWorkPackageDescription")
            protected String mcWorkPackageDescription;
            @XmlElement(name = "Number")
            protected Integer number;
            @XmlElement(name = "Region")
            protected practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Region region;
            @XmlElement(name = "Status")
            protected practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Status status;
            @XmlElement(name = "TaskTypeCategory")
            protected practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.TaskTypeCategory taskTypeCategory;
            @XmlElement(name = "WorkOrderItem")
            protected practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.WorkOrderItem workOrderItem;

            /**
             * Gets the value of the appointmentFinish property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAppointmentFinish() {
                return appointmentFinish;
            }

            /**
             * Sets the value of the appointmentFinish property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAppointmentFinish(String value) {
                this.appointmentFinish = value;
            }

            /**
             * Gets the value of the appointmentStart property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAppointmentStart() {
                return appointmentStart;
            }

            /**
             * Sets the value of the appointmentStart property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAppointmentStart(String value) {
                this.appointmentStart = value;
            }

            /**
             * Gets the value of the area property.
             *
             * @return
             *     possible object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Area }
             *
             */
            public practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Area getArea() {
                return area;
            }

            /**
             * Sets the value of the area property.
             *
             * @param value
             *     allowed object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Area }
             *
             */
            public void setArea(practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Area value) {
                this.area = value;
            }

            /**
             * Gets the value of the assignedEngineerName property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAssignedEngineerName() {
                return assignedEngineerName;
            }

            /**
             * Sets the value of the assignedEngineerName property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAssignedEngineerName(String value) {
                this.assignedEngineerName = value;
            }

            /**
             * Gets the value of the callID property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCallID() {
                return callID;
            }

            /**
             * Sets the value of the callID property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCallID(String value) {
                this.callID = value;
            }

            /**
             * Gets the value of the customer property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCustomer() {
                return customer;
            }

            /**
             * Sets the value of the customer property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCustomer(String value) {
                this.customer = value;
            }

            /**
             * Gets the value of the district property.
             *
             * @return
             *     possible object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.District }
             *
             */
            public practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.District getDistrict() {
                return district;
            }

            /**
             * Sets the value of the district property.
             *
             * @param value
             *     allowed object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.District }
             *
             */
            public void setDistrict(practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.District value) {
                this.district = value;
            }

            /**
             * Gets the value of the duration property.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getDuration() {
                return duration;
            }

            /**
             * Sets the value of the duration property.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setDuration(Integer value) {
                this.duration = value;
            }

            /**
             * Gets the value of the mcBillingAccountInfo property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMCBillingAccountInfo() {
                return mcBillingAccountInfo;
            }

            /**
             * Sets the value of the mcBillingAccountInfo property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMCBillingAccountInfo(String value) {
                this.mcBillingAccountInfo = value;
            }

            /**
             * Gets the value of the mcCustomerCode property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMCCustomerCode() {
                return mcCustomerCode;
            }

            /**
             * Sets the value of the mcCustomerCode property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMCCustomerCode(String value) {
                this.mcCustomerCode = value;
            }

            /**
             * Gets the value of the mcCustomerIdentityNumber property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMCCustomerIdentityNumber() {
                return mcCustomerIdentityNumber;
            }

            /**
             * Sets the value of the mcCustomerIdentityNumber property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMCCustomerIdentityNumber(String value) {
                this.mcCustomerIdentityNumber = value;
            }

            /**
             * Gets the value of the mcWorkPackageDescription property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMCWorkPackageDescription() {
                return mcWorkPackageDescription;
            }

            /**
             * Sets the value of the mcWorkPackageDescription property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMCWorkPackageDescription(String value) {
                this.mcWorkPackageDescription = value;
            }

            /**
             * Gets the value of the number property.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setNumber(Integer value) {
                this.number = value;
            }

            /**
             * Gets the value of the region property.
             *
             * @return
             *     possible object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Region }
             *
             */
            public practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Region getRegion() {
                return region;
            }

            /**
             * Sets the value of the region property.
             *
             * @param value
             *     allowed object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Region }
             *
             */
            public void setRegion(practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Region value) {
                this.region = value;
            }

            /**
             * Gets the value of the status property.
             *
             * @return
             *     possible object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Status }
             *
             */
            public practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Status getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             *
             * @param value
             *     allowed object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Status }
             *
             */
            public void setStatus(practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.Status value) {
                this.status = value;
            }

            /**
             * Gets the value of the taskTypeCategory property.
             *
             * @return
             *     possible object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.TaskTypeCategory }
             *
             */
            public practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.TaskTypeCategory getTaskTypeCategory() {
                return taskTypeCategory;
            }

            /**
             * Sets the value of the taskTypeCategory property.
             *
             * @param value
             *     allowed object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.TaskTypeCategory }
             *
             */
            public void setTaskTypeCategory(practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.TaskTypeCategory value) {
                this.taskTypeCategory = value;
            }

            /**
             * Gets the value of the workOrderItem property.
             *
             * @return
             *     possible object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.WorkOrderItem }
             *
             */
            public practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.WorkOrderItem getWorkOrderItem() {
                return workOrderItem;
            }

            /**
             * Sets the value of the workOrderItem property.
             *
             * @param value
             *     allowed object is
             *     {@link practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.WorkOrderItem }
             *
             */
            public void setWorkOrderItem(practice.java.practice.CEMMissiontoAPIGEE.Mission.Task.WorkOrderItem value) {
                this.workOrderItem = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                            "name"
            })
            public static class Area {

                @XmlElement(name = "Name")
                protected String name;

                /**
                 * Gets the value of the name property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                            "name"
            })
            public static class District {

                @XmlElement(name = "Name")
                protected String name;

                /**
                 * Gets the value of the name property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                            "name"
            })
            public static class Region {

                @XmlElement(name = "Name")
                protected String name;

                /**
                 * Gets the value of the name property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                            "key",
                            "name"
            })
            public static class Status {

                @XmlElement(name = "Key")
                protected Integer key;
                @XmlElement(name = "Name")
                protected String name;

                /**
                 * Gets the value of the key property.
                 *
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *
                 */
                public Integer getKey() {
                    return key;
                }

                /**
                 * Sets the value of the key property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *
                 */
                public void setKey(Integer value) {
                    this.key = value;
                }

                /**
                 * Gets the value of the name property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                            "name"
            })
            public static class TaskTypeCategory {

                @XmlElement(name = "Name")
                protected String name;

                /**
                 * Gets the value of the name property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="WorkOrderItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="WorkOrderItemNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                            "description",
                            "workOrderItemID",
                            "workOrderItemNumber"
            })
            public static class WorkOrderItem {

                @XmlElement(name = "Description")
                protected String description;
                @XmlElement(name = "WorkOrderItemID")
                protected String workOrderItemID;
                @XmlElement(name = "WorkOrderItemNumber")
                protected Integer workOrderItemNumber;

                /**
                 * Gets the value of the description property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

                /**
                 * Gets the value of the workOrderItemID property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getWorkOrderItemID() {
                    return workOrderItemID;
                }

                /**
                 * Sets the value of the workOrderItemID property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setWorkOrderItemID(String value) {
                    this.workOrderItemID = value;
                }

                /**
                 * Gets the value of the workOrderItemNumber property.
                 *
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *
                 */
                public Integer getWorkOrderItemNumber() {
                    return workOrderItemNumber;
                }

                /**
                 * Sets the value of the workOrderItemNumber property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *
                 */
                public void setWorkOrderItemNumber(Integer value) {
                    this.workOrderItemNumber = value;
                }

            }

        }

    }

}
