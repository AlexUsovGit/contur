package com.home.demo.repository;

import com.home.demo.entity.CountryDict;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author - Alexey Usov
 */
public interface CountryDictRepository extends JpaRepository<CountryDict, Long> {

    CountryDict findAllById(Long id);
}
