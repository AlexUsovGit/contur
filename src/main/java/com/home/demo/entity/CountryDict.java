package com.home.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author - Alexey Usov
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryDict {

    @Id
    private Long id;
    private String code;
    private String name;
    private Long population;
    @ManyToOne
    @JoinColumn(name = "CONTINENT_ID")
    private Continent continent;

}
