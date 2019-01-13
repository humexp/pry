package systems.vostok.humexp.pry.consumer.api.controller.v1

import groovy.transform.CompileStatic
import systems.vostok.humexp.pry.common.test.diagnostic.dao.ActionRequest
import systems.vostok.humexp.pry.common.test.diagnostic.dao.ActionResponse

import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces

import static javax.ws.rs.core.MediaType.APPLICATION_JSON

@Path('api/v1/access')
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@CompileStatic
class AccessController {
    @POST
    @Path('T1_1__JaxRsJerseySyncTrnExchange')
    ActionResponse jaxRsJerseySyncTrnExchange(ActionRequest request) {
        new ActionResponse(
                correlationId: request.correlationId
        )
    }
}