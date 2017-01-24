
package it.uniroma2.sapr.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per responseListPilots complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="responseListPilots">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.sapr.uniroma2.it/}response">
 *       &lt;sequence>
 *         &lt;element name="pilots" type="{http://service.sapr.uniroma2.it/}responsePilot" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseListPilots", propOrder = {
    "pilots"
})
public class ResponseListPilots
    extends Response
{

    protected List<ResponsePilot> pilots;

    /**
     * Gets the value of the pilots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pilots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPilots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponsePilot }
     * 
     * 
     */
    public List<ResponsePilot> getPilots() {
        if (pilots == null) {
            pilots = new ArrayList<ResponsePilot>();
        }
        return this.pilots;
    }

}
