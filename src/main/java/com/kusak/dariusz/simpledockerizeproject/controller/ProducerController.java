package com.kusak.dariusz.simpledockerizeproject.controller;

import com.kusak.dariusz.simpledockerizeproject.entity.Producer;
import com.kusak.dariusz.simpledockerizeproject.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/producer")
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping
    public ResponseEntity<Producer> createProducer(@RequestBody Producer producer) {
        return new ResponseEntity<>(producerService.createProducer(producer), HttpStatus.CREATED);
    }

}
