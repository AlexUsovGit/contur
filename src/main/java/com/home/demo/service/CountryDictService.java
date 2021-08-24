package com.home.demo.service;

import com.home.demo.entity.CountryDict;

import java.util.List;

/**
 * @author - Alexey Usov
 */
public interface CountryDictService {

    List<CountryDict> findAllCountries();

    CountryDict findCountryById(Long id);

}
