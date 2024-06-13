package com.api.service;

import com.api.entity.Pais;
import com.api.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {
    @Autowired
    private PaisRepository paisRepository;
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }


}
