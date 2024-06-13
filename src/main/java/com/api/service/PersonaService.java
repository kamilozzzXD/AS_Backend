package com.api.service;

import com.api.entity.Persona;
import com.api.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }
    public void deleteById(Long aLong) {
        personaRepository.deleteById(aLong);
    }
    public void delete(Persona entity) {
        personaRepository.delete(entity);
    }
    public <S extends Persona> S save(S entity) {
        return personaRepository.save(entity);
    }

    public Optional<Persona> findById(Long id){
        return personaRepository.findById(id);
    }










}
