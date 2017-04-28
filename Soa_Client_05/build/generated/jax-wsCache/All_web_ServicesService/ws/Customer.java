
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="alternate_contactname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buisness_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cell_number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="company_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contact_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customer_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date_entered" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="email_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fax_number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="other_number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="phone_no" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "addressId",
    "alternateContactname",
    "billingAddress",
    "buisnessName",
    "cellNumber",
    "companyName",
    "contactName",
    "customerId",
    "customerTitle",
    "customerType",
    "dateEntered",
    "emailAddress",
    "faxNumber",
    "otherNumber",
    "phoneNo"
})
public class Customer {

    @XmlElement(name = "address_id")
    protected int addressId;
    @XmlElement(name = "alternate_contactname")
    protected String alternateContactname;
    @XmlElement(name = "billing_address")
    protected String billingAddress;
    @XmlElement(name = "buisness_name")
    protected String buisnessName;
    @XmlElement(name = "cell_number")
    protected int cellNumber;
    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "contact_name")
    protected String contactName;
    @XmlElement(name = "customer_id")
    protected int customerId;
    @XmlElement(name = "customer_title")
    protected String customerTitle;
    @XmlElement(name = "customer_type")
    protected String customerType;
    @XmlElement(name = "date_entered")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEntered;
    @XmlElement(name = "email_address")
    protected String emailAddress;
    @XmlElement(name = "fax_number")
    protected int faxNumber;
    @XmlElement(name = "other_number")
    protected int otherNumber;
    @XmlElement(name = "phone_no")
    protected int phoneNo;

    /**
     * Gets the value of the addressId property.
     * 
     */
    public int getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     */
    public void setAddressId(int value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the alternateContactname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateContactname() {
        return alternateContactname;
    }

    /**
     * Sets the value of the alternateContactname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateContactname(String value) {
        this.alternateContactname = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress(String value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the buisnessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuisnessName() {
        return buisnessName;
    }

    /**
     * Sets the value of the buisnessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuisnessName(String value) {
        this.buisnessName = value;
    }

    /**
     * Gets the value of the cellNumber property.
     * 
     */
    public int getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     */
    public void setCellNumber(int value) {
        this.cellNumber = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTitle() {
        return customerTitle;
    }

    /**
     * Sets the value of the customerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTitle(String value) {
        this.customerTitle = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the dateEntered property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEntered() {
        return dateEntered;
    }

    /**
     * Sets the value of the dateEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEntered(XMLGregorianCalendar value) {
        this.dateEntered = value;
    }

    /**
     * Gets the value of the emailAddress property.
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
     * Sets the value of the emailAddress property.
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
     * Gets the value of the faxNumber property.
     * 
     */
    public int getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     */
    public void setFaxNumber(int value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the otherNumber property.
     * 
     */
    public int getOtherNumber() {
        return otherNumber;
    }

    /**
     * Sets the value of the otherNumber property.
     * 
     */
    public void setOtherNumber(int value) {
        this.otherNumber = value;
    }

    /**
     * Gets the value of the phoneNo property.
     * 
     */
    public int getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the value of the phoneNo property.
     * 
     */
    public void setPhoneNo(int value) {
        this.phoneNo = value;
    }

}
