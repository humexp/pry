package systems.vostok.humexp.pry.web.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfiguration {
    @Autowired
    WebClientProperties properties;

    @Bean
    public WebClient webClientSepa() {
        return WebClient.create(properties.getSepa().getHost());
    }
}
