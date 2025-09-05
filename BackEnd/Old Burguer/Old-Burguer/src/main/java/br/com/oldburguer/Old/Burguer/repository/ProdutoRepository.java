package br.com.oldburguer.Old.Burguer.repository;

import br.com.oldburguer.Old.Burguer.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
