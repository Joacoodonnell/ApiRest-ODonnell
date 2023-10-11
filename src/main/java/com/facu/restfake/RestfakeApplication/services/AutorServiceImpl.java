package com.facu.restfake.RestfakeApplication.services;

import com.facu.restfake.RestfakeApplication.entities.Autor;
import com.facu.restfake.RestfakeApplication.repositories.AutorRepository;
import com.facu.restfake.RestfakeApplication.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Autor> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Autor> search(String filtro) throws Exception {

        try {
            List<Autor> autores = autorRepository.search(filtro);
            return autores;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public Page<Autor> search(String filtro, Pageable pageable) throws Exception {

        try {
            Page<Autor> autores = autorRepository.search(filtro, pageable);
            return autores;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}