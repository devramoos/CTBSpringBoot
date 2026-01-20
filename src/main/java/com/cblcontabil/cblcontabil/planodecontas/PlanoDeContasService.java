package com.cblcontabil.cblcontabil.planodecontas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoDeContasService {

    private PlanoDeContasRepository planoDeContasRepository;

    public PlanoDeContasService(PlanoDeContasRepository planoDeContasRepository) {
        this.planoDeContasRepository = planoDeContasRepository;
    }

    public List<PlanoDeContasModel> listarConta(){
        return planoDeContasRepository.findAll();
    }
}
