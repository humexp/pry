package systems.vostok.humexp.pry.agent.sepa.service

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import systems.vostok.humexp.pry.agent.sepa.component.builder.P008Builder

@Service
@Slf4j
class DocumentService {
    @Autowired
    P008Builder p008Builder

    Mono<String> createDocument(Mono<String> request) {
        log.info('SEPA: act')
        request.map({p008Builder.build(it)})
    }
}
