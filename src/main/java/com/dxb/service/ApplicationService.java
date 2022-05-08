package com.dxb.service;

import com.dxb.dto.ApplicationRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by santoshsharma on 07 May, 2022
 */

@Service
public class ApplicationService {

    private final KafkaTemplate<String, ApplicationRequest> appRequestKafkaTemplate;

    public ApplicationService(KafkaTemplate<String, ApplicationRequest> appRequestKafkaTemplate) {
        this.appRequestKafkaTemplate = appRequestKafkaTemplate;
    }

    public void saveStudentApplication(ApplicationRequest applicationRequest) {
        // TODO : Key can be identified based on specific bounded context
        appRequestKafkaTemplate.send("student-topic",
                "STUDENT-"+applicationRequest.getStudent().getStudentId().toString(),
                applicationRequest);
    }
}
