package org.example

import spock.lang.Specification

import java.time.*

class UtilsTest extends Specification {
    def "handledates"() {
        given:
        ZonedDateTime from = ZonedDateTime.of(LocalDate.of(2024, 7, 1).atStartOfDay(), ZoneId.systemDefault())
        ZonedDateTime to = ZonedDateTime.of(LocalDate.of(2024, 7, 5).atStartOfDay(), ZoneId.systemDefault())

        when:
        def datePairs = Utils.handledates(from, to)

        then:
        datePairs.size() == 4
    }
}
