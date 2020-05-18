package com.kusak.dariusz.simpledockerizeproject.controller;

import com.kusak.dariusz.simpledockerizeproject.entity.Phone;
import com.kusak.dariusz.simpledockerizeproject.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/phone")
@RequiredArgsConstructor
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping
    public ResponseEntity<List<Phone>> getAllPhones() {
        return new ResponseEntity<>(phoneService.getAllPhones(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Phone> createPhone(@RequestBody Phone phone) {
        return new ResponseEntity<>(phoneService.createPhone(phone), HttpStatus.CREATED);
    }
}
