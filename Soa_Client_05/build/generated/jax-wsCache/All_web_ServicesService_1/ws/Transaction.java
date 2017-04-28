
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="driver_price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="employee_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="make" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="price_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="run_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="special" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surcharge" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="transaction_amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="transaction_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="transaction_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transaction_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="truck_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="unit_price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction", propOrder = {
    "discount",
    "driverPrice",
    "employeeId",
    "make",
    "model",
    "orderId",
    "priceId",
    "quality",
    "rate",
    "runNumber",
    "special",
    "surcharge",
    "transactionAmount",
    "transactionDate",
    "transactionDescription",
    "transactionId",
    "truckId",
    "unitPrice",
    "vin",
    "year"
})
public class Transaction {

    protected double discount;
    @XmlElement(name = "driver_price")
    protected double driverPrice;
    @XmlElement(name = "employee_id")
    protected int employeeId;
    protected String make;
    protected String model;
    @XmlElement(name = "order_id")
    protected int orderId;
    @XmlElement(name = "price_id")
    protected int priceId;
    protected String quality;
    protected double rate;
    @XmlElement(name = "run_number")
    protected String runNumber;
    protected String special;
    protected double surcharge;
    @XmlElement(name = "transaction_amount")
    protected double transactionAmount;
    @XmlElement(name = "transaction_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "transaction_description")
    protected String transactionDescription;
    @XmlElement(name = "transaction_id")
    protected int transactionId;
    @XmlElement(name = "truck_id")
    protected int truckId;
    @XmlElement(name = "unit_price")
    protected double unitPrice;
    protected String vin;
    protected int year;

    /**
     * Gets the value of the discount property.
     * 
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     */
    public void setDiscount(double value) {
        this.discount = value;
    }

    /**
     * Gets the value of the driverPrice property.
     * 
     */
    public double getDriverPrice() {
        return driverPrice;
    }

    /**
     * Sets the value of the driverPrice property.
     * 
     */
    public void setDriverPrice(double value) {
        this.driverPrice = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     */
    public void setEmployeeId(int value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the priceId property.
     * 
     */
    public int getPriceId() {
        return priceId;
    }

    /**
     * Sets the value of the priceId property.
     * 
     */
    public void setPriceId(int value) {
        this.priceId = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuality(String value) {
        this.quality = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     */
    public double getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     */
    public void setRate(double value) {
        this.rate = value;
    }

    /**
     * Gets the value of the runNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunNumber() {
        return runNumber;
    }

    /**
     * Sets the value of the runNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunNumber(String value) {
        this.runNumber = value;
    }

    /**
     * Gets the value of the special property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecial() {
        return special;
    }

    /**
     * Sets the value of the special property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecial(String value) {
        this.special = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     */
    public double getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     */
    public void setSurcharge(double value) {
        this.surcharge = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     */
    public void setTransactionAmount(double value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * Sets the value of the transactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDescription(String value) {
        this.transactionDescription = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(int value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the truckId property.
     * 
     */
    public int getTruckId() {
        return truckId;
    }

    /**
     * Sets the value of the truckId property.
     * 
     */
    public void setTruckId(int value) {
        this.truckId = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     */
    public void setUnitPrice(double value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
