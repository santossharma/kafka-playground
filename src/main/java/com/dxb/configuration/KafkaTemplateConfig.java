package com.dxb.configuration;

import com.dxb.dto.ApplicationRequest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by santoshsharma on 07 May, 2022
 */

@Component
@EnableKafka
public class KafkaTemplateConfig {

    @Bean
    @Qualifier("processNSDResponseKafkaTemplate")
    KafkaTemplate<String, String> processNSDResponseKafkaTemplate(
            KafkaPlaygroundProducerFactory<String> vipKafkaProducerFactory) {
        return new KafkaTemplate<>(vipKafkaProducerFactory.producerFactory());
    }

    @Bean
    @Qualifier("appRequestKafkaTemplate")
    KafkaTemplate<String, ApplicationRequest> appRequestKafkaTemplate(
            KafkaPlaygroundProducerFactory<ApplicationRequest> vipKafkaProducerFactory) {
        return new KafkaTemplate<>(vipKafkaProducerFactory.producerFactory());
    }

}
