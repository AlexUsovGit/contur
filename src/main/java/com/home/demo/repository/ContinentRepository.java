package com.home.demo.repository;

import com.home.demo.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author - Alexey Usov
 */
@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {

}
