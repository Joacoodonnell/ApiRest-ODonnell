package com.facu.restfake.RestfakeApplication.services;

import com.facu.restfake.RestfakeApplication.entities.Base;
import com.facu.restfake.RestfakeApplication.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public interface BaseService<E extends Base, ID extends Serializable> {
    public List<E> findAll() throws Exception;

    public Page<E> findALL(Pageable pageable) throws Exception;

    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}
