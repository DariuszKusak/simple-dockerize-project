package com.kusak.dariusz.simpledockerizeproject.service;

import com.kusak.dariusz.simpledockerizeproject.entity.Producer;
import com.kusak.dariusz.simpledockerizeproject.repository.ProducerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final ProducerRepository producerRepository;

    public Producer createProducer(Producer producer) {
        return producerRepository.save(producer);
    }
}
