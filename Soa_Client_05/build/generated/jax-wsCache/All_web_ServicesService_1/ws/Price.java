
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for price complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="price"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location_code_from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location_code_to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="location_id_from" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="location_id_to" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "price", propOrder = {
    "locationCodeFrom",
    "locationCodeTo",
    "locationId",
    "locationIdFrom",
    "locationIdTo",
    "price",
    "priceId"
})
public class Price {

    @XmlElement(name = "location_code_from")
    protected String locationCodeFrom;
    @XmlElement(name = "location_code_to")
    protected String locationCodeTo;
    @XmlElement(name = "location_id")
    protected int locationId;
    @XmlElement(name = "location_id_from")
    protected int locationIdFrom;
    @XmlElement(name = "location_id_to")
    protected int locationIdTo;
    protected String price;
    @XmlElement(name = "price_id")
    protected int priceId;

    /**
     * Gets the value of the locationCodeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCodeFrom() {
        return locationCodeFrom;
    }

    /**
     * Sets the value of the locationCodeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCodeFrom(String value) {
        this.locationCodeFrom = value;
    }

    /**
     * Gets the value of the locationCodeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCodeTo() {
        return locationCodeTo;
    }

    /**
     * Sets the value of the locationCodeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCodeTo(String value) {
        this.locationCodeTo = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     */
    public void setLocationId(int value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the locationIdFrom property.
     * 
     */
    public int getLocationIdFrom() {
        return locationIdFrom;
    }

    /**
     * Sets the value of the locationIdFrom property.
     * 
     */
    public void setLocationIdFrom(int value) {
        this.locationIdFrom = value;
    }

    /**
     * Gets the value of the locationIdTo property.
     * 
     */
    public int getLocationIdTo() {
        return locationIdTo;
    }

    /**
     * Sets the value of the locationIdTo property.
     * 
     */
    public void setLocationIdTo(int value) {
        this.locationIdTo = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
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

}
