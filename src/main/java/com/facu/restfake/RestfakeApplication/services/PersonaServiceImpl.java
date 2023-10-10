package com.facu.restfake.RestfakeApplication.services;

import com.facu.restfake.RestfakeApplication.entities.Persona;
import com.facu.restfake.RestfakeApplication.repositories.BaseRepository;
import com.facu.restfake.RestfakeApplication.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> findAll() throws Exception {
        return null;
    }
}
