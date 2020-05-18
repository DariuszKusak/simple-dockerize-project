package com.kusak.dariusz.simpledockerizeproject.service;

import com.kusak.dariusz.simpledockerizeproject.entity.Phone;
import com.kusak.dariusz.simpledockerizeproject.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneService {

    private final PhoneRepository phoneRepository;

    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }

    public Phone createPhone(Phone phone) {
        return phoneRepository.save(phone);
    }
}
