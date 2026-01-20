package com.cblcontabil.cblcontabil.planodecontas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planodecontas")
public class PlanoDeContasController {

    private PlanoDeContasService planoDeContasService;

    public PlanoDeContasController(PlanoDeContasService planoDeContasService) {
        this.planoDeContasService = planoDeContasService;
    }

    @GetMapping
    public String boasVindas(){
        return "Boas vindas";
    }

    @PostMapping("/criar")
    public String criarContas(){
        return "Nova conta criada";
    }

    @GetMapping("/listar")
    public List<PlanoDeContasModel> listarConta(){
        return planoDeContasService.listarConta();
    }

    @GetMapping("/listaporid")
    public String listarContaPorCodigo(){
        return "Conta por id mostrada com sucesso";
    }

    @PutMapping("/alterarConta")
    public String alterarConta(){
        return "Sua conta foi alterada com sucesso";
    }

    @DeleteMapping("/deletarConta")
    public String deletarConta(){
        return "Deletado sua conta";
    }

}
