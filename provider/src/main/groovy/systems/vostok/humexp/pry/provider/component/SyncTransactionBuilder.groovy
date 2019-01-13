package systems.vostok.humexp.pry.provider.component

import groovy.transform.CompileStatic
import org.springframework.stereotype.Component
import systems.vostok.humexp.pry.common.dao.domain.Transaction

@Component
@CompileStatic
class SyncTransactionBuilder {
    static List<Transaction> buildTransactions(Integer num) {
        (0..num).collect {
            UUID commonTrnId = UUID.randomUUID()
            new Transaction(id: commonTrnId, content: generateTrnContent(commonTrnId))
        }
    }

    static String generateTrnContent(UUID commonTrnId) {
        // Trn generation latency
        sleep(200)
        'trn content'
    }
}
