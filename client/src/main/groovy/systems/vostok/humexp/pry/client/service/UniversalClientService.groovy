package systems.vostok.humexp.pry.client.service

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.io.Resource
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler
import org.springframework.scheduling.support.CronTrigger
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

import javax.annotation.PostConstruct

@Service
@CompileStatic
@Slf4j
class UniversalClientService {
    @Autowired
    WebClient webClient

    @Value('classpath:messages/sepa/message_data.json')
    Resource sepaRequestData

    @Value('${request.sepa.single.cron}')
    String crone

    @Autowired
    ThreadPoolTaskScheduler scheduler

    @PostConstruct
    void init() {
        100.times { int schedulerId ->
            scheduler.schedule({ executeSendSingleSepaRequest(schedulerId) }, new CronTrigger(crone))
        }
    }

    /*@PostConstruct
    void init() {
        100.times { int schedulerId ->
            executeSendSingleSepaRequest(schedulerId)
        }
    }*/

    void executeSendSingleSepaRequest(int schedulerId) {
        log.info('CLIENT SEPA {}: start', schedulerId)

        Mono<String> requestBody = Mono.just(sepaRequestData.inputStream.getText())

        Mono<String> result = webClient.put()
                .uri('api/v2/document/sepa')
                .body(requestBody, String.class)
                .retrieve()
                .bodyToMono(String.class)

        result.subscribe({
            log.info('CLIENT SEPA {}: act', schedulerId)
        })

        log.info('CLIENT SEPA {}: finish', schedulerId)
    }
}
