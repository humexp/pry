package systems.vostok.humexp.pry.consumer.service

import org.springframework.stereotype.Service
import systems.vostok.humexp.pry.common.dao.domain.Transaction

@Service
class DataConsumer {
    List<Transaction> getTransactions() {
        [new Transaction(id: UUID.randomUUID(), content: 'content')]
    }
}
