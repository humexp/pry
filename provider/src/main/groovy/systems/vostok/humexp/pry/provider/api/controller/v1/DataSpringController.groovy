package systems.vostok.humexp.pry.provider.api.controller.v1

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import systems.vostok.humexp.pry.common.dao.domain.CommonRequest
import systems.vostok.humexp.pry.common.dao.domain.Transaction
import systems.vostok.humexp.pry.provider.service.DataProvider

@CompileStatic
@RestController
@RequestMapping('api/v1/spring/data')
class DataSpringController {
    @Autowired
    DataProvider dataProvider


    @PostMapping('transactions/all')
    List<Transaction> getTransactions(@RequestBody CommonRequest request) {
        dataProvider.getTransactions(request.properties.num as Integer)
    }
}
