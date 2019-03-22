package systems.vostok.humexp.pry.web.service.document

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Service
@Slf4j
class SepaDocumentService {
    @Autowired
    WebClient webClientSepa

    Mono<String> createSepa(Mono<String> request) {
        log.info('WEB: act')
        webClientSepa.post()
                .uri('api/v2/document/build')
                .body(request, String.class)
                .retrieve()
                .bodyToMono(String.class)
    }
}
