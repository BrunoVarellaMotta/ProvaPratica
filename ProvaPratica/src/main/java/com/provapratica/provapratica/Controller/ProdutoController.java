package com.provapratica.provapratica.Controller;

import com.provapratica.provapratica.entity.Produto;
import com.provapratica.provapratica.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> findAll(){
        List<Produto> resultado = repository.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Produto findById(@PathVariable Long id){
        Produto resultado = repository.findById(id).get();
        return resultado;
    }

    @PostMapping
    public Produto insert(@RequestBody Produto produto){
        Produto resultado = repository.save(produto);
        return resultado;
    }

}
