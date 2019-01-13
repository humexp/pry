package systems.vostok.humexp.pry.provider.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import systems.vostok.humexp.pry.common.dao.domain.Transaction
import systems.vostok.humexp.pry.provider.component.SyncTransactionBuilder

@Service
class DataProvider {
    @Autowired
    SyncTransactionBuilder syncTrnBuilder

    List<Transaction> getTransactions(Integer numOfTransactions) {
        syncTrnBuilder.buildTransactions(numOfTransactions)
    }
}
