package systems.vostok.humexp.pry.agent.sepa.component.builder

import com.fasterxml.jackson.databind.ObjectMapper
import groovy.transform.CompileStatic
import org.springframework.stereotype.Component
import systems.vostok.humexp.pry.agent.sepa.dao.domain.p008.Document

import javax.annotation.PostConstruct

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

        document

        ''
    }
}
