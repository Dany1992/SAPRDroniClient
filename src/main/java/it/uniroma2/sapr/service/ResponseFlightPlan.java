
package it.uniroma2.sapr.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per responseFlightPlan complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="responseFlightPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateDeparture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeDeparture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nowArriving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSapr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idNote" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="devices" type="{http://service.sapr.uniroma2.it/}device" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pilotLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseFlightPlan", propOrder = {
    "destinations",
    "departure",
    "dateDeparture",
    "timeDeparture",
    "nowArriving",
    "idSapr",
    "idNote",
    "devices",
    "pilotLicense"
})
public class ResponseFlightPlan {

    protected String destinations;
    protected String departure;
    protected String dateDeparture;
    protected String timeDeparture;
    protected String nowArriving;
    protected int idSapr;
    protected int idNote;
    protected List<Device> devices;
    protected String pilotLicense;

    /**
     * Recupera il valore della proprietà destinations.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinations() {
        return destinations;
    }

    /**
     * Imposta il valore della proprietà destinations.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinations(String value) {
        this.destinations = value;
    }

    /**
     * Recupera il valore della proprietà departure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * Imposta il valore della proprietà departure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeparture(String value) {
        this.departure = value;
    }

    /**
     * Recupera il valore della proprietà dateDeparture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDeparture() {
        return dateDeparture;
    }

    /**
     * Imposta il valore della proprietà dateDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDeparture(String value) {
        this.dateDeparture = value;
    }

    /**
     * Recupera il valore della proprietà timeDeparture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeDeparture() {
        return timeDeparture;
    }

    /**
     * Imposta il valore della proprietà timeDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeDeparture(String value) {
        this.timeDeparture = value;
    }

    /**
     * Recupera il valore della proprietà nowArriving.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNowArriving() {
        return nowArriving;
    }

    /**
     * Imposta il valore della proprietà nowArriving.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNowArriving(String value) {
        this.nowArriving = value;
    }

    /**
     * Recupera il valore della proprietà idSapr.
     * 
     */
    public int getIdSapr() {
        return idSapr;
    }

    /**
     * Imposta il valore della proprietà idSapr.
     * 
     */
    public void setIdSapr(int value) {
        this.idSapr = value;
    }

    /**
     * Recupera il valore della proprietà idNote.
     * 
     */
    public int getIdNote() {
        return idNote;
    }

    /**
     * Imposta il valore della proprietà idNote.
     * 
     */
    public void setIdNote(int value) {
        this.idNote = value;
    }

    /**
     * Gets the value of the devices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Device }
     * 
     * 
     */
    public List<Device> getDevices() {
        if (devices == null) {
            devices = new ArrayList<Device>();
        }
        return this.devices;
    }

    /**
     * Recupera il valore della proprietà pilotLicense.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPilotLicense() {
        return pilotLicense;
    }

    /**
     * Imposta il valore della proprietà pilotLicense.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPilotLicense(String value) {
        this.pilotLicense = value;
    }

}
