package systems.vostok.humexp.pry.agent.sepa.util

import groovy.json.JsonSlurper

class Dataset {
    static Object getJsonDataset(String type, String name) {
        Dataset.getClass()
                .getResource("/dataset/${type}/${name}.json")
                .getText('UTF-8')
                .with { new JsonSlurper().parseText(it) }
    }

    static String getRawDataset(String type, String name) {
        Dataset.getClass()
                .getResource("/dataset/${type}/${name}")
                .getText('UTF-8')
    }
}

