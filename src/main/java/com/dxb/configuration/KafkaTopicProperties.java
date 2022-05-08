package com.dxb.configuration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by santoshsharma on 08 May, 2022
 */

@Data
@Getter
@Setter
@ToString
@Component
@ConfigurationProperties(prefix = "kafka-topic")
public class KafkaTopicProperties {
    private String studentTopic;
}
