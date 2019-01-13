package systems.vostok.humexp.pry.provider.api.controller.v1

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import systems.vostok.humexp.pry.provider.dao.domain.SepaTransaction
import systems.vostok.humexp.pry.provider.service.DataProvider

@CompileStatic
@RestController
@RequestMapping('api/v1/data')
class DataSpringController {
    @Autowired
    DataProvider dataProvider

    @RequestMapping('transactions/all')
    List<SepaTransaction> index() {
        dataProvider.getTransactions()
    }
}
