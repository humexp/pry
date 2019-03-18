package systems.vostok.humexp.pry.agent.sepa.api.controller.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import systems.vostok.humexp.pry.agent.sepa.service.DocumentService;

@RestController
@RequestMapping(path = "api/v2/document", produces = "application/json")
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @PostMapping("build")
    public Mono<String> buildSepa(@RequestBody Mono<String> request) {
        return documentService.createDocument(request);
    }
}
