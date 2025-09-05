package br.com.oldburguer.Old.Burguer.repository;

import br.com.oldburguer.Old.Burguer.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
