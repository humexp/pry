package systems.vostok.humexp.pry.agent.sepa.api.controller.v1

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping('api/v1/service')
class ServiceController {
    @GetMapping
    @ResponseBody
    @RequestMapping('status')
    String get() {
        'test'
    }
}
