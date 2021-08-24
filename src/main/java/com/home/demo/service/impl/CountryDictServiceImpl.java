package com.home.demo.service.impl;

import com.home.demo.entity.CountryDict;
import com.home.demo.repository.CountryDictRepository;
import com.home.demo.service.CountryDictService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author - Alexey Usov
 */

@Service
@RequiredArgsConstructor
public class CountryDictServiceImpl implements CountryDictService {

    @Autowired
    private CountryDictRepository countryDictRepository;

    @Override
    public List<CountryDict> findAllCountries() {

        return countryDictRepository.findAll();
    }

    @Override
    public CountryDict findCountryById(Long id) {
        return countryDictRepository.findAllById(id);
    }
}
