package systems.vostok.humexp.pry.consumer.configuration

import org.glassfish.jersey.server.ResourceConfig
import org.glassfish.jersey.servlet.ServletProperties
import org.springframework.context.annotation.Configuration
import systems.vostok.humexp.pry.consumer.api.controller.v1.AccessController

@Configuration
class JerseyConfiguration extends ResourceConfig {
    JerseyConfiguration() {
        registerControllers()
        registerComponents()
        registerProviders()

        property(ServletProperties.FILTER_FORWARD_ON_404, true)
    }

    private void registerControllers() {
        register(AccessController.class)
    }

    private void registerComponents() {

    }

    private void registerProviders() {

    }
}
