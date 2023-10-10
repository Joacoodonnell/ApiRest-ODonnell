package com.facu.restfake.RestfakeApplication.repositories;

import com.facu.restfake.RestfakeApplication.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
