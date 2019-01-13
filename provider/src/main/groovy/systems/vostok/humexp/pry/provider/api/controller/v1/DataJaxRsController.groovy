package systems.vostok.humexp.pry.provider.api.controller.v1

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import systems.vostok.humexp.pry.common.dao.domain.Transaction
import systems.vostok.humexp.pry.provider.service.DataProvider


@RestController
@CompileStatic
@RequestMapping('api/v1/data')
class DataJaxRsController {
    @Autowired
    DataProvider dataProvider

    @RequestMapping('transactions/all')
    List<Transaction> getTransactions() {
        dataProvider.getTransactions(null)
    }
}
