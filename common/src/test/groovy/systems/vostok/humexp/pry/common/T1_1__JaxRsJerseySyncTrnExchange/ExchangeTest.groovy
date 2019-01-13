package systems.vostok.humexp.pry.common.T1_1__JaxRsJerseySyncTrnExchange

import groovy.transform.CompileStatic
import org.junit.jupiter.api.Test
import systems.vostok.humexp.pry.common.test.diagnostic.Launcher
import systems.vostok.humexp.pry.common.test.diagnostic.dao.ActionRequest
import systems.vostok.humexp.pry.common.test.diagnostic.dao.ActionResponse

import static org.junit.jupiter.api.Assertions.*

@CompileStatic
class ExchangeTest {
    @Test
    void testExchange() {
        ActionRequest request = new ActionRequest (
                correlationId: UUID.randomUUID(),
                path: 'T1_1__JaxRsJerseySyncTrnExchange'
        )

        ActionResponse response = Launcher.construct('consumer_launcher_settings')
            .executeAction(request)

        assertEquals(request.correlationId, response.correlationId)
    }
}
