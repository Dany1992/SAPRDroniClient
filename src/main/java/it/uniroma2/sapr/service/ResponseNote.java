
package it.uniroma2.sapr.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per responseNote complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="responseNote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idNote" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="textNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseNote", propOrder = {
    "idNote",
    "textNote",
    "date"
})
public class ResponseNote {

    protected int idNote;
    protected String textNote;
    protected String date;

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
     * Recupera il valore della proprietà textNote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextNote() {
        return textNote;
    }

    /**
     * Imposta il valore della proprietà textNote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextNote(String value) {
        this.textNote = value;
    }

    /**
     * Recupera il valore della proprietà date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Imposta il valore della proprietà date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

}
