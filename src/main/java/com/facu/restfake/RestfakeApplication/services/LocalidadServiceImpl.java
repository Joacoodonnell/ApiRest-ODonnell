package com.facu.restfake.RestfakeApplication.services;

import com.facu.restfake.RestfakeApplication.entities.Localidad;
import com.facu.restfake.RestfakeApplication.repositories.BaseRepository;
import com.facu.restfake.RestfakeApplication.repositories.LocalidadRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    private LocalidadRepository localidadRepository;
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


    @Override
    public List<Localidad> search(String filtro) throws Exception {

        try {
            List<Localidad> localidades = localidadRepository.search(filtro);
            return localidades;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public Page<Localidad> search(String filtro, Pageable pageable) throws Exception {

        try {
            Page<Localidad> localidades = localidadRepository.search(filtro, pageable);
            return localidades;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
