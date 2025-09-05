package br.com.oldburguer.Old.Burguer.service;

import br.com.oldburguer.Old.Burguer.model.Restaurante;
import br.com.oldburguer.Old.Burguer.repository.RestauranteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Anotação para avisar ao spring, que isso é service
@Service
public class RestauranteService {
    // Criando constante do tipo repository, pois o repository sempre será o mesmo:
    private final RestauranteRepository restauranteRepository;

    // Criando construtor para que o service, de fato dependa do repository
    public RestauranteService(RestauranteRepository repo){
        restauranteRepository = repo;
    }

    // Criando método para listar todos os restaurantes:
    public List<Restaurante> listarTodos(){
        return restauranteRepository.findAll();
    }
}
