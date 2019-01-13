package systems.vostok.humexp.pry.provider.service

import org.springframework.stereotype.Service
import systems.vostok.humexp.pry.provider.dao.domain.SepaTransaction

@Service
class DataProvider {
    List<SepaTransaction> getTransactions() {
        [new SepaTransaction(id: UUID.randomUUID(), content: 'content')]
    }
}
