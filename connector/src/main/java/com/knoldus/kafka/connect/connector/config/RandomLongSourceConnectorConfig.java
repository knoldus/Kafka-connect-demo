package com.knoldus.kafka.connect.connector.config;

import java.util.Map;
import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;

public class RandomLongSourceConnectorConfig extends AbstractConfig {

    public static final String API_URL_CONFIG = "api.url";
    private static final String API_URL_DOC = "API URL";

    public static final String TOPIC_CONFIG = "topic";
    private static final String TOPIC_DOC = "Topic to write to";

    public static final String SLEEP_CONFIG = "sleep.seconds";
    private static final String SLEEP_DOC = "Time in seconds that connector will wait until querying api again";

    public RandomLongSourceConnectorConfig(Map<?, ?> originals) {
        super(config(), originals);
    }

    public static ConfigDef config() {
        return new ConfigDef()
                .define(API_URL_CONFIG, ConfigDef.Type.STRING, ConfigDef.Importance.HIGH, API_URL_DOC)
                .define(TOPIC_CONFIG, ConfigDef.Type.STRING, ConfigDef.Importance.HIGH, TOPIC_DOC)
                .define(SLEEP_CONFIG, ConfigDef.Type.INT, 60, ConfigDef.Importance.MEDIUM, SLEEP_DOC);
    }
}
