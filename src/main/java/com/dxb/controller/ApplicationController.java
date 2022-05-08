package com.dxb.controller;

import com.dxb.dto.ApplicationRequest;
import com.dxb.exception.BadRequestException;
import com.dxb.service.ApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by santoshsharma on 07 May, 2022
 */

@RestController
@Slf4j
@RequestMapping("/application")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveApplication(@RequestBody ApplicationRequest applicationRequest) {
        if(applicationRequest == null) {
            throw new BadRequestException("Request is not valid");
        }

        applicationService.saveStudentApplication(applicationRequest);

        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
    }
}
