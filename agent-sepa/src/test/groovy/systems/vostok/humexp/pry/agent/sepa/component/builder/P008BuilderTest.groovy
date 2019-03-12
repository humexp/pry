package systems.vostok.humexp.pry.agent.sepa.component.builder

import groovy.transform.CompileStatic
import org.junit.jupiter.api.Test
import systems.vostok.humexp.pry.agent.sepa.util.Dataset

@CompileStatic
class P008BuilderTest {
    @Test
    void builderTest() {
        String properties = Dataset.getRawDataset('builder/p008', 'simple_message_data.json')
        P008Builder builder = new P008Builder().with { it.init(); it }

        String message = builder.build(properties)

        message
    }
}
