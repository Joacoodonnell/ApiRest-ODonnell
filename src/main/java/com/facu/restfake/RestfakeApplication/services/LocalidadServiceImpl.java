package com.facu.restfake.RestfakeApplication.services;

import com.facu.restfake.RestfakeApplication.entities.Localidad;
import com.facu.restfake.RestfakeApplication.repositories.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    @Override
    public List<Localidad> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<Localidad> findALL(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public Localidad findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Localidad save(Localidad entity) throws Exception {
        return null;
    }

    @Override
    public Localidad update(Long aLong, Localidad entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
