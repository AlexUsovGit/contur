package com.home.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author - Alexey Usov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContinentCreateDTO {

    private String name;
    private Long area;

}
