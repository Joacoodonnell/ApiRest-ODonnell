package com.facu.restfake.RestfakeApplication.repositories;

import com.facu.restfake.RestfakeApplication.entities.Autor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {

    @Query(value = "SELECT a FROM Autor a WHERE a.nombre LIKE '%?1%' OR a.apellido LIKE '%?1%'")
    List<Autor> search(@Param("filtro") String filtro);

    @Query(value = "SELECT a FROM Autor a WHERE a.nombre LIKE '%?1%' OR a.apellido LIKE '%?1%'")
    Page<Autor> search(@Param("filtro") String filtro, Pageable pageable);
}
