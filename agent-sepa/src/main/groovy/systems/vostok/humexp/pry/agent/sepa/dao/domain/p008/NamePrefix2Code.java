
package systems.vostok.humexp.pry.agent.sepa.dao.domain.p008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamePrefix2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NamePrefix2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOCT"/>
 *     &lt;enumeration value="MADM"/>
 *     &lt;enumeration value="MISS"/>
 *     &lt;enumeration value="MIST"/>
 *     &lt;enumeration value="MIKS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamePrefix2Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08")
@XmlEnum
public enum NamePrefix2Code {

    DOCT,
    MADM,
    MISS,
    MIST,
    MIKS;

    public String value() {
        return name();
    }

    public static NamePrefix2Code fromValue(String v) {
        return valueOf(v);
    }

}
