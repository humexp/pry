package systems.vostok.humexp.pry.provider.api.controller.v1

import groovy.transform.CompileStatic
import systems.vostok.humexp.pry.common.dao.domain.CommonRequest
import systems.vostok.humexp.pry.common.dao.domain.Transaction
import systems.vostok.humexp.pry.provider.service.DataProvider

import javax.inject.Inject
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces

import static javax.ws.rs.core.MediaType.APPLICATION_JSON

@Path('api/v1/jaxrs/data/')
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@CompileStatic
class DataJaxRsController {
    @Inject
    DataProvider dataProvider

    @POST
    @Path('transactions/all')
    List<Transaction> getTransactions(CommonRequest request) {
        dataProvider.getTransactions(request.properties.num as Integer)
    }
}
