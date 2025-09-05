package br.com.oldburguer.Old.Burguer.repository;


import br.com.oldburguer.Old.Burguer.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Anotação para que o spring entenda, que isso é um repository
@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Integer> {
}
