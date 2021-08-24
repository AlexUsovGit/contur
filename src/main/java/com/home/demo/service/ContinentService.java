package com.home.demo.service;

import com.home.demo.dto.ContinentCreateDTO;

import java.util.List;

/**
 * @author - Alexey Usov
 */
public interface ContinentService {

    Long createContinent(ContinentCreateDTO dto);

    List<String> getAllContinentNames();

}
