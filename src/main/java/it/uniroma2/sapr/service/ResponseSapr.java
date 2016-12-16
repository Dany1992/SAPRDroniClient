
package it.uniroma2.sapr.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per responseSapr complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="responseSapr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSapr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="heavyweight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="battery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxDistance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pilotLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkSapr" type="{http://service.sapr.uniroma2.it/}responseCheckElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseSapr", propOrder = {
    "idSapr",
    "model",
    "producer",
    "weight",
    "heavyweight",
    "battery",
    "maxDistance",
    "maxHeight",
    "pilotLicense",
    "checkSapr",
    "active"
})
public class ResponseSapr {

    protected int idSapr;
    protected String model;
    protected String producer;
    protected int weight;
    protected int heavyweight;
    protected String battery;
    protected int maxDistance;
    protected int maxHeight;
    protected String pilotLicense;
    protected List<ResponseCheckElement> checkSapr;
    protected int active;

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

    /**
     * Recupera il valore della proprietà heavyweight.
     * 
     */
    public int getHeavyweight() {
        return heavyweight;
    }

    /**
     * Imposta il valore della proprietà heavyweight.
     * 
     */
    public void setHeavyweight(int value) {
        this.heavyweight = value;
    }

    /**
     * Recupera il valore della proprietà battery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBattery() {
        return battery;
    }

    /**
     * Imposta il valore della proprietà battery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBattery(String value) {
        this.battery = value;
    }

    /**
     * Recupera il valore della proprietà maxDistance.
     * 
     */
    public int getMaxDistance() {
        return maxDistance;
    }

    /**
     * Imposta il valore della proprietà maxDistance.
     * 
     */
    public void setMaxDistance(int value) {
        this.maxDistance = value;
    }

    /**
     * Recupera il valore della proprietà maxHeight.
     * 
     */
    public int getMaxHeight() {
        return maxHeight;
    }

    /**
     * Imposta il valore della proprietà maxHeight.
     * 
     */
    public void setMaxHeight(int value) {
        this.maxHeight = value;
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
     * Gets the value of the checkSapr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkSapr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckSapr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseCheckElement }
     * 
     * 
     */
    public List<ResponseCheckElement> getCheckSapr() {
        if (checkSapr == null) {
            checkSapr = new ArrayList<ResponseCheckElement>();
        }
        return this.checkSapr;
    }

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

}
