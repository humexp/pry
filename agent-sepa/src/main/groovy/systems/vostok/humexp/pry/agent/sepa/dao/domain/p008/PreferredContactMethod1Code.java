
package systems.vostok.humexp.pry.agent.sepa.dao.domain.p008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferredContactMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreferredContactMethod1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LETT"/>
 *     &lt;enumeration value="MAIL"/>
 *     &lt;enumeration value="PHON"/>
 *     &lt;enumeration value="FAXX"/>
 *     &lt;enumeration value="CELL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreferredContactMethod1Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08")
@XmlEnum
public enum PreferredContactMethod1Code {

    LETT,
    MAIL,
    PHON,
    FAXX,
    CELL;

    public String value() {
        return name();
    }

    public static PreferredContactMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
