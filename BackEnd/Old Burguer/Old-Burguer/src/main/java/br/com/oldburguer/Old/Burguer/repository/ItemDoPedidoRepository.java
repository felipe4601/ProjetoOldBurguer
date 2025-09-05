package br.com.oldburguer.Old.Burguer.repository;

import br.com.oldburguer.Old.Burguer.model.ItemDoPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDoPedidoRepository extends JpaRepository<ItemDoPedido, Integer> {
}
