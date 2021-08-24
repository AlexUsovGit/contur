package com.home.demo.repository;

import com.home.demo.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author - Alexey Usov
 */
@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {

    @Query(nativeQuery = true, value = "Select distinct (name) as continent_Name from continent ")
    List<String> findAllContinentNames();

}
