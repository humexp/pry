package systems.vostok.humexp.pry.consumer.api.controller.v1

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import systems.vostok.humexp.pry.provider.dao.domain.SepaTransaction

@CompileStatic
@RestController
@RequestMapping('api/v1/access')
class AccessController {

    @RequestMapping('test')
    String test() {
        null
    }
}
