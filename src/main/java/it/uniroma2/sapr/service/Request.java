
package it.uniroma2.sapr.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per request complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://service.sapr.uniroma2.it/}operation" minOccurs="0"/>
 *         &lt;element name="opzione" type="{http://service.sapr.uniroma2.it/}operation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = {
    "operation",
    "opzione"
})
@XmlSeeAlso({
    RequestSAPR.class,
    RequestDevice.class,
    RequestFlightPlan.class,
    RequestPilot.class,
    RequestNote.class
})
public abstract class Request {

    @XmlSchemaType(name = "string")
    protected Operation operation;
    @XmlSchemaType(name = "string")
    protected Operation opzione;

    /**
     * Recupera il valore della proprietà operation.
     * 
     * @return
     *     possible object is
     *     {@link Operation }
     *     
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * Imposta il valore della proprietà operation.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation }
     *     
     */
    public void setOperation(Operation value) {
        this.operation = value;
    }

    /**
     * Recupera il valore della proprietà opzione.
     * 
     * @return
     *     possible object is
     *     {@link Operation }
     *     
     */
    public Operation getOpzione() {
        return opzione;
    }

    /**
     * Imposta il valore della proprietà opzione.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation }
     *     
     */
    public void setOpzione(Operation value) {
        this.opzione = value;
    }

}
