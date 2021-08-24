package com.home.demo;

import com.home.demo.entity.Continent;
import com.home.demo.entity.CountryDict;
import com.home.demo.repository.CountryDictRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    CountryDictRepository countryDictRepository;

    @Test
    void createCountry() {
        countryDictRepository.save(new CountryDict(1L, "036", "Albania", 50L, new Continent(1L, "Africa", 150L)));
    }


    @Test
    void getAllRecords() {
        List<CountryDict> countryDictList = countryDictRepository.findAll();
        assertFalse(countryDictList.isEmpty());

    }
}
