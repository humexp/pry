
package systems.vostok.humexp.pry.agent.sepa.dao.domain.p008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchAndFinancialInstitutionIdentification6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchAndFinancialInstitutionIdentification6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}FinancialInstitutionIdentification18"/>
 *         &lt;element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}BranchData3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification6", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", propOrder = {
    "finInstnId",
    "brnchId"
})
public class BranchAndFinancialInstitutionIdentification6 {

    @XmlElement(name = "FinInstnId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", required = true)
    protected FinancialInstitutionIdentification18 finInstnId;
    @XmlElement(name = "BrnchId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08")
    protected BranchData3 brnchId;

    /**
     * Gets the value of the finInstnId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification18 }
     *     
     */
    public FinancialInstitutionIdentification18 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Sets the value of the finInstnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification18 }
     *     
     */
    public void setFinInstnId(FinancialInstitutionIdentification18 value) {
        this.finInstnId = value;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData3 }
     *     
     */
    public BranchData3 getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData3 }
     *     
     */
    public void setBrnchId(BranchData3 value) {
        this.brnchId = value;
    }

}
