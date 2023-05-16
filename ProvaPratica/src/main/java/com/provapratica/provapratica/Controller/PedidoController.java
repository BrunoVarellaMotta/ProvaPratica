package com.provapratica.provapratica.Controller;

import com.provapratica.provapratica.entity.Pedido;
import com.provapratica.provapratica.entity.Produto;
import com.provapratica.provapratica.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping
    public List<Pedido> findAll(){
        List<Pedido> resultado = repository.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Pedido findById(@PathVariable Long id){
        Pedido resultado = repository.findById(id).get();
        return resultado;
    }

    @PostMapping
    public Pedido insert(@RequestBody Pedido pedido){
        Pedido resultado = repository.save(pedido);
        return resultado;
    }

    @PostMapping
    public Pedido insert(@RequestBody Pedido pedido, Produto produto, Produto qtdProduto){
        Pedido resultado = repository.save(pedido);
        return resultado;
    }
    
    @DeleteMapping
    public void delete(Pedido id){
        repository.delete(id);
    }

}
