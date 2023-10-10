package com.facu.restfake.RestfakeApplication.repositories;

import com.facu.restfake.RestfakeApplication.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
