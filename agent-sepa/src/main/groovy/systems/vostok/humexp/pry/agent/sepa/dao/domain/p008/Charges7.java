
package systems.vostok.humexp.pry.agent.sepa.dao.domain.p008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Charges7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Charges7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}ActiveOrHistoricCurrencyAndAmount"/>
 *         &lt;element name="Agt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}BranchAndFinancialInstitutionIdentification6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charges7", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", propOrder = {
    "amt",
    "agt"
})
public class Charges7 {

    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "Agt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", required = true)
    protected BranchAndFinancialInstitutionIdentification6 agt;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the agt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAgt() {
        return agt;
    }

    /**
     * Sets the value of the agt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.agt = value;
    }

}
