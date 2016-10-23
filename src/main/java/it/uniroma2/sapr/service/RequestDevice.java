
package it.uniroma2.sapr.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per requestDevice complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="requestDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.sapr.uniroma2.it/}request">
 *       &lt;sequence>
 *         &lt;element name="idDevice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="producer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pilotLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chekDevice" type="{http://service.sapr.uniroma2.it/}checkElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestDevice", propOrder = {
    "idDevice",
    "model",
    "typer",
    "weight",
    "producer",
    "pilotLicense",
    "chekDevice",
    "active"
})
public class RequestDevice
    extends Request
{

    protected int idDevice;
    protected String model;
    protected String typer;
    protected int weight;
    protected String producer;
    protected String pilotLicense;
    protected List<CheckElement> chekDevice;
    protected int active;

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
     * Recupera il valore della proprietà typer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyper() {
        return typer;
    }

    /**
     * Imposta il valore della proprietà typer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyper(String value) {
        this.typer = value;
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
     * Gets the value of the chekDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chekDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChekDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckElement }
     * 
     * 
     */
    public List<CheckElement> getChekDevice() {
        if (chekDevice == null) {
            chekDevice = new ArrayList<CheckElement>();
        }
        return this.chekDevice;
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
