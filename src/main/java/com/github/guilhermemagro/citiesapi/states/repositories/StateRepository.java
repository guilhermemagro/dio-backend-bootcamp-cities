package com.github.guilhermemagro.citiesapi.states.repositories;

import com.github.guilhermemagro.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {}
