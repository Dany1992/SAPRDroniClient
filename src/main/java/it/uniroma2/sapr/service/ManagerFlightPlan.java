
package it.uniroma2.sapr.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per managerFlightPlan complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="managerFlightPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://service.sapr.uniroma2.it/}requestFlightPlan" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "managerFlightPlan", propOrder = {
    "request"
})
public class ManagerFlightPlan {

    protected RequestFlightPlan request;

    /**
     * Recupera il valore della proprietà request.
     * 
     * @return
     *     possible object is
     *     {@link RequestFlightPlan }
     *     
     */
    public RequestFlightPlan getRequest() {
        return request;
    }

    /**
     * Imposta il valore della proprietà request.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestFlightPlan }
     *     
     */
    public void setRequest(RequestFlightPlan value) {
        this.request = value;
    }

}
