package br.com.oldburguer.Old.Burguer.repository;

import br.com.oldburguer.Old.Burguer.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
