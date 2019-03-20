package systems.vostok.humexp.pry.web.service.document

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Service
@Slf4j
class SepaDocumentService {
    /*@Autowired
    WebClient webClientSepa*/

    @Autowired
    private WebClient.Builder webClientBuilder

    Mono<String> createSepa(Mono<String> request) {
        log.info('WEB: act')
        webClientBuilder.build().post()
                .uri("http://agent-sepa/api/v2/document/build")
                .body(request, String.class)
                .retrieve()
                .bodyToMono(String.class)

        /*webClientSepa.post()
                .uri('api/v2/document/build')
                .body(request, String.class)
                .retrieve()
                .bodyToMono(String.class)*/
    }
}
