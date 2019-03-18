package systems.vostok.humexp.pry.client.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfiguration {
    @Autowired
    WebClientProperties properties;

    @Bean
    public WebClient webClient() {
        return WebClient.create(properties.getHost());
    }
}
