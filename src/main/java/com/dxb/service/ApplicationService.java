package com.dxb.service;

import com.dxb.configuration.KafkaTopicProperties;
import com.dxb.dto.ApplicationRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by santoshsharma on 07 May, 2022
 */

@Service
public class ApplicationService {

    private static final String STUDENT_KEY = "STUDENT-";
    private final KafkaTemplate<String, ApplicationRequest> appRequestKafkaTemplate;
    private final KafkaTopicProperties kafkaTopicProperties;

    public ApplicationService(KafkaTemplate<String, ApplicationRequest> appRequestKafkaTemplate, KafkaTopicProperties kafkaTopicProperties) {
        this.appRequestKafkaTemplate = appRequestKafkaTemplate;
        this.kafkaTopicProperties = kafkaTopicProperties;
    }

    public void saveStudentApplication(ApplicationRequest applicationRequest) {
        // TODO : Key can be identified based on specific bounded context
        appRequestKafkaTemplate.send(kafkaTopicProperties.getStudentTopic(),
                STUDENT_KEY + applicationRequest.getStudent().getStudentId().toString(),
                applicationRequest);
    }
}
