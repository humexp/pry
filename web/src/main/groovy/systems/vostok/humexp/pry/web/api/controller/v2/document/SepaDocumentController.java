package systems.vostok.humexp.pry.web.api.controller.v2.document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import systems.vostok.humexp.pry.web.service.document.SepaDocumentService;

@RestController
@RequestMapping(path = "api/v2/document/sepa", produces = "application/json")
public class SepaDocumentController {
    @Autowired
    private SepaDocumentService sepaDocumentService;

    @PutMapping
    public Mono<String> createSepa(@RequestBody Mono<String> request) {
        return sepaDocumentService.createSepa(request);
    }
}
