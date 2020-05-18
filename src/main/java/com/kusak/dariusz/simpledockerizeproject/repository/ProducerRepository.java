package com.kusak.dariusz.simpledockerizeproject.repository;

import com.kusak.dariusz.simpledockerizeproject.entity.Producer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducerRepository extends JpaRepository<Producer, Integer> {
}
