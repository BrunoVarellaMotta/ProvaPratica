package com.provapratica.provapratica.repository;

import com.provapratica.provapratica.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
