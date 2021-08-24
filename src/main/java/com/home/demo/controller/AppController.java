package com.home.demo.controller;

import com.home.demo.dto.ContinentCreateDTO;
import com.home.demo.entity.CountryDict;
import com.home.demo.service.ContinentService;
import com.home.demo.service.CountryDictService;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author - Alexey Usov
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("app")
@Tag(name = "Demo controller", description = "Демо контроллер")
public class AppController {

    private final CountryDictService countryDictService;
    private final ContinentService continentService;

    @GetMapping
    @Schema(description = "Получить список всех стран")
    public List<CountryDict> getAllCountries() {
        return countryDictService.findAllCountries();
    }

    @GetMapping("{id}")
    @Schema(description = "Получить страну по id")
    public CountryDict getAllCountries(@PathVariable Long id) {
        return countryDictService.findCountryById(id);
    }

    @PostMapping("add/continent")
    @Schema(description = "Добавить континент")
    public Long getAllCountries(@RequestBody ContinentCreateDTO dto) {
        return continentService.createContinent(dto);
    }

}
