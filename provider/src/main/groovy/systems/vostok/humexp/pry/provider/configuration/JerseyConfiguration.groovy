package systems.vostok.humexp.pry.provider.configuration

import org.glassfish.jersey.server.ResourceConfig
import org.glassfish.jersey.servlet.ServletProperties
import org.springframework.context.annotation.Configuration
import systems.vostok.humexp.pry.provider.api.controller.v1.DataJaxRsController

@Configuration
class JerseyConfiguration extends ResourceConfig {
    JerseyConfiguration() {
        registerControllers()
        registerComponents()
        registerProviders()

        property(ServletProperties.FILTER_FORWARD_ON_404, true)
    }

    private void registerControllers() {
        register(DataJaxRsController.class)
    }

    private void registerComponents() {

    }

    private void registerProviders() {

    }
}
