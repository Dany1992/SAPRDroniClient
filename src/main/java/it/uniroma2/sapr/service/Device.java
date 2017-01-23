
package it.uniroma2.sapr.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per device complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="device">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="checkDevice" type="{http://service.sapr.uniroma2.it/}checkElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idDevice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pilotLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device", propOrder = {
    "active",
    "checkDevice",
    "idDevice",
    "model",
    "pilotLicense",
    "producer",
    "type",
    "weight"
})
public class Device {

    protected int active;
    @XmlElement(nillable = true)
    protected List<CheckElement> checkDevice;
    protected int idDevice;
    protected String model;
    protected String pilotLicense;
    protected String producer;
    protected String type;
    protected int weight;

    /**
     * Recupera il valore della proprietà active.
     * 
     */
    public int getActive() {
        return active;
    }

    /**
     * Imposta il valore della proprietà active.
     * 
     */
    public void setActive(int value) {
        this.active = value;
    }

    /**
     * Gets the value of the checkDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckElement }
     * 
     * 
     */
    public List<CheckElement> getCheckDevice() {
        if (checkDevice == null) {
            checkDevice = new ArrayList<CheckElement>();
        }
        return this.checkDevice;
    }

    /**
     * Recupera il valore della proprietà idDevice.
     * 
     */
    public int getIdDevice() {
        return idDevice;
    }

    /**
     * Imposta il valore della proprietà idDevice.
     * 
     */
    public void setIdDevice(int value) {
        this.idDevice = value;
    }

    /**
     * Recupera il valore della proprietà model.
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
     * Imposta il valore della proprietà model.
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

    /**
     * Recupera il valore della proprietà producer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Imposta il valore della proprietà producer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducer(String value) {
        this.producer = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà weight.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Imposta il valore della proprietà weight.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

}
