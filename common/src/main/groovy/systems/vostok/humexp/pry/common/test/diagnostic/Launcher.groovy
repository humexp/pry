package systems.vostok.humexp.pry.common.test.diagnostic

import groovy.json.JsonSlurper
import groovy.transform.Canonical
import groovy.transform.CompileStatic
import systems.vostok.humexp.pry.common.test.diagnostic.dao.ActionRequest
import systems.vostok.humexp.pry.common.test.diagnostic.dao.ActionResponse
import systems.vostok.humexp.pry.common.test.diagnostic.dao.MetricsResponse

import javax.ws.rs.client.Client
import javax.ws.rs.client.ClientBuilder
import javax.ws.rs.client.Entity
import javax.ws.rs.client.WebTarget
import javax.ws.rs.core.MediaType

@Canonical
@CompileStatic
class Launcher {
    String url
    String login
    String password

    private Client client
    private WebTarget webTarget

    static Launcher construct(String propertiesName) {
        Launcher r = getProperties(propertiesName) as Launcher

        r.client = ClientBuilder.newClient()
        r.webTarget = r.client.target(r.url)

        r
    }

    ActionResponse executeAction(ActionRequest actionRequest) {
        webTarget.path(actionRequest.path)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(actionRequest, MediaType.APPLICATION_JSON), ActionResponse.class)
    }

    MetricsResponse getMetricsFor(ActionRequest actionRequest) {
        null
    }

    static Map getProperties(String propertiesName) {
        Launcher.getResource("/${propertiesName}.json").getText()
            .with { new JsonSlurper().parseText(it) as Map }
    }
}

