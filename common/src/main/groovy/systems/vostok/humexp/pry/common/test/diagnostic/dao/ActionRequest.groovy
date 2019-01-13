package systems.vostok.humexp.pry.common.test.diagnostic.dao

import groovy.transform.Canonical
import groovy.transform.CompileStatic


@Canonical
@CompileStatic
class ActionRequest {
    UUID correlationId
    String path

}
