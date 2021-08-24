package com.home.demo.service.impl;

import com.home.demo.dto.ContinentCreateDTO;
import com.home.demo.entity.Continent;
import com.home.demo.repository.ContinentRepository;
import com.home.demo.service.ContinentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author - Alexey Usov
 */
@Service
@RequiredArgsConstructor
public class ContinentServiceImpl implements ContinentService {

    @Autowired
    private ContinentRepository continentRepository;

    @Override
    public Long createContinent(ContinentCreateDTO dto){
        Continent continent =  new Continent();
        continent.setArea(dto.getArea());
        continent.setName(dto.getName());

       return continentRepository.save(continent).getId();

    }


}
