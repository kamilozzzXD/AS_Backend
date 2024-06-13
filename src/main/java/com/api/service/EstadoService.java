package com.api.service;

import com.api.entity.Estado;
import com.api.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstadoService  {
    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> findAllByPais(Long id){
        List<Estado> estadosRespuesta=new ArrayList<>();
        List<Estado> estados=estadoRepository.findAll();
        for(int i=0;i<estados.size();i++){
            if(estados.get(i).getPais().getId()==id){
                estadosRespuesta.add(estados.get(i));
            }
        }
        return estadosRespuesta;
    }

    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    public List<Estado> findAll(Sort sort) {
        return estadoRepository.findAll(sort);
    }




}
