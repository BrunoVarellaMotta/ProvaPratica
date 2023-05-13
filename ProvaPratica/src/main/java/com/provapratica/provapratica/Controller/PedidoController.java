package com.provapratica.provapratica.Controller;

import com.provapratica.provapratica.entity.Pedido;
import com.provapratica.provapratica.repository.PedidoRepository;
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

}
