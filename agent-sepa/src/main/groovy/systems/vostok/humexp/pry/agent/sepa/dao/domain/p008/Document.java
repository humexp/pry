
package systems.vostok.humexp.pry.agent.sepa.dao.domain.p008;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Document complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FIToFICstmrCdtTrf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}FIToFICustomerCreditTransferV08"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(XmlAccessType.NONE)
public class Document {
    @JsonProperty("fiToFICstmrCdtTrf")
    @XmlElement(name = "FIToFICstmrCdtTrf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", required = true)
    protected FIToFICustomerCreditTransferV08 fiToFICstmrCdtTrf;

    /**
     * Gets the value of the fiToFICstmrCdtTrf property.
     *
     * @return possible object is
     * {@link FIToFICustomerCreditTransferV08 }
     */
    public FIToFICustomerCreditTransferV08 getFIToFICstmrCdtTrf() {
        return fiToFICstmrCdtTrf;
    }

    /**
     * Sets the value of the fiToFICstmrCdtTrf property.
     *
     * @param value allowed object is
     *              {@link FIToFICustomerCreditTransferV08 }
     */
    public void setFIToFICstmrCdtTrf(FIToFICustomerCreditTransferV08 value) {
        this.fiToFICstmrCdtTrf = value;
    }
}
