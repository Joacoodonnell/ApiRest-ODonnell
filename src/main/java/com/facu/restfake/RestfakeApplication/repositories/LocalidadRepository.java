package com.facu.restfake.RestfakeApplication.repositories;

import com.facu.restfake.RestfakeApplication.entities.Localidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long> {

    @Query(value = "SELECT l FROM Locakidad l WHERE l.denominacion LIKE '%?1%'")
    List<Localidad> search(@Param("filtro") String filtro);

    @Query(value = "SELECT l FROM Localidad l WHERE l.denominacion LIKE '%?1%'")
    Page<Localidad> search(@Param("filtro") String filtro, Pageable pageable);
}
