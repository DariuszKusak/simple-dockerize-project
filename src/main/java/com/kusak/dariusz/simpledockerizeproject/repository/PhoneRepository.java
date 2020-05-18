package com.kusak.dariusz.simpledockerizeproject.repository;

import com.kusak.dariusz.simpledockerizeproject.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> {
}
