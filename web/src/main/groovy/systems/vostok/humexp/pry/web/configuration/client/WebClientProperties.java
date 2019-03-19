package systems.vostok.humexp.pry.web.configuration.client;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("web.client")
public class WebClientProperties {
    private Sepa sepa;

    @Data
    public static class Sepa {
        private String host;
    }
}
