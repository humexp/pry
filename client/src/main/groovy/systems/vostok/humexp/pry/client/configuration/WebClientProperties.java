package systems.vostok.humexp.pry.client.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("web.client")
public class WebClientProperties {
    private String host;
}
