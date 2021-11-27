package com.github.guilhermemagro.citiesapi.countries.repositories;

import com.github.guilhermemagro.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
