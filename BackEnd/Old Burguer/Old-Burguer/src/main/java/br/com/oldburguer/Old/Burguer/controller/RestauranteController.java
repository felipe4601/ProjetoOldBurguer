package br.com.oldburguer.Old.Burguer.controller;

import br.com.oldburguer.Old.Burguer.model.Restaurante;
import br.com.oldburguer.Old.Burguer.service.RestauranteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/restaurantes")
public class RestauranteController {
    // Criando constante, porque o service sempre será o mesmo
    // nunca mudará
    private final RestauranteService restauranteService;

    // Criando construtor para fazer a injeção de dependência
    public RestauranteController(RestauranteService service){
        // a nossa variável recebe o argumento para que
        // o controller dependa do service
        restauranteService = service;
    }

    // criando método para listar restaurante a partir do
    // método criado no service
    // mas aqui nós vamos usar o getMapping, que irá fazer a porta
    // de entrada para pegar os dados do banco
    @GetMapping
    //Vamos usar o tipo ResponseEntity, que é tipo de resposta para site
    public ResponseEntity<List<Restaurante>> listarRestaurante() {
        List<Restaurante> restaurantes = restauranteService.listarTodos();
        return ResponseEntity.ok().body(restaurantes);
    }
}
