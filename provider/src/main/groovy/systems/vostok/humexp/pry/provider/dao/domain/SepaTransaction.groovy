package systems.vostok.humexp.pry.provider.dao.domain

import groovy.transform.Canonical
import groovy.transform.CompileStatic

@Canonical
@CompileStatic
class SepaTransaction {
    UUID id
    String content
}
