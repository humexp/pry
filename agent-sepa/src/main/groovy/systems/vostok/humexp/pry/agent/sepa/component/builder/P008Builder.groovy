package systems.vostok.humexp.pry.agent.sepa.component.builder

import com.fasterxml.jackson.databind.ObjectMapper
import groovy.transform.CompileStatic
import org.springframework.stereotype.Component
import systems.vostok.humexp.pry.agent.sepa.dao.domain.p008.Document

import javax.annotation.PostConstruct
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller

@CompileStatic
@Component
class P008Builder {
    ObjectMapper objectMapper

    @PostConstruct
    void init() {
        objectMapper = new ObjectMapper()

    }

    String build(String properties) {
        Document document = objectMapper.readValue(properties, Document.class)

        JAXBContext jaxbContext = JAXBContext.newInstance(Document.class)
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller()
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter sw = new StringWriter();


        jaxbMarshaller.marshal(document, sw);
        String xmlString = sw.toString();

        xmlString

        document

        ''
    }
}
